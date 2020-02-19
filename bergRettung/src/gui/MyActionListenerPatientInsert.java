
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Patient;
import bergrettung.PatientVerwaltung;

public class MyActionListenerPatientInsert implements ActionListener{
    private final PatientVerwaltung patVerw;
    private final PatientView patView;
    Patient patient;
    
    public MyActionListenerPatientInsert(PatientVerwaltung patVerw, PatientView patView){
        this.patVerw=patVerw;
        this.patView=patView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Inserted!");
        patient=new Patient(patView.getIdText(), patView.getVornameText(), patView.getNachnameText());
        patVerw.insertPatient(patient);
    }
}
