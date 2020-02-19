/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bergrettung;


public class Equipment {
    private String bezeichnung;
    private int eqid;


    public Equipment(String bezeichnung, int eqid) {
        this.bezeichnung = bezeichnung;
        this.eqid = eqid;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getEqid() {
        return eqid;
    }

    public void setEqid(int eqid) {
        this.eqid = eqid;
    }

    @Override
    public String toString() {
        return "Equipment{" + "bezeichnung=" + bezeichnung + ", eqid=" + eqid + '}'+'\n';
    }


}
