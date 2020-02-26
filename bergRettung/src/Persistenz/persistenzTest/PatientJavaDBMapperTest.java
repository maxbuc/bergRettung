
package Persistenz.persistenzTest;

import Persistenz.PatientJavaDBMapper;
import java.util.List;
import bergrettung.Patient;

public class PatientJavaDBMapperTest{
    PatientJavaDBMapper mapper = new PatientJavaDBMapper();
    
    Patient p;
    String vorname = "Max";
    String nachname = "Buchner";
    int id = 20;

    public PatientJavaDBMapperTest() {
        p = new Patient(id, vorname, nachname);
        
        insertPatient();
        readPatient();
        readAll();
        getNextFree();
        update();
    }
    
    
    
    public void insertPatient(){
        mapper.insertPatient(p);
        if(mapper.readPatient(id).toString().equals(p.toString())){
            System.out.println("insertPatient Test erfolgreich");
        }else{
            System.err.println("insertPatient");
        }
    }
    
    public void readPatient(){
        if(mapper.readPatient(id).toString().equals(p.toString())){
            System.out.println("readPatient Test erfolgreich");
        }else{
            System.err.println("readPatient");
        }
    }
    
    public void readAll (){
        if(mapper.readAll().get(mapper.readAll().size()-1).toString().equals(p.toString())){
            System.out.println("readAll Test erfolgreich");
        }else{
            System.err.println("readAll");
        }
    }
    
    public void getNextFree(){
        if(mapper.getNextFree() == id+1){
            System.out.println("getNextFree Test erfolgreich");
        }else{
            System.err.println("getNextFree");
        }
    }
    
    public void update(){
        p.setNachname("Müller");
        mapper.updatePatient(p);
        if(mapper.readPatient(id).toString().equals(p.toString())){
            System.out.println("updatePatient Test erfolgreich");
        }else{
            System.err.println("createPersonalMapper");
        }
    }
}
