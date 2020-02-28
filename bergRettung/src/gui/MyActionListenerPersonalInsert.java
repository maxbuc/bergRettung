package gui;

import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class MyActionListenerPersonalInsert implements ActionListener {

    private PersonalVerwaltung persVerw;
    private PersonalView persView;
    Personal personal;
    private SimpleDateFormat pattern;

    public MyActionListenerPersonalInsert(PersonalVerwaltung persVerw, PersonalView persView) {
        this.persVerw = persVerw;
        this.persView = persView;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (!persView.getVornameText().isEmpty() && persView.getIdText() > 0 && !persView.getNachnameText().isEmpty() && persVerw.read(persView.getIdText()) == null
                    && persView.getVornameText().length() < 20 && persView.getNachnameText().length() < 20 && persView.getQualifikationText().length() < 40) {

                personal = new Personal(persView.getIdText(), persView.getVornameText(), persView.getNachnameText());

                if (!persView.getGebdatText().isEmpty()) {
                    if (isDate(persView.getGebdatText())) {
                        if (!persView.getGebdatText().equals("yyyy-mm-dd")) {
                            personal.setGebdat(persView.getGebdatText());
                            persView.getGebdatField().setBackground(Color.WHITE);
                        }
                    } else {
                        if (persView.getGebdatText().equals("yyyy-mm-dd")) {

                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                if (persView.getQualifikationText().length() < 40) {
                    if (!persView.getQualifikationText().isEmpty()) {
                        personal.setQualifikation(persView.getQualifikationText());                        
                    }
                    persView.getQualifikationField().setBackground(Color.WHITE);
                }else{
                    persView.getQualifikationField().setBackground(Color.red);
                }

                persVerw.insert(personal);
                persView.dispose();
            } else {
                if (persView.getVornameText().isEmpty() || persView.getVornameText().length() > 20) {
                    persView.getVornameField().setBackground(Color.red);
                } else {
                    persView.getVornameField().setBackground(Color.WHITE);
                }
                if (persView.getNachnameText().isEmpty() || persView.getNachnameText().length() > 20) {
                    persView.getNachnameField().setBackground(Color.red);
                } else {
                    persView.getNachnameField().setBackground(Color.WHITE);
                }
                if (persView.getIdText() < 1 || persVerw.read(persView.getIdText()) != null) {
                    persView.getIdField().setBackground(Color.red);
                } else {
                    persView.getIdField().setBackground(Color.WHITE);
                }
            }
        } catch (IllegalArgumentException ex) {
            persView.getGebdatField().setBackground(Color.red);
        }
    }

    public boolean isDate(String date) {

        String formatString = "yyyy-MM-dd";

        if (date.equals("yyyy-mm-dd")) {
            return true;
        }

        try {
            SimpleDateFormat format = new SimpleDateFormat(formatString);
            format.setLenient(false);
            format.parse(date);
        } catch (ParseException e) {
            return false;
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
    }
}
