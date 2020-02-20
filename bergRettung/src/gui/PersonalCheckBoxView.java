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
    private EinsatzView einView;
    
    private List<JCheckBox> boxen;
    private JCheckBox persBox;
    private JButton bestaetigen;
    private MyActionListenerPersonalCheckBoxBestaetigen listenerBestaetigen;
   
    
    public PersonalCheckBoxView(String titel, EinsatzView view){
        super(titel);
        persVerw = new PersonalVerwaltung();
        this.einView=view;
        
        init();
    }

    private void init() {
        this.setLayout(new FlowLayout());
        
        boxen = new ArrayList<>();
        
        for(int i = 1; i <= persVerw.readAll().size(); i++){
            persBox = new JCheckBox(persVerw.read(i).getNachname() + "; " + persVerw.read(i).getId());
            this.add(persBox);
            boxen.add(persBox);
        }
        
                
        
        bestaetigen = new JButton("Bestätigen");
        listenerBestaetigen = new MyActionListenerPersonalCheckBoxBestaetigen(this, einView);
        
        this.add(bestaetigen);
        bestaetigen.addActionListener(listenerBestaetigen);
        
        
        
        
   
        
        
        
        
        
        this.setLocation(685,200);
        this.setSize(435,220);
        this.setVisible(true);
    }

    public List<JCheckBox> getBoxen() {
        return boxen;
    }
    
    
    
}
