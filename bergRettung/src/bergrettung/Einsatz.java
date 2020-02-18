
package bergrettung;

public class Einsatz {
    private int id;
    private String datum;
    private String ort;
    private String stichwort;

    public Einsatz(int id, String datum, String ort, String stichwort) {
        this.id = id;
        this.datum = datum;
        this.ort = ort;
        this.stichwort = stichwort;
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

    @Override
    public String toString() {
        return "Einsatz{" + "id=" + id + ", datum=" + datum + ", ort=" + ort + ", stichwort=" + stichwort + '}';
    }
    
    
}
