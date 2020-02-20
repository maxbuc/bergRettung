
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Patient;
import bergrettung.PatientVerwaltung;

public class MyActionListenerPatientCreate implements ActionListener{
    private PatientVerwaltung patVerw;
    private PatientInsertView patView;
    private EinsatzView einView;
    Patient patient;
    
    public MyActionListenerPatientCreate(EinsatzView einView, PatientInsertView patView){
        this.patVerw=new PatientVerwaltung();
        this.patView=patView;
        this.einView=einView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Inserted!");
        patient=new Patient(patView.getIdText(), patView.getVornameText(), patView.getNachnameText());
        patVerw.insertPatient(patient);
        einView.addPatientList(patient);
        patView.dispose();
        
    }
}
