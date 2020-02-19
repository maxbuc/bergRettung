
package gui;

import bergrettung.PatientVerwaltung;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PatientView extends JFrame{
    private PatientVerwaltung patVerw;
    private JButton insert;
    private JButton read;
    private JButton readAll;
    private JButton update;
    private JLabel nachnameLabel;
    private JLabel vornameLabel;
    private JLabel idLabel;
    private JTextField nachnameText;
    private JTextField vornameText;
    private JTextField idText;
    
    public PatientView(String titel, PatientVerwaltung patVerw){
        super(titel);
        this.patVerw=patVerw;
        init();
    }
    
    public void init(){
        MyActionListenerPatientInsert listenerInsert = new MyActionListenerPatientInsert(patVerw,this);
        MyActionListenerPatientUpdate listenerUpdate = new MyActionListenerPatientUpdate(patVerw,this);
        MyActionListenerPatientRead listenerRead = new MyActionListenerPatientRead(patVerw,this);
        MyActionListenerPatientReadAll listenerReadAll = new MyActionListenerPatientReadAll(patVerw,this);
        insert = new JButton ("Insert");
        update = new JButton ("Update");
        read = new JButton ("Read");
        readAll = new JButton ("ReadAll");
        idLabel = new JLabel ("ID: ");
        nachnameLabel= new JLabel("Nachname: ");
        vornameLabel = new JLabel ("Vorname: ");
        idText = new JTextField ("ID eingeben", ALLBITS);
        nachnameText = new JTextField ("Nachname eingeben",ALLBITS);
        vornameText = new JTextField ("Vorname eingeben",ALLBITS);
        add(nachnameLabel);
        add(nachnameText);
        add(vornameLabel);
        add(vornameText);
        add(idLabel);
        add(idText);
        add(insert);
        add(update);
        add(read);
        add(readAll);
        insert.addActionListener(listenerInsert);
        update.addActionListener(listenerUpdate);
        read.addActionListener(listenerRead);
        readAll.addActionListener(listenerReadAll);
        this.setLayout(new FlowLayout());
        this.setLocation(400,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
    
    public String getVornameText() {
        return vornameText.getText();
    }

    public String getNachnameText() {
        return nachnameText.getText();
    }
    
    public int getIdText() {
        String text=idText.getText();
        int result = Integer.parseInt(text);
        return result;
    }
}
