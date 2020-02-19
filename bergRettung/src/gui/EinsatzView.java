
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
        
        this.add(labelId);
        this.add(textId);
        this.add(labelDatum);
        this.add(textDatum);
        this.add(labelOrt);
        this.add(textOrt);
        this.add(labelStichwort);
        this.add(textStichwort);
        
        
        
        
        
        
        
        
        
        this.setLocation(500,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
}
