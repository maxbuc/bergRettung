package bergrettung.bergrettungTest;

import bergrettung.Personal;

public class PersonalTest {
    private int id;
    private String vorname;
    private String nachname;
    private String gebdat;
    private String qualifikation;
    Personal p;
    
    
    //Konstruktoren
     
    

    public PersonalTest() {
        this.id = 99;
        this.vorname = "Maximilian";
        this.nachname = "Buchner";
        this.gebdat = "2000-02-23";
        this.qualifikation = "FRS";
        p = new Personal(id, vorname, nachname, gebdat, qualifikation);
        
        
        getId();
        setId();
        getGebdat();
        setGebdat();
        getVorname();
        setVorname();
        getNachname();
        setNachname();
        getQualifikation();
        setQualifikation();
        
    }
    
    
    //Getter & Setter

    public void getId() {
        if(this.id == p.getId()){
            System.out.println("getId Test erfolgreich");
        }else{
            System.err.println("getId");
        }
    }

    public void setId() {
        p.setId(100);
        id=100;
        if(p.getId()==100){
            System.out.println("setId Test erfolgreich");
        }else{
            System.err.println("setId");
        }
    }

    public void getVorname() {
        if(this.vorname == p.getVorname()){
            System.out.println("getVorname Test erfolgreich");
        }else{
            System.err.println("getVorname");
        }
    }

    public void setVorname() {
        p.setVorname("Herbert");
        vorname="Herbert";
        if(this.vorname == p.getVorname()){
            System.out.println("setVorname Test erfolgreich");
        }else{
            System.err.println("setVorname");
        }
    }

    public void getNachname() {
        if(this.nachname == p.getNachname()){
            System.out.println("getNachname Test erfolgreich");
        }else{
            System.err.println("getNachname");
        }
    }

    public void setNachname() {
        p.setNachname("Müller");
        nachname="Müller";
        if(this.nachname == p.getNachname()){
            System.out.println("setNachname Test erfolgreich");
        }else{
            System.err.println("setNachname");
        }
    }

    public void getGebdat() {
        if(this.gebdat == p.getGebdat()){
            System.out.println("getGebdat Test erfolgreich");
        }else{
            System.err.println("getGebdat");
        }
    }

    public void setGebdat() {
        p.setGebdat("1999-02-02");
        gebdat="1999-02-02";
        if(this.gebdat == p.getGebdat()){
            System.out.println("setGebdat Test erfolgreich");
        }else{
            System.err.println("setGebdat");
        }
    }

    public void getQualifikation() {
        if(this.qualifikation == p.getQualifikation()){
            System.out.println("getQualifikation Test erfolgreich");
        }else{
            System.err.println("getQualifikation");
        }
    }

    public void setQualifikation() {
        p.setQualifikation("Notarzt");
        qualifikation="Notarzt";
        if(this.qualifikation == p.getQualifikation()){
            System.out.println("setQualifikation Test erfolgreich");
        }else{
            System.err.println("setQualifikation");
        }
    }

    
    
    
    
    

    
    
    
    
}
