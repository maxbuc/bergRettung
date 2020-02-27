package gui;

import javax.swing.JFrame;
import bergrettung.PersonalVerwaltung;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class PersonalView extends JFrame {

    private final PersonalVerwaltung persVerw;
    private JButton insert;
    private JButton read;
    private JButton readAll;
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

    public PersonalView(String titel, PersonalVerwaltung persVerw) {
        super(titel);

        URL iconURL = getClass().getResource("/images/personal.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());

        this.persVerw = persVerw;
        init();
    }

    public void init() {
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7,2));
        
        MyActionListenerPersonalInsert listenerInsert = new MyActionListenerPersonalInsert(persVerw, this);
        MyActionListenerPersonalUpdate listenerUpdate = new MyActionListenerPersonalUpdate(persVerw, this);
        MyActionListenerPersonalRead listenerRead = new MyActionListenerPersonalRead(persVerw, this);
        MyActionListenerPersonalReadAll listenerReadAll = new MyActionListenerPersonalReadAll(persVerw, this);
        
        FocusListener focusListener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                gebdatText.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
               
            }
        };
        
        insert = new JButton("Einfügen");
        update = new JButton("Aktualisieren");
        read = new JButton("Ausgeben");
        readAll = new JButton("Alle Ausgeben");
        idLabel = new JLabel("ID: ");
        nachnameLabel = new JLabel("Nachname: ");
        vornameLabel = new JLabel("Vorname: ");
        gebdatLabel = new JLabel("(Geburtstag: )");
        qualifikationLabel = new JLabel("(Qualifikation: )");
        idText = new JTextField(Integer.toString(persVerw.getNextFree()), ALLBITS);
        nachnameText = new JTextField(ALLBITS);
        vornameText = new JTextField(ALLBITS);
        gebdatText = new JTextField("yyyy-mm-dd",ALLBITS);
        qualifikationText = new JTextField(ALLBITS);
        panel.add(idLabel);
        panel.add(idText);
        panel.add(nachnameLabel);
        panel.add(nachnameText);
        panel.add(vornameLabel);
        panel.add(vornameText);
        panel.add(gebdatLabel);
        panel.add(gebdatText);
        panel.add(qualifikationLabel);
        panel.add(qualifikationText);
        panel.add(insert);
        panel.add(update);
        panel.add(read);
        panel.add(readAll);
        insert.setForeground(Color.BLACK);
        update.setForeground(Color.BLACK);
        read.setForeground(Color.BLACK);
        readAll.setForeground(Color.BLACK);
        gebdatText.setBackground(Color.LIGHT_GRAY);
        qualifikationText.setBackground(Color.LIGHT_GRAY);
        insert.addActionListener(listenerInsert);
        update.addActionListener(listenerUpdate);
        read.addActionListener(listenerRead);
        readAll.addActionListener(listenerReadAll);
        gebdatText.addFocusListener(focusListener);
        
        this.add(panel);
        this.pack();
        this.setVisible(true);
        
        //this.setLayout(new FlowLayout());
        this.setLocation(685, 200);
        this.setSize(470, 220);
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

    public String getGebdatText() {
        return gebdatText.getText();
    }

    public String getQualifikationText() {
        return qualifikationText.getText();
    }

    public JTextField getNachnameField() {
        return nachnameText;
    }

    public JTextField getVornameField() {
        return vornameText;
    }

    public JTextField getIdField() {
        return idText;
    }
    
    public JTextField getGebdatField(){
        return gebdatText;
    }
    public void setIdText(String zahl){
        idText.setText(zahl);
    }
}
