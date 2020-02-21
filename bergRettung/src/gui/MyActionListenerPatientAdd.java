
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Patient;
import bergrettung.PatientVerwaltung;

public class MyActionListenerPatientAdd implements ActionListener{
    private final PatientVerwaltung patVerw;
    private final EinsatzView einView;
    Patient patient;
    
    public MyActionListenerPatientAdd(EinsatzView einView){
        this.patVerw= new PatientVerwaltung();
        this.einView=einView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        PatientInsertView patientInsertView = new PatientInsertView("Patient einfügen", einView);
    }
}
