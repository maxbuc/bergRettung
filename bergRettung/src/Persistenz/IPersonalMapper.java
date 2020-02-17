package Persistenz;

import bergrettung.Personal;
import java.util.List;

public interface IPersonalMapper {
    void einfuegen(Personal p);
    void loeschen(String id);
    void update(Personal p);
    List<Personal> lesenAlle();
}
