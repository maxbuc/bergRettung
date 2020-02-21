
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Patient;
import bergrettung.PatientVerwaltung;

public class MyActionListenerPatientUpdate implements ActionListener{
    private final PatientVerwaltung patVerw;
    private final PatientView patView;
    Patient patient;
    
    public MyActionListenerPatientUpdate(PatientVerwaltung patVerw, PatientView patView){
        this.patVerw=patVerw;
        this.patView=patView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        patient = new Patient(patView.getIdText(), patView.getVornameText(), patView.getNachnameText());
        patVerw.updatePatient(patient);
        patView.dispose();
    }
}
