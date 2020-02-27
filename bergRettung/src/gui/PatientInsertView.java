
package gui;

import bergrettung.PatientVerwaltung;
import java.awt.Color;
import java.awt.GridLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public final class PatientInsertView extends JFrame{
    private EinsatzView einView;
    private PatientVerwaltung patVerw;
    private JButton insert;
    private JLabel nachnameLabel;
    private JLabel vornameLabel;
    private JLabel idLabel;
    private JTextField nachnameText;
    private JTextField vornameText;
    private JTextField idText;
    
    public PatientInsertView(String titel, EinsatzView einView){
        super(titel);
        
        URL iconURL = getClass().getResource("/images/teddy.png");
        ImageIcon icon = new ImageIcon(iconURL);        
        this.setIconImage(icon.getImage());
        
        this.einView=einView;
        this.patVerw=new PatientVerwaltung();
        init();
    }
    
    public void init(){
        MyActionListenerPatientCreate listenerInsert = new MyActionListenerPatientCreate(einView,this, patVerw);
        insert = new JButton ("Einfügen");
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
        insert.setForeground(Color.BLACK);
        insert.addActionListener(listenerInsert);
        this.setLayout(new GridLayout(5,2));
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
