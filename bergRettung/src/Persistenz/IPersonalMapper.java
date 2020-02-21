package Persistenz;

import bergrettung.Personal;
import java.util.List;

public interface IPersonalMapper {
    void insert(Personal p);
    void delete(int id);
    void update(Personal p);
    List<Personal> readAll();
    Personal read(int id);
    int getNextFree();
}
