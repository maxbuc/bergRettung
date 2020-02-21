package gui;

import bergrettung.Equipment;
import bergrettung.EquipmentVerwaltung;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
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
        equVerw = new EquipmentVerwaltung();
        this.einView=view;
        
        init();
    }

    private void init() {
        this.setLayout(new FlowLayout());
        
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
        this.setSize(435,220);
        this.setVisible(true);
    }

    public List<JCheckBox> getBoxen() {
        return boxen;
    }
    
    
    
}
