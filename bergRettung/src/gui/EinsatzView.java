
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import bergrettung.EinsatzVerwaltung;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EinsatzView extends JFrame{
    private EinsatzVerwaltung einVerw;
    private JLabel labelId;
    private JLabel labelDatum;
    private JLabel labelOrt;
    private JLabel labelStichwort;
    
    private JTextField textId;
    private JTextField textDatum;
    private JTextField textOrt;
    private JTextField textStichwort;
    
    private JButton insert;
    private JButton read;
    
    private MyActionListenerEinsatzInsert listenerInsert;
    private MyActionListenerEinsatzRead listenerRead;
    
    public EinsatzView(String titel, EinsatzVerwaltung einVerw){
        super(titel);
        this.einVerw=einVerw;
        init();
    }
    
        public void init(){
        this.setLayout(new FlowLayout());
        
        labelId = new JLabel("ID");
        textId = new JTextField(ALLBITS);
        labelDatum = new JLabel("Datum");
        textDatum = new JTextField(ALLBITS);
        labelOrt = new JLabel("Ort");
        textOrt = new JTextField(ALLBITS);
        labelStichwort = new JLabel("Stichwort");
        textStichwort = new JTextField(ALLBITS);
        insert = new JButton("insert");
        read = new JButton("read");
        
        listenerInsert = new MyActionListenerEinsatzInsert(this, einVerw);
        listenerRead = new MyActionListenerEinsatzRead(this, einVerw);
        
        this.add(labelId);
        this.add(textId);
        this.add(labelDatum);
        this.add(textDatum);
        this.add(labelOrt);
        this.add(textOrt);
        this.add(labelStichwort);
        this.add(textStichwort);
        this.add(insert);
        this.add(read);
        
        insert.addActionListener(listenerInsert);
        read.addActionListener(listenerRead);
        
        
        
        
        
        
        
        
        this.setLocation(500,200);
        this.setSize(850,200);
        this.setVisible(true);
    }

    public int getTextId() {
        int i= Integer.parseInt(textId.getText());
        System.out.println(i);
        return i;
    }

    public String getTextDatum() {
        return textDatum.getText();
    }

    public String getTextOrt() {
        return textOrt.getText();
    }

    public String getTextStichwort() {
        return textStichwort.getText();
    }
        
        
        
        
        
}
