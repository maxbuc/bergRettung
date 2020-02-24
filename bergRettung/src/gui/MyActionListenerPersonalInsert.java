package gui;

import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerPersonalInsert implements ActionListener {

    private final PersonalVerwaltung persVerw;
    private final PersonalView persView;
    Personal personal;

    public MyActionListenerPersonalInsert(PersonalVerwaltung persVerw, PersonalView persView) {
        this.persVerw = persVerw;
        this.persView = persView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!persView.getVornameText().isEmpty() && persView.getIdText() > 0 && !persView.getNachnameText().isEmpty()) {

            personal = new Personal(persView.getIdText(), persView.getVornameText(), persView.getNachnameText());
            if (!persView.getGebdatText().isEmpty()) {
                personal.setGebdat(persView.getGebdatText());
            }
            if (!persView.getQualifikationText().isEmpty()) {
                personal.setQualifikation(persView.getQualifikationText());
            }
            persVerw.insert(personal);
            persView.dispose();
        }else{
            if(persView.getVornameText().isEmpty()){
                persView.getVornameField().setBackground(Color.red);
            }
            if(persView.getNachnameText().isEmpty()){
                persView.getNachnameField().setBackground(Color.red);
            }
            if(persView.getIdText()<1){
                persView.getIdField().setBackground(Color.red);
            }
        }
    }
}
