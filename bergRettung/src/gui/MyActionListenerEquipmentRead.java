package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.EquipmentVerwaltung;
import java.awt.Color;

public class MyActionListenerEquipmentRead implements ActionListener {

    private final EquipmentVerwaltung equVerw;
    private final EquipmentView equView;

    public MyActionListenerEquipmentRead(EquipmentVerwaltung equVerw, EquipmentView equView) {
        this.equVerw = equVerw;
        this.equView = equView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (equView.getIdText() > 0 && equVerw.readEquipment(equView.getIdText()) != null) {
            new ResultView("Ausgabe").setResultView(equVerw.readEquipment(equView.getIdText()).toString());
            equView.getIdField().setBackground(Color.WHITE);
            equView.getBezeichnungField().setBackground(Color.white);
        }else{
            equView.getIdField().setBackground(Color.red);
        }
    }
}
