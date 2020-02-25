package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Patient;
import bergrettung.PatientVerwaltung;
import java.awt.Color;

public class MyActionListenerPatientUpdate implements ActionListener {

    private final PatientVerwaltung patVerw;
    private final PatientView patView;
    Patient patient;

    public MyActionListenerPatientUpdate(PatientVerwaltung patVerw, PatientView patView) {
        this.patVerw = patVerw;
        this.patView = patView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (patView.getIdText() > 0 && !patView.getVornameText().isEmpty() && !patView.getNachnameText().isEmpty()) {
            patient = new Patient(patView.getIdText(), patView.getVornameText(), patView.getNachnameText());
            patVerw.updatePatient(patient);
            patView.dispose();
        }else{
            if (patView.getIdText() < 1) {
                patView.getIdField().setBackground(Color.red);
            } else {
                patView.getIdField().setBackground(Color.WHITE);
            }
            if (patView.getVornameText().isEmpty()) {
                patView.getVornameField().setBackground(Color.red);
            } else {
                patView.getVornameField().setBackground(Color.WHITE);
            }
            if (patView.getNachnameText().isEmpty()) {
                patView.getNachnameField().setBackground(Color.red);
            } else {
                patView.getNachnameField().setBackground(Color.WHITE);
            }
        }
    }
}
