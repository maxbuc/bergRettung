package bergrettung;

public class BergRettung {

    public static void main(String[] args) {
        PersonalVerwaltung persVerw = new PersonalVerwaltung();
        
        
        //setup(persVerw);
        
        System.out.println(persVerw.readAll());
        
        
       
        
    }
    
   
    
    //erstellt und fügt alle Objekte in DB
    public static void setup(PersonalVerwaltung persVerw){
        
        //Personal
        Personal p1 = new Personal(1, "Fritz", "Huber", "1999-12-20", "Notarzt");
        Personal p2 = new Personal(2, "Herbert", "Meier");
        
        persVerw.insert(p1);
        persVerw.insert(p2);
    }
    
}
