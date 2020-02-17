
package Persistenz;

import java.util.List;
import bergrettung.Patient;

public interface IPatientMapper {
    Patient readPatient(int id);
    List<Patient> readAll();
    void updatePatient(Patient p);
    void insertPatient(Patient p);
    void deletePatient(int id); 
}
