package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.PatientVerwaltung;
import java.awt.Color;

public class MyActionListenerPatientRead implements ActionListener {

    private final PatientVerwaltung patVerw;
    private final PatientView patView;

    public MyActionListenerPatientRead(PatientVerwaltung patVerw, PatientView patView) {
        this.patVerw = patVerw;
        this.patView = patView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (patView.getIdText() > 0 && patVerw.readPatient(patView.getIdText()) != null) {
            new ResultView("Ausgabe").setResultView(patVerw.readPatient(patView.getIdText()).toString());
            patView.setBackground(Color.white);
        } else {
            patView.getIdField().setBackground(Color.red);
        }
    }
}
