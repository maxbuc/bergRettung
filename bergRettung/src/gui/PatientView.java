
package gui;

import bergrettung.PatientVerwaltung;
import java.awt.Color;
import java.awt.FlowLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public final class PatientView extends JFrame{
    private final PatientVerwaltung patVerw;
    private JButton insert;
    private JButton read;
    private JButton readAll;
    private JButton update;
    private JLabel nachnameLabel;
    private JLabel vornameLabel;
    private JLabel idLabel;
    private JTextField nachnameText;
    private JTextField vornameText;
    private JTextField idText;
    
    public PatientView(String titel, PatientVerwaltung patVerw){
        super(titel);
        
        URL iconURL = getClass().getResource("/images/teddy.png");
        ImageIcon icon = new ImageIcon(iconURL);        
        this.setIconImage(icon.getImage());
        
        this.patVerw=patVerw;
        init();
    }
    
    public void init(){
        MyActionListenerPatientInsert listenerInsert = new MyActionListenerPatientInsert(patVerw,this);
        MyActionListenerPatientUpdate listenerUpdate = new MyActionListenerPatientUpdate(patVerw,this);
        MyActionListenerPatientRead listenerRead = new MyActionListenerPatientRead(patVerw,this);
        MyActionListenerPatientReadAll listenerReadAll = new MyActionListenerPatientReadAll(patVerw,this);
        insert = new JButton ("Einfügen");
        update = new JButton ("Aktualisieren");
        read = new JButton ("Ausgeben");
        readAll = new JButton ("Alle Ausgeben");
        idLabel = new JLabel ("ID: ");
        nachnameLabel= new JLabel("Nachname: ");
        vornameLabel = new JLabel ("Vorname: ");
        idText = new JTextField (Integer.toString(patVerw.getNextFree()), ALLBITS);
        nachnameText = new JTextField (ALLBITS);
        vornameText = new JTextField (ALLBITS);
        add(idLabel);
        add(idText);
        add(nachnameLabel);
        add(nachnameText);
        add(vornameLabel);
        add(vornameText);
        add(insert);
        add(update);
        add(read);
        add(readAll);
        insert.setForeground(Color.BLACK);
        update.setForeground(Color.BLACK);
        read.setForeground(Color.BLACK);
        readAll.setForeground(Color.BLACK);
        insert.addActionListener(listenerInsert);
        update.addActionListener(listenerUpdate);
        read.addActionListener(listenerRead);
        readAll.addActionListener(listenerReadAll);
        this.setLayout(new FlowLayout());
        this.setLocation(685,200);
        this.setSize(460,220);
        this.setVisible(true);
    }
    
    public String getVornameText() {
        return vornameText.getText();
    }

    public String getNachnameText() {
        return nachnameText.getText();
    }
    
    public int getIdText() {
        int result = 0;
        if (idText.getText().isEmpty()) {
            return result;
        }
        String text = idText.getText();
        try {
            result = Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            return 0;
        }
        return result;
    }
    
    public JTextField getIdField(){
        return idText;
    }
    public JTextField getVornameField(){
        return vornameText;
    }
    public JTextField getNachnameField(){
        return nachnameText;
    }
}
