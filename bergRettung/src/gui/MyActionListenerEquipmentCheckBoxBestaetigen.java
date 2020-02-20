package gui;

import bergrettung.Equipment;
import bergrettung.EquipmentVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MyActionListenerEquipmentCheckBoxBestaetigen implements ActionListener {

    private EquipmentCheckBoxView view;
    private EinsatzView einView;
    private EquipmentVerwaltung equVerw;

    public MyActionListenerEquipmentCheckBoxBestaetigen(EquipmentCheckBoxView view, EinsatzView einView) {
        this.view = view;
        this.einView = einView;
        this.equVerw = new EquipmentVerwaltung();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<Equipment> equipment = new ArrayList<>();
        for(int i = 0; i < view.getBoxen().size(); i++){
            if(view.getBoxen().get(i).isSelected()){
                String[] split = view.getBoxen().get(i).getText().split("; ");
                equipment.add(equVerw.readEquipment(Integer.parseInt(split[1])));
                System.out.println(equVerw.readEquipment(Integer.parseInt(split[1])));
                
            }
        }
        einView.setEquipmentList(equipment);
        einView.deleteEquListener();
        view.dispose();
        
    }

}
