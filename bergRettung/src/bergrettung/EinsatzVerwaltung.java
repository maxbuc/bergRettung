
package bergrettung;

import java.util.List;

public class EinsatzVerwaltung implements IVerwaltung{
    private EinsatzVerwaltungWrapper wrapper = new EinsatzVerwaltungWrapper();
    
     public void insertEinsatz(Einsatz e){
        wrapper.insertEinsatz(e);
    }   
     
    public Einsatz readEinsatz(int id){
        System.out.println("verwaltung");
        return wrapper.readEinsatz(id);
    } 
    
    public void deleteEinsatz(int id){
        wrapper.deleteEinsatz(id);
    }
    
    public void updateEinsatz(Einsatz e){
        wrapper.updateEinsatz(e);
    }
    
    public List<Einsatz> readAll(){
        return wrapper.readAll();
    }
    
    
}
