
package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import bergrettung.PatientVerwaltung;
import bergrettung.PersonalVerwaltung;
import bergrettung.EquipmentVerwaltung;
import bergrettung.EinsatzVerwaltung;
import java.awt.FlowLayout;
        

public final class MainView extends JFrame{
    private JButton patient;
    private JButton personal;
    private JButton einsatz;
    private JButton equipment;
    private final PatientVerwaltung patVerw;
    private final EquipmentVerwaltung equVerw;
    private final PersonalVerwaltung persVerw;
    private final EinsatzVerwaltung einVerw;
    
    public MainView(String titel) {
        super(titel);
        this.einVerw=new EinsatzVerwaltung();
        this.equVerw=new EquipmentVerwaltung();
        this.patVerw=new PatientVerwaltung();
        this.persVerw=new PersonalVerwaltung();
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
        einsatz.setForeground(Color.BLACK);
        equipment.setForeground(Color.BLACK);
        patient.setForeground(Color.BLACK);
        personal.setForeground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500,200);
        this.setSize(850,220);
        this.setVisible(true);
    }
}
