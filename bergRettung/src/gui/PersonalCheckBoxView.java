package gui;

import bergrettung.PersonalVerwaltung;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class PersonalCheckBoxView extends JFrame{
    private PersonalVerwaltung persVerw;
    private JCheckBox persBox;
   
    
    public PersonalCheckBoxView(String title){
        persVerw = new PersonalVerwaltung();
        persBox = new JCheckBox(persVerw.read(1).toString());
        this.add(persBox);
    }
    
}
