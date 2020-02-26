package bergrettung;

import Persistenz.persistenzTest.EinfacheFactoryTest;
import Persistenz.persistenzTest.EinsatzJavaDBMapperTest;
import Persistenz.persistenzTest.EquipmentJavaDBMapperTest;
import Persistenz.persistenzTest.PatientJavaDBMapperTest;
import Persistenz.persistenzTest.PersonalJavaDBMapperTest;

public class BergRettung {

    public static void main(String[] args) {
        
        Setup set = new Setup();
        
        //Löschte bereits vorhandene BergRettungs Tabellen
        set.deleteTable();
        
        //Erstellt alle benötigten Tabellen
        set.createTable();
        
        //Fügt Testdaten ein
        setup();
        
        
        //new MainView("Programm - Bergrettung");
        
        test();
        
    }
    
    public static void test(){
        System.out.println("----------EinsatzJavaDBMapper--------------");
        EinsatzJavaDBMapperTest einsatzMapperTest = new EinsatzJavaDBMapperTest();
        System.out.println("----------EquipmentJavaDBMapper------------");
        EquipmentJavaDBMapperTest equipmentMapperTest = new EquipmentJavaDBMapperTest();
        System.out.println("----------PatientJavaDBMapper--------------");
        PatientJavaDBMapperTest patientMapperTest = new PatientJavaDBMapperTest();
        System.out.println("----------PersonalJavaDBMapper-------------");
        PersonalJavaDBMapperTest personalmapperTest = new PersonalJavaDBMapperTest();
        System.out.println("----------EinfacheFactory------------------");
        EinfacheFactoryTest einfachefactoryTest = new EinfacheFactoryTest();
    }
   
    
    //erstellt und fügt alle Objekte in DB
    public static void setup(){
        PersonalVerwaltung persVerw = new PersonalVerwaltung();
        PatientVerwaltung patVerw = new PatientVerwaltung();
        EinsatzVerwaltung einVerw = new EinsatzVerwaltung();
        EquipmentVerwaltung equVerw = new EquipmentVerwaltung();
        
        
        //Personal
        Personal p1 = new Personal(1, "Fritz", "Huber", "1999-12-20", "Notarzt");
        Personal p2 = new Personal(2, "Herbert", "Meier");
        Personal p3 = new Personal(3, "Max", "Schmidt", "1989-02-06", "Pilot");
        Personal p4 = new Personal(4, "Waldtraud", "Steinbauer", "1999-06-13", "Azubi");
        persVerw.insert(p1);
        persVerw.insert(p2);
        persVerw.insert(p3);
        persVerw.insert(p4);
        
        
        //Patient
        Patient pat1 = new Patient(1,"Max","Mustermann");
        Patient pat2 = new Patient(2, "Hans","Sapei");
        patVerw.insertPatient(pat1);
        patVerw.insertPatient(pat2);

        
        //Equipment
        Equipment equ1 = new Equipment ("Hubschrauber", 1);
        Equipment equ2 = new Equipment ("Auto", 2);
        Equipment equ3 = new Equipment ("Klettergurt", 3);
        Equipment equ4 = new Equipment ("Rettungsrucksack", 4);
        Equipment equ5 = new Equipment ("Skidoo", 5);
        
        equVerw.insertEquipment(equ1);
        equVerw.insertEquipment(equ2);
        equVerw.insertEquipment(equ3);
        equVerw.insertEquipment(equ4);
        equVerw.insertEquipment(equ5);
        


        //Einsätze
        Einsatz e1 = new Einsatz(1,"2020-02-18","Zugspitze", "Bergsteiger verunfallt");
        
        e1.addPatient(pat1);
        e1.addPatient(pat2);
        e1.addPersonal(p1);
        e1.addPersonal(p3);
        e1.addPersonal(p4);
        e1.addEquipment(equ1);
        e1.addEquipment(equ3);
        e1.addEquipment(equ4);
        
        einVerw.insertEinsatz(e1);

    }
    
}
