
package bergrettung;

import Persistenz.EinfacheFactory;
import Persistenz.IEinsatzMapper;
import java.util.List;

public class EinsatzVerwaltung {
    private final IEinsatzMapper mapper = EinfacheFactory.createEinsatzMapper();
    private Einsatz einsatz;
    
     public void insertEinsatz(Einsatz e){
        mapper.insertEinsatz(e);
    }   
     
    public Einsatz readEinsatz(int id){
        return mapper.readEinsatz(id);
    } 
    
    public void deleteEinsatz(int id){
        mapper.deleteEinsatz(id);
    }
    
    public EinsatzVerwaltung(){
        this.einsatz=einsatz;
    }
    
    public void updateEinsatz(Einsatz e){
        mapper.updateEinsatz(e);
    }
    
    public List<Einsatz> readAll(){
        return mapper.readAll();
    }
}
