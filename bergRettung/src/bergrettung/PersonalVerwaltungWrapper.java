package bergrettung;

import Persistenz.EinfacheFactory;
import Persistenz.IPersonalMapper;

public class PersonalVerwaltungWrapper {
    IPersonalMapper mapper = EinfacheFactory.createPersonalMapper();
}
