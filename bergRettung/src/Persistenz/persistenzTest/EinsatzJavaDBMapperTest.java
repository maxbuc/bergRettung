package Persistenz.persistenzTest;

import Persistenz.*;
import java.util.ArrayList;
import java.util.List;
import bergrettung.Einsatz;
import bergrettung.Equipment;
import bergrettung.Patient;
import bergrettung.Personal;

public class EinsatzJavaDBMapperTest {

    private EinsatzJavaDBMapper mapper = new EinsatzJavaDBMapper();
    int id = 20;
    String datum = "2020-02-02";
    String stichwort = "Test";
    String ort = "München";
    Einsatz e = new Einsatz(id, datum, ort, stichwort);
    List<Personal> personal = new ArrayList<>();
    List<Equipment> equipment = new ArrayList<>();
    List<Patient> patient = new ArrayList<>();
    
    String vorname = "Max";
    String nachname = "Buchner";
    String gebdat = "2000-02-23";
    String qual = "FRS";
    
    String bezeichnung = "Seil";
    Personal p;
    Equipment eq;
    Patient pat;

    public EinsatzJavaDBMapperTest() {
        p = new Personal(id, vorname, nachname, gebdat, qual);
        personal.add(p);
        eq = new Equipment(bezeichnung, id);
        equipment.add(eq);
        pat = new Patient(id, vorname, nachname);
        patient.add(pat);
        
        
        
        
        insertEinsatz();
        readEinsatz();
        getNextFree();
        
    }

    public void insertEinsatz() {
        mapper.insertEinsatz(e);
               
    }

    public void readEinsatz() {
        if(mapper.readEinsatz(id).toString().equals(e.toString())){
            System.out.println("readEinsatz Test erfolgreich");
            System.out.println("insertEinsatz Test erfolgreich");
        }else{
            System.err.println("readEinsatz");
            System.err.println("insertEinsatz");
        }
    }

    

    // Fügt Daten in Koppeltabellen ein
    private void addPersonal() {
        
    }

    private void addPatient() {
        
    }

    private void addEquipment() {
    }

    public void getNextFree() {
        if(mapper.getNextFree()==id+1){
            System.out.println("getNextFree Test erfolgreich");
        }else{
            System.err.println("getNextFree");
        }
    }

}
