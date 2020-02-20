
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;

public class MyActionListenerPersonalUpdate implements ActionListener{
    private final PersonalVerwaltung persVerw;
    private final PersonalView persView;
    Personal personal;
    
    public MyActionListenerPersonalUpdate(PersonalVerwaltung persVerw, PersonalView persView){
        this.persVerw=persVerw;
        this.persView=persView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        personal=new Personal(persView.getIdText(), persView.getVornameText(),persView.getNachnameText());
        if(persView.getQualifikationText() !=null | persView.getQualifikationText() != ""){
            personal.setQualifikation(persView.getQualifikationText());
        }
        persVerw.update(personal);
    }
}
