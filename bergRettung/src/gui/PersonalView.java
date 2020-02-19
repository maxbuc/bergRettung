
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import bergrettung.PersonalVerwaltung;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PersonalView extends JFrame{
    private final PersonalVerwaltung persVerw;
    private JButton insert;
    private JButton read;
    private JButton update;
    private JLabel nachnameLabel;
    private JLabel vornameLabel;
    private JLabel idLabel;
    private JLabel gebdatLabel;
    private JLabel qualifikationLabel;
    private JTextField nachnameText;
    private JTextField vornameText;
    private JTextField idText;
    private JTextField gebdatText;
    private JTextField qualifikationText;
    
    public PersonalView(String titel, PersonalVerwaltung persVerw){
        super(titel);
        this.persVerw=persVerw;
        init();
    }
    
    public void init(){
        MyActionListenerPersonalInsert listenerInsert = new MyActionListenerPersonalInsert(persVerw, this);
        MyActionListenerPersonalUpdate listenerUpdate = new MyActionListenerPersonalUpdate(persVerw, this);
        MyActionListenerPersonalRead listenerRead = new MyActionListenerPersonalRead(persVerw,this);
        insert = new JButton ("Insert");
        update = new JButton ("Update");
        read = new JButton ("Read");
        idLabel = new JLabel ("ID: ");
        nachnameLabel= new JLabel("Nachname: ");
        vornameLabel = new JLabel ("Vorname: ");
        gebdatLabel = new JLabel("Alter: ");
        qualifikationLabel = new JLabel("Qualifikation: ");
        idText = new JTextField ("ID eingeben", ALLBITS);
        nachnameText = new JTextField ("Nachname eingeben",ALLBITS);
        vornameText = new JTextField ("Vorname eingeben", ALLBITS);
        gebdatText = new JTextField ("Alter eingeben",ALLBITS);
        qualifikationText = new JTextField ("Qualifikation eingeben", ALLBITS);
        add(nachnameLabel);
        add(nachnameText);
        add(vornameLabel);
        add(vornameText);
        add(gebdatLabel);
        add(gebdatText);
        add(qualifikationLabel);
        add(qualifikationText);
        add(idLabel);
        add(idText);
        add(insert);
        add(update);
        add(read);
        insert.addActionListener(listenerInsert);
        update.addActionListener(listenerUpdate);
        read.addActionListener(listenerRead);
        this.setLayout(new FlowLayout());
        this.setLocation(400,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
    
    public String getVornameText() {
        return vornameText.getText();
    }

    public String getNachnameText() {
        return nachnameText.getText();
    }
    
    public int getIdText() {
        String text=idText.getText();
        int result = Integer.parseInt(text);
        return result;
    }
    
    public String getGebdatText(){
        return gebdatText.getText();
    }
    
    public String getQualifikationText(){
        return qualifikationText.getText();
    }
}
