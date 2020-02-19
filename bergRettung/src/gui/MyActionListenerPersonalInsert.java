
package gui;

import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerPersonalInsert implements ActionListener{
    private final PersonalVerwaltung persVerw;
    private final PersonalView persView;
    Personal personal;
    
    public MyActionListenerPersonalInsert(PersonalVerwaltung persVerw, PersonalView persView){
        this.persVerw=persVerw;
        this.persView=persView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Inserted!");
        personal=new Personal(persView.getIdText(), persView.getVornameText(),persView.getNachnameText());
        if(persView.getGebdatText() != null | persView.getGebdatText()!= ""){
            personal.setGebdat(persView.getGebdatText());
    }
        if(persView.getQualifikationText() !=null | persView.getQualifikationText() != ""){
            personal.setQualifikation(persView.getQualifikationText());
        }
        persVerw.insert(personal);
    }
}
