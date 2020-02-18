
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import bergrettung.EquipmentVerwaltung;

public class EquipmentView extends JFrame{
    private EquipmentVerwaltung equVerw;
    
    public EquipmentView(String titel, EquipmentVerwaltung equVerw){
        super(titel);
        this.equVerw=equVerw;
        init();
    }
    
    public void init(){
        this.setLayout(new FlowLayout());
        this.setLocation(400,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
}
