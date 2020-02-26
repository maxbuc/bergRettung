package Persistenz.persistenzTest;

import Persistenz.*;
import bergrettung.Personal;

public class PersonalJavaDBMapperTest {

    PersonalJavaDBMapper mapper = new PersonalJavaDBMapper();

    Personal p;
    String vorname = "Max";
    String nachname = "Buchner";
    int id = 20;
    String gebdat = "2000-02-23";
    String qual = "FRS";

    public PersonalJavaDBMapperTest() {
        p = new Personal(id, vorname, nachname, gebdat, qual);
        insert();
        update();
        read();
        readAll();
        getNextFree();
    }

    public void insert() {
        mapper.insert(p);
        if (mapper.read(id).toString().equals(p.toString())) {
            System.out.println("insertPersonal Test erfolgreich");
        }else{
            System.err.println("insertPersonal");
        }
    }

    public void update() {
        p.setQualifikation("Arzt");
        mapper.update(p);
        if(mapper.read(id).toString().equals(p.toString())){
            System.out.println("updatePersonal Test erfolgreich");
        }else{
            System.err.println("updatePersonal");
        }

    }

    public void readAll() {
        if (mapper.readAll().get(mapper.readAll().size() - 1).toString().equals(p.toString())) {
            System.out.println("readAll Test erfolgreich");
        }else{
            System.err.println("readAll");
        }
    }

    public void read() {
        if (mapper.read(id).toString().equals(p.toString())) {
            System.out.println("readPersonal Test erfolgreich");
        }else{
            System.err.println("readPersonal");
        }
    }

    public void getNextFree() {
        if (mapper.getNextFree() == id + 1) {
            System.out.println("getNextFree Test erfolgreich");
        }else{
            System.err.println("getNextFree");
        }
    }

}
