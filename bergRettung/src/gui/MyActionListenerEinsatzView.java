
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bergrettung.EinsatzVerwaltung;
import bergrettung.Einsatz;

public class MyActionListenerEinsatzView implements ActionListener{
    private final  EinsatzVerwaltung einVerw;
    private final  MainView view;
    Einsatz einsatz;

    public MyActionListenerEinsatzView(EinsatzVerwaltung einVerw, MainView view) {
        this.einVerw = einVerw;
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        EinsatzView einsatzView = new EinsatzView("Einsatz",einVerw);
    }
}
