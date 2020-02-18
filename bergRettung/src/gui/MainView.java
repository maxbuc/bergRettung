
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import bergrettung.PatientVerwaltung;

public class MainView extends JFrame{
    private JButton patient;
    private JButton personal;
    private JButton einsatz;
    private JButton equipment;
    private PatientVerwaltung patVerw;
    
    public MainView(String titel, PatientVerwaltung patVerw) {
        super(titel);
        this.patVerw=patVerw;
        init();
    }
   
    public void init(){
        MyActionListenerPatientView listenerPatientView = new MyActionListenerPatientView(patVerw,this);
        this.setLayout(new FlowLayout());
        patient = new JButton("Patient");
        patient.addActionListener(listenerPatientView);
        personal = new JButton("Personal");
        einsatz= new JButton("Einsatz");
        equipment = new JButton("Equipment");
        add(equipment);
        add(patient);
        add(personal);
        add(einsatz);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
}
