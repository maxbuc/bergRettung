
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import bergrettung.EquipmentVerwaltung;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EquipmentView extends JFrame{
    private EquipmentVerwaltung equVerw;
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
        this.equVerw=equVerw;
        init();
    }
    
    public void init(){
        MyActionListenerEquipmentInsert listenerInsert = new MyActionListenerEquipmentInsert(equVerw,this);
        MyActionListenerEquipmentUpdate listenerUpdate = new MyActionListenerEquipmentUpdate(equVerw,this);
        MyActionListenerEquipmentRead listenerRead = new MyActionListenerEquipmentRead(equVerw,this);
        MyActionListenerEquipmentReadAll listenerReadAll = new MyActionListenerEquipmentReadAll(equVerw,this);
        insert = new JButton ("Insert");
        update = new JButton ("Update");
        read = new JButton ("Read");
        readAll = new JButton("ReadAll");
        idLabel = new JLabel ("ID: ");
        bezeichnungLabel = new JLabel("Bezeichnung: ");
        idText = new JTextField (ALLBITS);
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
        String text=idText.getText();
        int result = Integer.parseInt(text);
        return result;
    }
    
    public String getBezeichnungText(){
        return bezeichnungText.getText();
    }
}
