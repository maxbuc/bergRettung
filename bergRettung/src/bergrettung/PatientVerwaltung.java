
package bergrettung;

import Persistenz.EinfacheFactory;
import Persistenz.IPatientMapper;
import java.util.List;




public class PatientVerwaltung{
    private final IPatientMapper wrapper = EinfacheFactory.createPatientMapper();

    private Patient patient;
    
     public void insertPatient(Patient p){
        wrapper.insertPatient(p);
    }   
     
    public Patient readPatient(int id){
        return wrapper.readPatient(id);
    } 
    
    public void deletePatient(int id){
        wrapper.deletePatient(id);
    }
 
    public void updatePatient(Patient p){
        wrapper.updatePatient(p);
    }
    
        public List<Patient> readAll(){
        return wrapper.readAll();
    }
        
        public int getNextFree(){
            return wrapper.getNextFree();
        }
}
