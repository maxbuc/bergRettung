package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.Color;

public class MyActionListenerPersonalUpdate implements ActionListener {

    private final PersonalVerwaltung persVerw;
    private final PersonalView persView;
    Personal personal;

    public MyActionListenerPersonalUpdate(PersonalVerwaltung persVerw, PersonalView persView) {
        this.persVerw = persVerw;
        this.persView = persView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (persView.getIdText() > 0 && !persView.getVornameText().isEmpty() && !persView.getNachnameText().isEmpty()) {
            personal = new Personal(persView.getIdText(), persView.getVornameText(), persView.getNachnameText());
            if (!persView.getQualifikationText().isEmpty()) {
                personal.setQualifikation(persView.getQualifikationText());
            }
            
            persVerw.update(personal);
            persView.dispose();
        }
        if (persView.getVornameText().isEmpty()) {
            persView.getVornameField().setBackground(Color.red);
        }else{
            persView.getVornameField().setBackground(Color.WHITE);
        }
        if (persView.getNachnameText().isEmpty()) {
            persView.getNachnameField().setBackground(Color.red);
        }else{
            persView.getNachnameField().setBackground(Color.WHITE);
        }
        if (persView.getIdText() < 1 ) {
            persView.getIdField().setBackground(Color.red);
        }else{
            persView.getIdField().setBackground(Color.WHITE);
        }

    }
}
