package gui;

import bergrettung.Personal;
import bergrettung.PersonalVerwaltung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MyActionListenerPersonalCheckBoxBestaetigen implements ActionListener {

    private PersonalCheckBoxView view;
    private EinsatzView einView;
    private PersonalVerwaltung persVerw;

    public MyActionListenerPersonalCheckBoxBestaetigen(PersonalCheckBoxView view, EinsatzView einView) {
        this.view = view;
        this.einView = einView;
        this.persVerw = new PersonalVerwaltung();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<Personal> personal = new ArrayList<>();
        for(int i = 0; i < view.getBoxen().size(); i++){
            if(view.getBoxen().get(i).isSelected()){
                String[] split = view.getBoxen().get(i).getText().split("; ");
                personal.add(persVerw.read(Integer.parseInt(split[1])));
                
            }
        }
        einView.setPersonalList(personal);
        einView.deletePersListener();
        view.dispose();
        
    }

}
