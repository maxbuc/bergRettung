
package bergrettung;

import Persistenz.EinfacheFactory;
import Persistenz.IPatientMapper;
import java.util.List;

public class PatientVerwaltungWrapper {
    IPatientMapper mapper = EinfacheFactory.createPatientMapper();
    
    public void insertPatient (Patient p){
        mapper.insertPatient(p);
    }
    public void deletePatient (int id){
        mapper.deletePatient(id);
    }
    public void updatePatient(Patient p){
        mapper.updatePatient(p);
    }
    public Patient readPatient(int id){
        return mapper.readPatient(id);
    }
    public List<Patient> readAll(){
        return mapper.readAll();
    }
}
