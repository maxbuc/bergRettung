
package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PatientView extends JFrame{

    public PatientView(){
        super();
        init();
    }
    
    
    
    public void init(){
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,200);
        this.setSize(850,200);
        this.setVisible(true);
    }
}
