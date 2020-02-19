package gui;

import bergrettung.EinsatzVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerEinsatzRead implements ActionListener {

    private EinsatzView view;
    private EinsatzVerwaltung verw;

    public MyActionListenerEinsatzRead(EinsatzView view, EinsatzVerwaltung verw) {
        this.view = view;
        this.verw = verw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int id = view.getTextId();
        new ResultView("Ausgabe", verw).setResultView(verw.readEinsatz(id).toString());
    }

}
