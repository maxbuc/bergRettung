
package gui;

import bergrettung.PatientVerwaltung;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class PatientView extends JFrame{
    private PatientVerwaltung patVerw;
    public PatientView(String titel, PatientVerwaltung patVerw){
        super(titel);
        this.patVerw=patVerw;
        init();
    }
    
    
    
    public void init(){
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
}
