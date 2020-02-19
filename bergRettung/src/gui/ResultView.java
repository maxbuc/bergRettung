package gui;

import bergrettung.IVerwaltung;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ResultView extends JFrame{
    
    private JLabel ausgabe;
    
    private IVerwaltung verwaltung;
    
    public ResultView(String title, IVerwaltung verwaltung){
        super(title);
        this.verwaltung = verwaltung;
        ausgabe = new JLabel("");
        init();
    }
    
    public void init(){
        
        this.add(ausgabe);
        
        
       
        this.setLocation(800, 200);
        this.setSize(1200, 200);
        this.setVisible(true);
    }
    
    public void setResultView(String text){
        ausgabe.setText(text);
    }
    
    
    
    
}
