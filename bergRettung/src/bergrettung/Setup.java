package bergrettung;
    
import Persistenz.EinfacheFactory;
import Persistenz.ISetupMapper;
import java.sql.SQLSyntaxErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Setup {
    ISetupMapper mapper = EinfacheFactory.createSetupMapper();
    
    public void deleteTable(){
        try {
            mapper.deleteTable();
        } catch (SQLSyntaxErrorException ex) {
            Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void createTable(){
        try {
            mapper.createTable();
        } catch (SQLSyntaxErrorException ex) {
            Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
