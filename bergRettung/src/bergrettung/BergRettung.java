package bergrettung;

import gui.MainView;

public class BergRettung {

    public static void main(String[] args) {
        PersonalVerwaltung persVerw = new PersonalVerwaltung();
        PatientVerwaltung patVerw = new PatientVerwaltung();
        EinsatzVerwaltung einVerw = new EinsatzVerwaltung();
        EquipmentVerwaltung equVerw = new EquipmentVerwaltung();
        
        //setup(persVerw,patVerw, einVerw, equVerw);
        
        System.out.println(einVerw.readEinsatz(1).toString());
        
        MainView mainView = new MainView("Programm - Bergrettung", einVerw , equVerw, patVerw, persVerw);
       
        
    }
    
   
    
    //erstellt und fügt alle Objekte in DB
    public static void setup(PersonalVerwaltung persVerw, PatientVerwaltung patVerw, EinsatzVerwaltung einVerw, EquipmentVerwaltung equVerw){
        
        //Personal
        Personal p1 = new Personal(1, "Fritz", "Huber", "1999-12-20", "Notarzt");
        Personal p2 = new Personal(2, "Herbert", "Meier");
//        persVerw.insert(p1);
//        persVerw.insert(p2);
        
        //Patient
        Patient pat1 = new Patient(1,"Max","Mustermann");
        Patient pat2 = new Patient(2, "Hans","Sapei");
//        patVerw.insertPatient(pat1);
//        patVerw.insertPatient(pat2);

        
        //Equipment
        Equipment equ1 = new Equipment ("Hubschrauber", 1234);
        Equipment equ2 = new Equipment ("Auto", 43645);
//        equVerw.insertEquipment(equ1);
//        equVerw.insertEquipment(equ2);
        


        //Einsätze
        Einsatz e1 = new Einsatz(1,"2020-02-18","München","Tod");
        Einsatz e2 = new Einsatz(2,"2020-02-09","Bayern","Sabine");
        
        e1.addPersonal(p1);
        e1.addPersonal(p2);
        e1.addEquipment(equ1);
        e1.addEquipment(equ2);
        e1.addPatient(pat1);
        e1.addPatient(pat2);
        
        einVerw.insertEinsatz(e1);
        einVerw.insertEinsatz(e2);

    }
    
}
