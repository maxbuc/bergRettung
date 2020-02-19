package bergrettung;
    
import Persistenz.EinfacheFactory;
import Persistenz.ISetupMapper;

public class Setup {
    ISetupMapper mapper = EinfacheFactory.createSetupMapper();
    
    public void deleteTable(){
        mapper.deleteTable();
    }
    public void createTable(){
        mapper.createTable();
    }
}
