package gui;

import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLDataException;
import java.text.SimpleDateFormat;

public class MyActionListenerPersonalInsert implements ActionListener {

    private PersonalVerwaltung persVerw;
    private PersonalView persView;
    Personal personal;
    private SimpleDateFormat pattern;

    public MyActionListenerPersonalInsert(PersonalVerwaltung persVerw, PersonalView persView) {
        this.persVerw = persVerw;
        this.persView = persView;
        pattern = new SimpleDateFormat("yyyy-MM-dd");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        if (!persView.getVornameText().isEmpty() && persView.getIdText() > 0 && !persView.getNachnameText().isEmpty()) {

            personal = new Personal(persView.getIdText(), persView.getVornameText(), persView.getNachnameText());

            if (!persView.getGebdatText().isEmpty()) {
                if (pattern.equals(persView.getGebdatText())) {
                    personal.setGebdat(persView.getGebdatText());
                }else{
                    throw new IllegalArgumentException();
                }
            }

            personal.setQualifikation(persView.getQualifikationText());

            persVerw.insert(personal);
            persView.dispose();
        } else {
            if (persView.getVornameText().isEmpty()) {
                persView.getVornameField().setBackground(Color.red);
            } else {
                persView.getVornameField().setBackground(Color.WHITE);
            }
            if (persView.getNachnameText().isEmpty()) {
                persView.getNachnameField().setBackground(Color.red);
            } else {
                persView.getNachnameField().setBackground(Color.WHITE);
            }
            if (persView.getIdText() < 1) {
                persView.getIdField().setBackground(Color.red);
            } else {
                persView.getIdField().setBackground(Color.WHITE);
            }
        }
        }catch(IllegalArgumentException ex){
            System.out.println("datum falsch");
        }
    }
}
