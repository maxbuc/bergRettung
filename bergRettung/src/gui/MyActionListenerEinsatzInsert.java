package gui;

import bergrettung.Einsatz;
import bergrettung.EinsatzVerwaltung;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class MyActionListenerEinsatzInsert implements ActionListener {

    private final EinsatzView view;
    private final EinsatzVerwaltung einVerw;
    private Einsatz einsatz;

    public MyActionListenerEinsatzInsert(EinsatzView view, EinsatzVerwaltung verw) {
        this.view = view;
        this.einVerw = verw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (view.getTextId()>0 && einVerw.readEinsatz(view.getTextId())==null && !view.getTextDatum().isEmpty() && !view.getTextOrt().isEmpty() && !view.getTextStichwort().isEmpty() && isDate(view.getTextDatum())) {
            einsatz = new Einsatz(view.getTextId(), view.getTextDatum(), view.getTextOrt(), view.getTextStichwort());
            einsatz.setPersonal(view.getPersonalList());
            einsatz.setEquipment(view.getEquipmentList());
            einsatz.setPatienten(view.getPatientList());
            einVerw.insertEinsatz(einsatz);

            view.dispose();
        }else{
            if(view.getTextId()<1 || einVerw.readEinsatz(view.getTextId())!=null){
                view.getIdField().setBackground(Color.red);
            }else{
                view.getIdField().setBackground(Color.WHITE);
            }
            if(view.getTextDatum().isEmpty() || !isDate(view.getTextDatum())){
                view.getDatumField().setBackground(Color.red);
            }else{
                view.getDatumField().setBackground(Color.WHITE);
            }
            if(view.getTextOrt().isEmpty()){
                view.getOrtField().setBackground(Color.red);
            }else{
                view.getOrtField().setBackground(Color.WHITE);
            }
            if(view.getTextStichwort().isEmpty()){
                view.getStichwortField().setBackground(Color.red);
            }else{
                view.getStichwortField().setBackground(Color.WHITE);
            }
        }
    }
    
    
    public boolean isDate(String date) {

        String formatString = "yyyy-MM-dd";
            
        
        
        try {
            SimpleDateFormat format = new SimpleDateFormat(formatString);
            format.setLenient(false);
            format.parse(date);
        } catch (ParseException e) {
            return false;
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
    }
}
