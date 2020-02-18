
package bergrettung;

import java.util.ArrayList;
import java.util.List;

public class Einsatz {
    private int id;
    private String datum;
    private String ort;
    private String stichwort;
    private List<Personal> personal;
    private List<Patient> patienten;
    private List<Equipment> equipment;

    public Einsatz(int id, String datum, String ort, String stichwort) {
        this.id = id;
        this.datum = datum;
        this.ort = ort;
        this.stichwort = stichwort;
        this.personal = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStichwort() {
        return stichwort;
    }

    public void setStichwort(String stichwort) {
        this.stichwort = stichwort;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }
    public void addPersonal(Personal p){
        
        this.personal.add(p);
    }

    public List<Patient> getPatienten() {
        return patienten;
    }

    public void setPatienten(List<Patient> patienten) {
        this.patienten = patienten;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }
    
    

    @Override
    public String toString() {
        return "Einsatz{" + "id=" + id + ", datum=" + datum + ", ort=" + ort + ", stichwort=" + stichwort + '}'+'\n';
    }
    
    
}
