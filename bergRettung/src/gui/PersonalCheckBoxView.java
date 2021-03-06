package gui;

import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.GridLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class PersonalCheckBoxView extends JFrame{
    private final PersonalVerwaltung persVerw;
    private final EinsatzView einView;
    
    private List<JCheckBox> boxen;
    private JCheckBox persBox;
    private JButton bestaetigen;
    private MyActionListenerPersonalCheckBoxBestaetigen listenerBestaetigen;
   
    
    public PersonalCheckBoxView(String titel, EinsatzView view){
        super(titel);
        
        URL iconURL = getClass().getResource("/images/personal.png");
        ImageIcon icon = new ImageIcon(iconURL);        
        this.setIconImage(icon.getImage());
        
        persVerw = new PersonalVerwaltung();
        this.einView=view;
        
        init();
    }

    private void init() {
        this.setLayout(new GridLayout(persVerw.readAll().size()+1,1));
        
        boxen = new ArrayList<>();
        List<Personal> personal = persVerw.readAll();
        
        for(int i = 0; i < personal.size(); i++){
            persBox = new JCheckBox(personal.get(i).getNachname() + ", " + personal.get(i).getQualifikation() + " ; " + personal.get(i).getId());
            this.add(persBox);
            boxen.add(persBox);
        }
        
        bestaetigen = new JButton("Bestätigen");
        listenerBestaetigen = new MyActionListenerPersonalCheckBoxBestaetigen(this, einView);
        
        this.add(bestaetigen);
        bestaetigen.addActionListener(listenerBestaetigen);
        this.setLocation(685,200);
        this.setSize(435,40*persVerw.readAll().size());
        this.setVisible(true);
    }

    public List<JCheckBox> getBoxen() {
        return boxen;
    }
    
}
