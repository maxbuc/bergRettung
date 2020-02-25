package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import bergrettung.PersonalVerwaltung;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
        MyActionListenerPersonalInsert listenerInsert = new MyActionListenerPersonalInsert(persVerw, this);
        MyActionListenerPersonalUpdate listenerUpdate = new MyActionListenerPersonalUpdate(persVerw, this);
        MyActionListenerPersonalRead listenerRead = new MyActionListenerPersonalRead(persVerw, this);
        MyActionListenerPersonalReadAll listenerReadAll = new MyActionListenerPersonalReadAll(persVerw, this);
        insert = new JButton("Insert");
        update = new JButton("Update");
        read = new JButton("Read");
        readAll = new JButton("ReadAll");
        idLabel = new JLabel("ID: ");
        nachnameLabel = new JLabel("Nachname: ");
        vornameLabel = new JLabel("Vorname: ");
        gebdatLabel = new JLabel("Geburtstag: ");
        qualifikationLabel = new JLabel("Qualifikation: ");
        idText = new JTextField(Integer.toString(persVerw.getNextFree()), ALLBITS);
        nachnameText = new JTextField(ALLBITS);
        vornameText = new JTextField(ALLBITS);
        gebdatText = new JTextField(ALLBITS);
        qualifikationText = new JTextField(ALLBITS);
        add(idLabel);
        add(idText);
        add(nachnameLabel);
        add(nachnameText);
        add(vornameLabel);
        add(vornameText);
        add(gebdatLabel);
        add(gebdatText);
        add(qualifikationLabel);
        add(qualifikationText);
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
}
