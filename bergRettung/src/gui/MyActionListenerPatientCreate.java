
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Patient;
import bergrettung.PatientVerwaltung;

public class MyActionListenerPatientCreate implements ActionListener{
    private final PatientVerwaltung patVerw;
    private final PatientInsertView patView;
    private final EinsatzView einView;
    Patient patient;
    
    public MyActionListenerPatientCreate(EinsatzView einView, PatientInsertView patView, PatientVerwaltung patVerw){
        this.patVerw=patVerw;
        this.patView=patView;
        this.einView=einView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        patient=new Patient(patView.getIdText(), patView.getVornameText(), patView.getNachnameText());
        patVerw.insertPatient(patient);
        einView.addPatientList(patient);
        patView.dispose();
        
    }
}
