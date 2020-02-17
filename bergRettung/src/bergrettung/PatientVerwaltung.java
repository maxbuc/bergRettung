
package bergrettung;

import Persistenz.EinfacheFactory;
import Persistenz.IPatientMapper;
import java.util.List;

public class PatientVerwaltung {
    private final IPatientMapper mapper = EinfacheFactory.createPatientMapper();
    private Patient patient;
    
     public void insertPatient(Patient p){
        mapper.insertPatient(p);
    }   
    public Patient readPatient(int id){
        return mapper.readPatient(id);
    } 
    
    public void deletePatient(int id){
        mapper.deletePatient(id);
    }
    public PatientVerwaltung(){
        this.patient=patient;
    }
    
//    public void setView(PersonenView view) {
//        this.view = view;
//    }
 
    public void updatePerson(Patient p){
        mapper.updatePatient(p);
    }
    
        public List<Patient> readAll(){
        return mapper.readAll();
    }
}
