package gui;

import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerPersonalRead implements ActionListener {

    private final PersonalVerwaltung persVerw;
    private final PersonalView persView;
    Personal personal;

    public MyActionListenerPersonalRead(PersonalVerwaltung persVerw, PersonalView persView) {
        this.persVerw = persVerw;
        this.persView = persView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ResultView r = null;
        if (persView.getIdText() > 0 ) {
            try {
                r = new ResultView("Ausgabe");
                r.setResultView(persVerw.read(persView.getIdText()).toString());
                persView.getIdField().setBackground(Color.WHITE);
            } catch (NullPointerException ex) {
                r.dispose();
                persView.getIdField().setBackground(Color.red);
            }
        } else {
            persView.getIdField().setBackground(Color.red);
        }
        
            
        
    }
}
