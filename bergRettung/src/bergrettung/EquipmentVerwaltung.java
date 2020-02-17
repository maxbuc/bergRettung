/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bergrettung;

import GUI.EquipmentView;
import Persistenz.EinfacheFactory;
import Persistenz.IEquipmentMapper;
import Persistenz.EquipmentJavaDBMapper;
import java.util.List;


public class EquipmentVerwaltung {
    
    private IEquipmentMapper mapper = EinfacheFactory.createEquipmentMapper();//(Die Klasse (Klasse kann man nur statische Instanzen schicken) EinfacheFactory hat eine Methode createPersonMapper)
    private EquipmentView view;
    private Equipment person;
    
    public void einfuegenEquipment(Equipment e){ 
        mapper.insertEquipment(e);
    }
    
    public Equipment readEquipment(int eqid){
        return mapper.readEquipment(eqid);
    }
    
    
    public List<Equipment> readAlles (){
        return mapper.readAlles();
    }
    
    public void updateEquipment(Equipment e){
        mapper.updateEquipment(e);
    }
    
    public void deleteEquipment (int eqid){
        mapper.deleteEquipment(eqid);
    }

    public void setView(EquipmentView view) {
        this.view = view;
    }
    
}
