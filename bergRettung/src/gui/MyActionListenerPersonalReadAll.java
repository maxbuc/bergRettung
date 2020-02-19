
package gui;

import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerPersonalReadAll implements ActionListener{
    private final PersonalVerwaltung persVerw;
    private final PersonalView persView;
    Personal personal;
    
    public MyActionListenerPersonalReadAll(PersonalVerwaltung persVerw, PersonalView persView){
        this.persVerw=persVerw;
        this.persView=persView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println(persVerw.readAll().toString());
    }
}
