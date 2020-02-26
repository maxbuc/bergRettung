package bergrettung;
    
import Persistenz.EinfacheFactory;
import Persistenz.ISetupMapper;
import java.sql.SQLSyntaxErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Setup {
    ISetupMapper mapper = EinfacheFactory.createSetupMapper();
    
    public void deleteTable(){
            mapper.deleteTable();
    }
    public void createTable(){
        mapper.createTable();
    }
}
