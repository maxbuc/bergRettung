
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.PersonalVerwaltung;
import bergrettung.Personal;


public class MyActionListenerPersonalView implements ActionListener{
    private final PersonalVerwaltung persVerw;
    private final MainView view;
    Personal personal;

    public MyActionListenerPersonalView(PersonalVerwaltung persVerw, MainView view) {
        this.persVerw = persVerw;
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        new PersonalView("Personal",persVerw);
    }
}
