
package gui;

import bergrettung.PatientVerwaltung;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PatientView extends JFrame{
    private PatientVerwaltung patVerw;
    private JButton insert;
    private JButton read;
    private JButton update;
    private JLabel nachnameLabel;
    private JLabel vornameLabel;
    private JLabel idLabel;
    private JTextField nachnameText;
    private JTextField vornameText;
    private JTextField idText;
    
    public PatientView(String titel, PatientVerwaltung patVerw){
        super(titel);
        this.patVerw=patVerw;
        init();
    }
    
    public void init(){
        insert = new JButton ("Insert");
        update = new JButton ("Update");
        read = new JButton ("Read");
        idLabel = new JLabel ("ID: ");
        nachnameLabel= new JLabel("Nachname: ");
        vornameLabel = new JLabel ("Vorname: ");
        idText = new JTextField ("ID eingeben", ALLBITS);
        nachnameText = new JTextField ("Nachname eingeben",ALLBITS);
        vornameText = new JTextField ("Vorname eingeben", ALLBITS);
        add(nachnameLabel);
        add(nachnameText);
        add(vornameLabel);
        add(vornameText);
        add(idLabel);
        add(idText);
        add(insert);
        add(update);
        add(read);
        this.setLayout(new FlowLayout());
        this.setLocation(400,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
}
