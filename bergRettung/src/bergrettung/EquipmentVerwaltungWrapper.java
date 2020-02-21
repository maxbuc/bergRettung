
package bergrettung;

import Persistenz.EinfacheFactory;
import Persistenz.IEquipmentMapper;
import java.util.List;

public class EquipmentVerwaltungWrapper {
    IEquipmentMapper mapper = EinfacheFactory.createEquipmentMapper();
    
    public void insertEquipment (Equipment e){
        mapper.insertEquipment(e);
    }
    public void deleteEquipment (int id){
        mapper.deleteEquipment(id);
    }
    public void updateEquipment(Equipment e){
        mapper.updateEquipment(e);
    }
    public Equipment readEquipment(int id){
        return mapper.readEquipment(id);
    }
    public List<Equipment> readAll(){
        return mapper.readAll();
    }
    
    public int getNextFree(){
        return mapper.getNextFree();
    }
    
}
