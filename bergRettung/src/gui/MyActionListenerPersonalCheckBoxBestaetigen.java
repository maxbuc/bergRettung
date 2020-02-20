package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerPersonalCheckBoxBestaetigen implements ActionListener {

    private PersonalCheckBoxView view;
    private EinsatzView einView;

    public MyActionListenerPersonalCheckBoxBestaetigen(PersonalCheckBoxView view, EinsatzView einView) {
        this.view = view;
        this.einView = einView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < view.getBoxen().size(); i++){
            if(view.getBoxen().get(i).isSelected()){
                System.out.println(view.getBoxen().get(i).getText());
            }
        }
    }

}
