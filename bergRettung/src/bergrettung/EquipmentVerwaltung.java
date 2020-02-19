/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bergrettung;

//import GUI.EquipmentView;
import Persistenz.EinfacheFactory;
import Persistenz.IEquipmentMapper;
import java.util.List;


public class EquipmentVerwaltung implements IVerwaltung{
    
    private final IEquipmentMapper mapper = EinfacheFactory.createEquipmentMapper();//(Die Klasse (Klasse kann man nur statische Instanzen schicken) EinfacheFactory hat eine Methode createPersonMapper)
    //private EquipmentView view;
    private Equipment equipment;
    
    public void insertEquipment(Equipment e){ 
        mapper.insertEquipment(e);
    }
    
    public Equipment readEquipment(int id){
        return mapper.readEquipment(id);
    }
    
    
    public List<Equipment> readAll(){
        return mapper.readAll();
    }
    
    public void updateEquipment(Equipment e){
        mapper.updateEquipment(e);
    }
    
    public void deleteEquipment (int id){
        mapper.deleteEquipment(id);
    }

//    public void setView(EquipmentView view) {
//        this.view = view;
//    }
    
}
