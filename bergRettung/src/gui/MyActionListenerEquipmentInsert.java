
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Equipment;
import bergrettung.EquipmentVerwaltung;

public class MyActionListenerEquipmentInsert implements ActionListener{
    private final EquipmentVerwaltung equVerw;
    private final EquipmentView equView;
    Equipment equipment;
    
    public MyActionListenerEquipmentInsert(EquipmentVerwaltung equVerw, EquipmentView equView){
        this.equVerw=equVerw;
        this.equView=equView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Inserted!");
        equipment = new Equipment(equView.getBezeichnungText(), equView.getIdText());
        equVerw.insertEquipment(equipment);
    }
}
