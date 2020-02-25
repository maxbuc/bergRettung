
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Equipment;
import bergrettung.EquipmentVerwaltung;
import java.awt.Color;

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
        if(equView.getIdText()>0 && !equView.getBezeichnungText().isEmpty() && equVerw.readEquipment(equView.getIdText())==null){
        equipment = new Equipment(equView.getBezeichnungText(), equView.getIdText());
        equVerw.insertEquipment(equipment);
        equView.dispose();
        }else{
            if(equView.getIdText()<1 || equVerw.readEquipment(equView.getIdText())!=null){
                equView.getIdField().setBackground(Color.red);
            }else{
                equView.getIdField().setBackground(Color.WHITE);
            }
            if(equView.getBezeichnungText().isEmpty()){
                equView.getBezeichnungField().setBackground(Color.red);
            }else{
                equView.getBezeichnungField().setBackground(Color.WHITE);
            }
        }
    }
}
