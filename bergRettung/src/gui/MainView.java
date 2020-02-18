
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import bergrettung.PatientVerwaltung;
import bergrettung.PersonalVerwaltung;
import bergrettung.EquipmentVerwaltung;
import bergrettung.EinsatzVerwaltung;
        

public class MainView extends JFrame{
    private JButton patient;
    private JButton personal;
    private JButton einsatz;
    private JButton equipment;
    private PatientVerwaltung patVerw;
    private EquipmentVerwaltung equVerw;
    private PersonalVerwaltung persVerw;
    private EinsatzVerwaltung einVerw;
    
    public MainView(String titel, PatientVerwaltung patVerw) {
        super(titel);
        this.patVerw=patVerw;
        init();
    }
   
    public void init(){
        MyActionListenerPatientView listenerPatientView = new MyActionListenerPatientView(patVerw,this);
        MyActionListenerEquipmentView listenerEquipmentView = new MyActionListenerEquipmentView(equVerw,this);
        MyActionListenerPersonalView listenerPersonalView = new MyActionListenerPersonalView(persVerw,this);
        MyActionListenerEinsatzView listenerEinsatzView = new MyActionListenerEinsatzView(einVerw,this);
        this.setLayout(new FlowLayout());
        patient = new JButton("Patient");
        patient.addActionListener(listenerPatientView);
        personal = new JButton("Personal");
        personal.addActionListener(listenerPersonalView);
        einsatz= new JButton("Einsatz");
        einsatz.addActionListener(listenerEinsatzView);
        equipment = new JButton("Equipment");
        equipment.addActionListener(listenerEquipmentView);
        add(einsatz);
        add(equipment);
        add(patient);
        add(personal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
}
