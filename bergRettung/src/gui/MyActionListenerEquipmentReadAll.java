
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.EquipmentVerwaltung;

public class MyActionListenerEquipmentReadAll implements ActionListener{
    private final EquipmentVerwaltung equVerw;
    private final EquipmentView equView;
    
    public MyActionListenerEquipmentReadAll(EquipmentVerwaltung equVerw, EquipmentView equView){
        this.equVerw=equVerw;
        this.equView=equView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println(equVerw.readAll().toString());
    }
}
