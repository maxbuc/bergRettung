package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Patient;
import bergrettung.PatientVerwaltung;
import java.awt.Color;

public class MyActionListenerPatientInsert implements ActionListener {

    private final PatientVerwaltung patVerw;
    private final PatientView patView;
    Patient patient;

    public MyActionListenerPatientInsert(PatientVerwaltung patVerw, PatientView patView) {
        this.patVerw = patVerw;
        this.patView = patView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (patView.getIdText() > 0 && !patView.getVornameText().isEmpty() && !patView.getNachnameText().isEmpty() && patVerw.readPatient(patView.getIdText())== null &&
                patView.getVornameText().length()<20 && patView.getNachnameText().length()<20) {
            patient = new Patient(patView.getIdText(), patView.getVornameText(), patView.getNachnameText());
            patVerw.insertPatient(patient);
            patView.dispose();
        } else {
            if (patView.getIdText() < 1 || patVerw.readPatient(patView.getIdText())!= null) {
                patView.getIdField().setBackground(Color.red);
            } else {
                patView.getIdField().setBackground(Color.WHITE);
            }
            if (patView.getVornameText().isEmpty() || patView.getVornameText().length()>20) {
                patView.getVornameField().setBackground(Color.red);
            } else {
                patView.getVornameField().setBackground(Color.WHITE);
            }
            if (patView.getNachnameText().isEmpty() || patView.getNachnameText().length()>20) {
                patView.getNachnameField().setBackground(Color.red);
            } else {
                patView.getNachnameField().setBackground(Color.WHITE);
            }
            
        }
    }
}
