
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.PatientVerwaltung;

public class MyActionListenerPatientRead implements ActionListener{
    private final PatientVerwaltung patVerw;
    private final PatientView patView;
    
    public MyActionListenerPatientRead(PatientVerwaltung patVerw, PatientView patView){
        this.patVerw=patVerw;
        this.patView=patView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        new ResultView("Ausgabe").setResultView(patVerw.readPatient(patView.getIdText()).toString());
    }
}
