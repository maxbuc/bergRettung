package gui;

import bergrettung.EinsatzVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerEquipmentChoice implements ActionListener {

    private final EinsatzView view;
    private final EinsatzVerwaltung einVerw;

    public MyActionListenerEquipmentChoice(EinsatzView view, EinsatzVerwaltung verw) {
        this.view = view;
        this.einVerw = verw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        EquipmentCheckBoxView equipmentCheckBoxView = new EquipmentCheckBoxView("Equipmentauswahl", view);
    }

}
