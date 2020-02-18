package bergrettung;

public class BergRettung {

    public static void main(String[] args) {
        PersonalVerwaltung persVerw = new PersonalVerwaltung();
        PatientVerwaltung patVerw = new PatientVerwaltung();
        EinsatzVerwaltung einVerw = new EinsatzVerwaltung();
        
        setup(persVerw,patVerw, einVerw);
        
//        System.out.println(persVerw.readAll());
        
        
       
        
    }
    
   
    
    //erstellt und fügt alle Objekte in DB
    public static void setup(PersonalVerwaltung persVerw, PatientVerwaltung patVerw, EinsatzVerwaltung einVerw){
        
        //Personal
//        Personal p1 = new Personal(1, "Fritz", "Huber", "1999-12-20", "Notarzt");
//        Personal p2 = new Personal(2, "Herbert", "Meier");
//        
//        persVerw.insert(p1);
//        persVerw.insert(p2);
        
        //Patient
//        Patient pat1 = new Patient(1,"Max","Mustermann");
//        Patient pat2 = new Patient(2, "Hans","Sapei");
//        patVerw.insertPatient(pat1);
//        patVerw.insertPatient(pat2);

        //Einsätze
//        Einsatz e1 = new Einsatz(1,"2020-02-18","München","Tod");
//        Einsatz e2 = new Einsatz(2,"2020-02-09","Bayern","Sabine");
//        einVerw.insertEinsatz(e1);
//        einVerw.insertEinsatz(e2);

    }
    
}
