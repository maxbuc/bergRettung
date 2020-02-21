package gui;

import bergrettung.Einsatz;
import bergrettung.EinsatzVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerEinsatzInsert implements ActionListener {

    private final EinsatzView view;
    private final EinsatzVerwaltung einVerw;
    private Einsatz einsatz;

    public MyActionListenerEinsatzInsert(EinsatzView view, EinsatzVerwaltung verw) {
        this.view = view;
        this.einVerw = verw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        einsatz = new Einsatz(view.getTextId(), view.getTextDatum(), view.getTextOrt(), view.getTextStichwort());
        einsatz.setPersonal(view.getPersonalList());
        einsatz.setEquipment(view.getEquipmentList());
        einsatz.setPatienten(view.getPatientList());
        einVerw.insertEinsatz(einsatz);
        
        view.dispose();
    }

}
