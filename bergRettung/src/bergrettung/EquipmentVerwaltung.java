
package bergrettung;

//import GUI.EquipmentView;
import Persistenz.EinfacheFactory;
import Persistenz.IEquipmentMapper;
import java.util.List;


public class EquipmentVerwaltung{
    
    private final IEquipmentMapper wrapper = EinfacheFactory.createEquipmentMapper();//(Die Klasse (Klasse kann man nur statische Instanzen schicken) EinfacheFactory hat eine Methode createPersonMapper)
    //private EquipmentView view;
    private Equipment equipment;
    
    public void insertEquipment(Equipment e){ 
        wrapper.insertEquipment(e);
    }
    
    public Equipment readEquipment(int id){
        return wrapper.readEquipment(id);
    }
    
    
    public List<Equipment> readAll(){
        return wrapper.readAll();
    }
    
    public void updateEquipment(Equipment e){
        wrapper.updateEquipment(e);
    }
    
    public void deleteEquipment (int id){
        wrapper.deleteEquipment(id);
    }

}
