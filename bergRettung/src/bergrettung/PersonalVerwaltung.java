package bergrettung;

import java.util.List;

public class PersonalVerwaltung {
    PersonalVerwaltungWrapper wrapper = new PersonalVerwaltungWrapper();
    
    public void insert(Personal p){
        wrapper.insert(p);
    }
    public void delete(int id){
        wrapper.delete(id);
    }
    public void update(Personal p){
        wrapper.update(p);
    }
    public Personal read(int id){
        return wrapper.read(id);
    }
    public List<Personal> readAll(){
        return wrapper.readAll();
    }
}
