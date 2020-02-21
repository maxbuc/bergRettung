package gui;

import bergrettung.EinsatzVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerPersonalChoice implements ActionListener {

    private final EinsatzView view;
    private final EinsatzVerwaltung einVerw;

    public MyActionListenerPersonalChoice(EinsatzView view, EinsatzVerwaltung verw) {
        this.view = view;
        this.einVerw = verw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PersonalCheckBoxView personalCheckBoxView = new PersonalCheckBoxView("Personalauswahl", view);
    }

}
