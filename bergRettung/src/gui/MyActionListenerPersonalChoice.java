package gui;

import bergrettung.Einsatz;
import bergrettung.EinsatzVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerPersonalChoice implements ActionListener {

    private EinsatzView view;
    private EinsatzVerwaltung einVerw;
    private Einsatz einsatz;

    public MyActionListenerPersonalChoice(EinsatzView view, EinsatzVerwaltung verw) {
        this.view = view;
        this.einVerw = verw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new PersonalCheckBoxView("Personalauswahl");
    }

}
