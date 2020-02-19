package gui;

import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class PersonalCheckBoxView extends JFrame{
    private PersonalVerwaltung persVerw;
    
    List<JCheckBox> boxen;
    private JCheckBox persBox;
    private JButton bestaetigen;
    private MyActionListenerPersonalCheckBoxBestaetigen listenerBestaetigen;
   
    
    public PersonalCheckBoxView(String titel){
        super(titel);
        persVerw = new PersonalVerwaltung();
        
        init();
    }

    private void init() {
        this.setLayout(new FlowLayout());
        
        boxen = new ArrayList<>();
        
        for(int i = 1; i <= persVerw.readAll().size(); i++){
            persBox = new JCheckBox(persVerw.read(i).getNachname());
            this.add(persBox);
            boxen.add(persBox);
        }
        
                
        
        bestaetigen = new JButton("Bestätigen");
        listenerBestaetigen = new MyActionListenerPersonalCheckBoxBestaetigen(this);
        
        this.add(bestaetigen);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        this.setLocation(500,200);
        this.setSize(850,200);
        this.setVisible(true);
    }

    public List<JCheckBox> getBoxen() {
        return boxen;
    }
    
    
    
}
