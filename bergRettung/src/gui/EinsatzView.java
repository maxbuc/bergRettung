package gui;

import javax.swing.JFrame;
import bergrettung.EinsatzVerwaltung;
import bergrettung.Equipment;
import bergrettung.Patient;
import bergrettung.Personal;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public final class EinsatzView extends JFrame {

    private final EinsatzVerwaltung einVerw;
    private JLabel labelId;
    private JLabel labelDatum;
    private JLabel labelOrt;
    private JLabel labelStichwort;

    private JTextField textId;
    private JTextField textDatum;
    private JTextField textOrt;
    private JTextField textStichwort;

    private JButton insert;
    private JButton read;
    private JButton personalChoice;
    private JButton equipmentChoice;
    private JButton patientAdd;

    private MyActionListenerEinsatzInsert listenerInsert;
    private MyActionListenerEinsatzRead listenerRead;
    private MyActionListenerPersonalChoice listenerPersonalChoice;
    private MyActionListenerEquipmentChoice listenerEquipmentChoice;
    private MyActionListenerPatientAdd listenerPatientAdd;

    private FocusListener focusListener;
    
    private List<Personal> personalList;
    private List<Equipment> equipmentList;
    private List<Patient> patientList;

    public EinsatzView(String titel, EinsatzVerwaltung einVerw) {
        super(titel);

        URL iconURL = getClass().getResource("/images/einsatz.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());

        this.einVerw = einVerw;
        personalList = new ArrayList<>();
        equipmentList = new ArrayList<>();
        patientList = new ArrayList<>();

        init();
    }

    public void init() {
        this.setLayout(new GridLayout(7,2));

        labelId = new JLabel("ID: ");
        textId = new JTextField(Integer.toString(einVerw.getNextFree()), ALLBITS);
        labelDatum = new JLabel("Datum: ");
        textDatum = new JTextField("yyyy-mm-dd",ALLBITS);
        labelOrt = new JLabel("Ort: ");
        textOrt = new JTextField(ALLBITS);
        labelStichwort = new JLabel("Stichwort: ");
        textStichwort = new JTextField(28);
        insert = new JButton("Einfügen");
        read = new JButton("Ausgeben");
        personalChoice = new JButton("Personal auswählen");
        equipmentChoice = new JButton("Equipment auswählen");
        patientAdd = new JButton("Patient hinzufügen");

        listenerInsert = new MyActionListenerEinsatzInsert(this, einVerw);
        listenerRead = new MyActionListenerEinsatzRead(this, einVerw);
        listenerPersonalChoice = new MyActionListenerPersonalChoice(this, einVerw);
        listenerEquipmentChoice = new MyActionListenerEquipmentChoice(this, einVerw);
        listenerPatientAdd = new MyActionListenerPatientAdd(this);

        focusListener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textDatum.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                
            }
        };
        
        this.add(labelId);
        this.add(textId);
        this.add(labelDatum);
        this.add(textDatum);
        this.add(labelOrt);
        this.add(textOrt);
        this.add(labelStichwort);
        this.add(textStichwort);
        this.add(insert);
        this.add(read);
        this.add(personalChoice);
        this.add(equipmentChoice);
        this.add(patientAdd);

        insert.addActionListener(listenerInsert);
        read.addActionListener(listenerRead);
        personalChoice.addActionListener(listenerPersonalChoice);
        equipmentChoice.addActionListener(listenerEquipmentChoice);
        patientAdd.addActionListener(listenerPatientAdd);

        textDatum.addFocusListener(focusListener);
        
        insert.setForeground(Color.BLACK);
        read.setForeground(Color.BLACK);
        personalChoice.setForeground(Color.BLACK);
        equipmentChoice.setForeground(Color.BLACK);
        patientAdd.setForeground(Color.BLACK);

        this.setLocation(685, 200);
        this.setSize(435, 220);
        this.setVisible(true);
    }

    public int getTextId() {
        int result = 0;
        if (textId.getText().isEmpty()) {
            return result;
        }
        String text = textId.getText();
        try {
            result = Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            return 0;
        }
        return result;
    }

    public String getTextDatum() {
        return textDatum.getText();
    }

    public String getTextOrt() {
        return textOrt.getText();
    }

    public String getTextStichwort() {
        return textStichwort.getText();
    }

    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public void addPatientList(Patient p) {
        this.patientList.add(p);
    }

    public void deletePersListener() {
        personalChoice.removeActionListener(listenerPersonalChoice);
        personalChoice.setText("Personal ausgewählt");
    }

    public void deleteEquListener() {
        equipmentChoice.removeActionListener(listenerEquipmentChoice);
        equipmentChoice.setText("Equipment ausgewählt");
    }

    public JTextField getDatumField() {
        return textDatum;
    }

    public JTextField getOrtField() {
        return textOrt;
    }

    public JTextField getIdField() {
        return textId;
    }

    public JTextField getStichwortField() {
        return textStichwort;
    }

}
