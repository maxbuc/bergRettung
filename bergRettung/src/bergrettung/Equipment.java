
package bergrettung;


public class Equipment {
    private String bezeichnung;
    private int id;


    public Equipment(String bezeichnung, int id) {
        this.bezeichnung = bezeichnung;
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "Id " + id + ": " + bezeichnung +'\n';
    }


}
