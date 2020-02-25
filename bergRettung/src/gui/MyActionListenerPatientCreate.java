package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Patient;
import bergrettung.PatientVerwaltung;
import java.awt.Color;

public class MyActionListenerPatientCreate implements ActionListener {

    private final PatientVerwaltung patVerw;
    private final PatientInsertView patView;
    private final EinsatzView einView;
    Patient patient;

    public MyActionListenerPatientCreate(EinsatzView einView, PatientInsertView patView, PatientVerwaltung patVerw) {
        this.patVerw = patVerw;
        this.patView = patView;
        this.einView = einView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (patView.getIdText() > 0 && !patView.getVornameText().isEmpty() && !patView.getNachnameText().isEmpty()) {
            patient = new Patient(patView.getIdText(), patView.getVornameText(), patView.getNachnameText());
            patVerw.insertPatient(patient);
            einView.addPatientList(patient);
            patView.dispose();
        }else{
            if(patView.getIdText()<1){
                patView.getIdField().setBackground(Color.red);
            }else{
                patView.getIdField().setBackground(Color.WHITE);
            }
            if(patView.getVornameText().isEmpty()){
                patView.getVornameField().setBackground(Color.red);
            }else{
                patView.getVornameField().setBackground(Color.WHITE);
            }
            if(patView.getNachnameText().isEmpty()){
                patView.getNachnameField().setBackground(Color.red);
            }else{
                patView.getNachnameField().setBackground(Color.WHITE);
            }
        }
    }
}
