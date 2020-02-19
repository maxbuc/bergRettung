package gui;

import bergrettung.EinsatzVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerEinsatzRead implements ActionListener {

    private EinsatzView view;
    private EinsatzVerwaltung einVerw;

    public MyActionListenerEinsatzRead(EinsatzView view, EinsatzVerwaltung verw) {
        this.view = view;
        this.einVerw = verw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ResultView("Ausgabe", einVerw).setResultView(einVerw.readEinsatz(view.getTextId()).toString());
    }

}
