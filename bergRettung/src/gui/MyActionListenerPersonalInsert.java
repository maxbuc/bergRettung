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
            if (!persView.getVornameText().isEmpty() && persView.getIdText() > 0 && !persView.getNachnameText().isEmpty()) {

                personal = new Personal(persView.getIdText(), persView.getVornameText(), persView.getNachnameText());

                if (!persView.getGebdatText().isEmpty()) {
                    if (isDate(persView.getGebdatText())) {
                        personal.setGebdat(persView.getGebdatText());
                        persView.getGebdatField().setBackground(Color.WHITE);
                    } else {
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
        } catch (IllegalArgumentException ex) {
            persView.getGebdatField().setBackground(Color.red);
        }
    }

    public boolean isDate(String date) {

        String formatString = "yyyy-MM-dd";

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
