package bergrettung;

import Persistenz.EinfacheFactory;
import Persistenz.IPersonalMapper;
import java.util.List;

public class PersonalVerwaltungWrapper {
    IPersonalMapper mapper = EinfacheFactory.createPersonalMapper();
    
    public void insert (Personal p){
        mapper.insert(p);
    }
    public void delete (int id){
        mapper.delete(id);
    }
    public void update(Personal p){
        mapper.update(p);
    }
    public Personal read(int id){
        return mapper.read(id);
    }
    public List<Personal> readAll(){
        return mapper.readAll();
    }
}
