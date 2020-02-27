
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import bergrettung.EquipmentVerwaltung;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public final class EquipmentView extends JFrame{
    private final EquipmentVerwaltung equVerw;
    private JButton insert;
    private JButton read;
    private JButton readAll;
    private JButton update;
    private JLabel idLabel;
    private JLabel bezeichnungLabel;
    private JTextField idText;
    private JTextField bezeichnungText;
    
    public EquipmentView(String titel, EquipmentVerwaltung equVerw){
        super(titel);
        
        URL iconURL = getClass().getResource("/images/werkzeug.png");
        ImageIcon icon = new ImageIcon(iconURL);        
        this.setIconImage(icon.getImage());
        
        this.equVerw=equVerw;
        init();
    }
    
    public void init(){
        MyActionListenerEquipmentInsert listenerInsert = new MyActionListenerEquipmentInsert(equVerw,this);
        MyActionListenerEquipmentUpdate listenerUpdate = new MyActionListenerEquipmentUpdate(equVerw,this);
        MyActionListenerEquipmentRead listenerRead = new MyActionListenerEquipmentRead(equVerw,this);
        MyActionListenerEquipmentReadAll listenerReadAll = new MyActionListenerEquipmentReadAll(equVerw,this);
        insert = new JButton ("Einfügen");
        update = new JButton ("Aktualisieren");
        read = new JButton ("Ausgeben");
        readAll = new JButton("Alle Ausgeben");
        idLabel = new JLabel ("ID: ");
        bezeichnungLabel = new JLabel("Bezeichnung: ");
        idText = new JTextField (Integer.toString(equVerw.getNextFree()) ,ALLBITS);
        bezeichnungText = new JTextField (ALLBITS);
        add(idLabel);
        add(idText);
        add(bezeichnungLabel);
        add(bezeichnungText);
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
        this.setSize(470,220);
        this.setVisible(true);
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
    
    public String getBezeichnungText(){
        return bezeichnungText.getText();
    }
    
    public JTextField getIdField(){
        return idText;
    }
    public JTextField getBezeichnungField(){
        return bezeichnungText;
    }
}
