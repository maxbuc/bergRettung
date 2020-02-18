
package Persistenz;

import bergrettung.Einsatz;
import java.util.List;

public interface IEinsatzMapper {
    Einsatz readEinsatz(int id);
    List<Einsatz> readAll();
    void updateEinsatz(Einsatz e);
    void insertEinsatz(Einsatz e);
    void deleteEinsatz(int id); 
}
