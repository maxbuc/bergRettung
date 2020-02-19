package gui;

import bergrettung.Einsatz;
import bergrettung.EinsatzVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerPersonalCheckBoxBestaetigen implements ActionListener {

    private PersonalCheckBoxView view;
    private Einsatz einsatz;

    public MyActionListenerPersonalCheckBoxBestaetigen(PersonalCheckBoxView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
