
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.PatientVerwaltung;
import bergrettung.Patient;


public class MyActionListenerPatientView implements ActionListener{
    private final PatientVerwaltung patVerw;
    private final PatientView view;
    Patient patient;

    public MyActionListenerPatientView(PatientVerwaltung patVerw, PatientView view) {
        this.patVerw = patVerw;
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Inserted!");
        patient = new Patient(view.getPatientView());
        patVerw.insertPatient(patient);
    }
}
