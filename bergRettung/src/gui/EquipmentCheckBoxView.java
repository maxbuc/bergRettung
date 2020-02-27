package gui;

import bergrettung.Equipment;
import bergrettung.EquipmentVerwaltung;
import java.awt.GridLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class EquipmentCheckBoxView extends JFrame{
    private final EquipmentVerwaltung equVerw;
    private final EinsatzView einView;
    
    private List<JCheckBox> boxen;
    private JCheckBox equBox;
    private JButton bestaetigen;
    private MyActionListenerEquipmentCheckBoxBestaetigen listenerBestaetigen;
   
    
    public EquipmentCheckBoxView(String titel, EinsatzView view){
        super(titel);
        
        URL iconURL = getClass().getResource("/images/werkzeug.png");
        ImageIcon icon = new ImageIcon(iconURL);        
        this.setIconImage(icon.getImage());
        
        equVerw = new EquipmentVerwaltung();
        this.einView=view;
        
        init();
    }

    private void init() {
        this.setLayout(new GridLayout(equVerw.readAll().size()+1,1));
        
        boxen = new ArrayList<>();
        
        List<Equipment> equipment = equVerw.readAll();
        
        for(int i = 0; i < equipment.size(); i++){
            equBox = new JCheckBox(equipment.get(i).getBezeichnung() + "; " + equipment.get(i).getId());
            this.add(equBox);
            boxen.add(equBox);
        }

        bestaetigen = new JButton("Bestätigen");
        listenerBestaetigen = new MyActionListenerEquipmentCheckBoxBestaetigen(this, einView);
        
        this.add(bestaetigen);
        bestaetigen.addActionListener(listenerBestaetigen);
        
        this.setLocation(685,200);
        this.setSize(435,40*equVerw.readAll().size());
        this.setVisible(true);
    }

    public List<JCheckBox> getBoxen() {
        return boxen;
    }
    
    
    
}
