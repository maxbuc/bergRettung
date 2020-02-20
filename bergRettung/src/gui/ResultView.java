package gui;

import bergrettung.IVerwaltung;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class ResultView extends JFrame{
    
    private JTextArea ausgabe;
    
    private IVerwaltung verwaltung;
    
    public ResultView(String title){
        super(title);
        ausgabe = new JTextArea("");
        init();
    }
    
    public void init(){
        
        this.add(ausgabe);
        
        ausgabe.setEditable(false);
        ausgabe.setForeground(Color.BLACK);
        this.setLocation(600, 200);
        this.setSize(650, 300);
        this.setVisible(true);
    }
    
    public void setResultView(String text){
        ausgabe.setText(text);
    }
    
    
    
    
}
