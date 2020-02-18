
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.EquipmentVerwaltung;
import bergrettung.Equipment;


public class MyActionListenerEquipmentView implements ActionListener{
    private final EquipmentVerwaltung equVerw;
    private final MainView view;
    Equipment equip;

    public MyActionListenerEquipmentView(EquipmentVerwaltung equVerw, MainView view) {
        this.equVerw = equVerw;
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        EquipmentView equipmentView = new EquipmentView("Equipment",equVerw);
    }
}
