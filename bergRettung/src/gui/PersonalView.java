
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import bergrettung.PersonalVerwaltung;

public class PersonalView extends JFrame{
    private PersonalVerwaltung persVerw;
    public PersonalView(String titel, PersonalVerwaltung persVerw){
        super(titel);
        this.persVerw=persVerw;
        init();
    }
    
    public void init(){
        this.setLayout(new FlowLayout());
        this.setLocation(400,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
}
