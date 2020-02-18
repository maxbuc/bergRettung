
package bergrettung;

import Persistenz.EinfacheFactory;
import Persistenz.IEquipmentMapper;
import java.util.List;

public class EquipmentVerwaltungWrapper {
    IEquipmentMapper mapper = EinfacheFactory.createEquipmentMapper();
    
    public void insertEquipment (Equipment e){
        mapper.insertEquipment(e);
    }
    public void deleteEquipment (int eqid){
        mapper.deleteEquipment(eqid);
    }
    public void updateEquipment(Equipment e){
        mapper.updateEquipment(e);
    }
    public Equipment readEquipment(int eqid){
        return mapper.readEquipment(eqid);
    }
    public List<Equipment> readAlles(){
        return mapper.readAlles();
    }
    
}
