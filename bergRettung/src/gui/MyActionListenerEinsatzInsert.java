package gui;

import bergrettung.EinsatzVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerEinsatzInsert implements ActionListener {

    private EinsatzView view;
    private EinsatzVerwaltung verw;

    public MyActionListenerEinsatzInsert(EinsatzView view, EinsatzVerwaltung verw) {
        this.view = view;
        this.verw = verw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
