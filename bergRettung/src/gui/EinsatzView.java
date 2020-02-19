
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import bergrettung.EinsatzVerwaltung;

public class EinsatzView extends JFrame{
    private EinsatzVerwaltung einVerw;
    public EinsatzView(String titel, EinsatzVerwaltung einVerw){
        super(titel);
        this.einVerw=einVerw;
        init();
    }
    
        public void init(){
        this.setLayout(new FlowLayout());
        this.setLocation(500,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
}
