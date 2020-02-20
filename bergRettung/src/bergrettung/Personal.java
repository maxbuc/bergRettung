package bergrettung;

public class Personal {
    private int id;
    private String vorname;
    private String nachname;
    private String gebdat;
    private String qualifikation;

    
    
    //Konstruktoren
    public Personal(int id, String vorname, String nachname) {
        this(id, vorname, nachname, null, null);
    }

    public Personal(int id, String vorname, String nachname, String gebdat) {
        this(id, vorname, nachname, gebdat, null);
    }   
    

    public Personal(int id, String vorname, String nachname, String gebdat, String qualifikation) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebdat = gebdat;
        this.qualifikation = qualifikation;
    }
    
    
    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGebdat() {
        return gebdat;
    }

    public void setGebdat(String gebdat) {
        this.gebdat = gebdat;
    }

    public String getQualifikation() {
        return qualifikation;
    }

    public void setQualifikation(String qualifikation) {
        this.qualifikation = qualifikation;
    }

    @Override
    public String toString() {
        return  "Id " + id + ": " + nachname + ", "+ vorname + ", " + gebdat + ", " + qualifikation + '\n';
    }
    
    
    
    

    
    
    
    
}
