package gui;

import bergrettung.EinsatzVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerEinsatzRead implements ActionListener {

    private final EinsatzView view;
    private final EinsatzVerwaltung einVerw;

    public MyActionListenerEinsatzRead(EinsatzView view, EinsatzVerwaltung verw) {
        this.view = view;
        this.einVerw = verw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ResultView("Ausgabe").setResultView(einVerw.readEinsatz(view.getTextId()).toString());
    }

}
