
package bergrettung;

import Persistenz.EinfacheFactory;
import Persistenz.IEinsatzMapper;
import java.util.List;

public class EinsatzVerwaltungWrapper {
    IEinsatzMapper mapper = EinfacheFactory.createEinsatzMapper();
    
    public void insertEinsatz (Einsatz e){
        mapper.insertEinsatz(e);
    }
    public void deleteEinsatz (int id){
        mapper.deleteEinsatz(id);
    }
    public void updateEinsatz(Einsatz e){
        mapper.updateEinsatz(e);
    }
    public Einsatz readEinsatz(int id){
        System.out.println("wrapper");
        return mapper.readEinsatz(id);
    }
    public List<Einsatz> readAll(){
        return mapper.readAll();
    }
}
