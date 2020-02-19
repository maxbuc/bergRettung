
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import bergrettung.EquipmentVerwaltung;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EquipmentView extends JFrame{
    private EquipmentVerwaltung equVerw;
    private JButton insert;
    private JButton read;
    private JButton update;
    private JLabel idLabel;
    private JLabel bezeichnungLabel;
    private JTextField idText;
    private JTextField bezeichnungText;
    
    public EquipmentView(String titel, EquipmentVerwaltung equVerw){
        super(titel);
        this.equVerw=equVerw;
        init();
    }
    
    public void init(){
        MyActionListenerEquipmentInsert listenerInsert = new MyActionListenerEquipmentInsert(equVerw,this);
        MyActionListenerEquipmentUpdate listenerUpdate = new MyActionListenerEquipmentUpdate(equVerw,this);
        MyActionListenerEquipmentRead listenerRead = new MyActionListenerEquipmentRead(equVerw,this);
        insert = new JButton ("Insert");
        update = new JButton ("Update");
        read = new JButton ("Read");
        idLabel = new JLabel ("ID: ");
        bezeichnungLabel = new JLabel("Bezeichnung: ");
        idText = new JTextField ("ID eingeben");
        bezeichnungText = new JTextField ("Bezeichnung eingeben");
        add(bezeichnungLabel);
        add(bezeichnungText);
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
    
    public int getIdText() {
        String text=idText.getText();
        int result = Integer.parseInt(text);
        return result;
    }
    
    public String getBezeichnungText(){
        return bezeichnungText.getText();
    }
}
