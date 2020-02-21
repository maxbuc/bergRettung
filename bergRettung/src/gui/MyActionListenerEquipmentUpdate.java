
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Equipment;
import bergrettung.EquipmentVerwaltung;

public class MyActionListenerEquipmentUpdate implements ActionListener{
    private final EquipmentVerwaltung equVerw;
    private final EquipmentView equView;
    Equipment equipment;
    
    public MyActionListenerEquipmentUpdate(EquipmentVerwaltung equVerw, EquipmentView equView){
        this.equVerw=equVerw;
        this.equView=equView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        equipment = new Equipment(equView.getBezeichnungText(),equView.getIdText());
        equVerw.updateEquipment(equipment);
        equView.dispose();
    }
}
