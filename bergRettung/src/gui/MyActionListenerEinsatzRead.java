package gui;

import bergrettung.EinsatzVerwaltung;
import java.awt.Color;
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
        if (view.getTextId() > 0 && einVerw.readEinsatz(view.getTextId()) != null) {
            new ResultView("Ausgabe").setResultView(einVerw.readEinsatz(view.getTextId()).toString());
            view.getIdField().setBackground(Color.WHITE);
            view.getDatumField().setBackground(Color.white);
            view.getStichwortField().setBackground(Color.white);
            view.getOrtField().setBackground(Color.white);
        }else{
            view.getIdField().setBackground(Color.red);
            view.getDatumField().setBackground(Color.white);
            view.getStichwortField().setBackground(Color.white);
            view.getOrtField().setBackground(Color.white);
        }
    }

}
