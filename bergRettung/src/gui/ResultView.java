package gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public final class ResultView extends JFrame{
    
    private final JTextArea ausgabe;
    
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
