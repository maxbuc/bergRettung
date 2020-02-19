package Persistenz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bergrettung.Einsatz;
import bergrettung.Equipment;
import bergrettung.Patient;
import bergrettung.Personal;

public class EinsatzJavaDBMapper implements IEinsatzMapper {

    private Integer anz;
    private final int size = 4;
    private final ConnectionPool pool = ConnectionPool.getSinglePool(size);

    @Override
    public void insertEinsatz(Einsatz e) {
        Connection conn = pool.getConn();
        try {
            conn.setAutoCommit(false);

            PreparedStatement insert = conn.prepareStatement("insert into einsatz (id,datum,ort,stichwort) values (?,?,?,?)");
            insert.setInt(1, e.getId());
            insert.setString(2, e.getDatum());
            insert.setString(3, e.getOrt());
            insert.setString(4, e.getStichwort());
            anz = insert.executeUpdate();

            if (!e.getPersonal().isEmpty()) {
                this.addPersonal(e);
            }
            if (!e.getPatienten().isEmpty()) {
                this.addPatient(e);
            }
            if (!e.getEquipment().isEmpty()) {
                this.addEquipment(e);
            }

            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        pool.releaseConn(conn);
    }

    @Override
    public void updateEinsatz(Einsatz e) {
        Connection conn = pool.getConn();
        try {
            PreparedStatement update = conn.prepareStatement("update einsatz set datum=?, ort=?, stichwort=? where id=?");
            update.setString(1, e.getDatum());
            update.setString(2, e.getOrt());
            update.setString(3, e.getStichwort());
            update.setInt(4, e.getId());
            anz = update.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

    @Override
    public void deleteEinsatz(int id) {
        Connection conn = pool.getConn();
        try {
            PreparedStatement delete = conn.prepareStatement("delete from einsatz where id=?");
            delete.setInt(1, id);
            anz = delete.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

    public Einsatz readEinsatzAlt(int id) {
        Connection conn = pool.getConn();
        Einsatz e;
        try {
            PreparedStatement select = conn.prepareStatement("select * from einsatz where id =?");
            select.setInt(1, id);
            ResultSet rs = select.executeQuery();
            if (rs.next()) {
                e = new Einsatz(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                return e;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
        return null;
    }

    @Override
    public Einsatz readEinsatz(int id) {
        Connection conn = pool.getConn();
        Einsatz e;
        Personal p;
        Patient pat;
        Equipment equ;
        
        
        try {

            //Abfrage für bestimmten Einsatz
            PreparedStatement select = conn.prepareStatement("select * from einsatz where id = ?");
            select.setInt(1, id);
            ResultSet result = select.executeQuery();
            if (result.next()) {
                //erstellt Einsatz aus SQL Abfrage
                e = new Einsatz(result.getInt(1), result.getDate(2).toString(), result.getString(3), result.getString(4));
            } else {
                return new Einsatz(0, "Falsche ID übergeben", "", "");
            }

            //Personal von Einsatz ausgeben und zu Einsatz hinzufügen
            select = conn.prepareStatement("select personal.* from personal, einsatz_personal where personal.id = EINSATZ_PERSONAL.PID AND EINSATZ_PERSONAL.EID = ?");
            select.setInt(1, id);
            result = select.executeQuery();
            while (result.next()) {
                //Personal erzeugen
                p = new Personal(result.getInt(1), result.getString(2), result.getString(3));
                if (result.getString(4) != null) {
                    p.setGebdat(result.getString(4));
                }
                if (result.getString(5) != null) {
                    p.setQualifikation(result.getString(5));
                }
                e.addPersonal(p);
            }

            //Patient(en) von Einsatz ausgeben und zu Einsatz hinzufügen
            select = conn.prepareStatement("select patient.* from patient, einsatz_patient where patient.id = einsatz_patient.paid AND EINSATZ_PATient.EID = ?");
            select.setInt(1, id);
            result = select.executeQuery();
            while (result.next()) {
                //Patient erzeugen
                pat = new Patient(result.getInt(1), result.getString(2), result.getString(3));
                e.addPatient(pat);
            }

            //Equipment von Einsatz ausgeben und zu Einsatz hinzufügen
            select = conn.prepareStatement("select equipment.* from equipment, einsatz_equipment where equipment.id = einsatz_equipment.eqid AND EINSATZ_equipment.EID = ?");
            select.setInt(1, id);
            result = select.executeQuery();
            while (result.next()) {
                //Patient erzeugen
                equ = new Equipment(result.getString(2), result.getInt(1));
                e.addEquipment(equ);
            }
            
            return e;

        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
        return null;
    }

    @Override
    public List<Einsatz> readAll() {
        Connection conn = pool.getConn();
        List<Einsatz> alleEinsaetze = new ArrayList<>();
        try {
            PreparedStatement select = conn.prepareStatement("select id,datum,ort,stichwort from einsatz");
            ResultSet rs = select.executeQuery();
            while (rs.next()) {
                Einsatz e = new Einsatz(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(3));
                alleEinsaetze.add(e);
            }
            return alleEinsaetze;
        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
            return alleEinsaetze;
        }
    }

    // Fügt Daten in Koppeltabellen ein
    private void addPersonal(Einsatz e) {
        Connection conn = pool.getConn();
        try {
            PreparedStatement personal = conn.prepareStatement("insert into einsatz_personal values(?,?)");
            for (int i = 0; i < e.getPersonal().size(); i++) {
                personal.setInt(1, e.getPersonal().get(i).getId());
                personal.setInt(2, e.getId());
                anz = personal.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

    private void addPatient(Einsatz e) {
        Connection conn = pool.getConn();
        try {
            PreparedStatement patient = conn.prepareStatement("insert into einsatz_patient values(?,?)");
            for (int i = 0; i < e.getPersonal().size(); i++) {
                patient.setInt(1, e.getPatienten().get(i).getId());
                patient.setInt(2, e.getId());
                anz = patient.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

    private void addEquipment(Einsatz e) {
        Connection conn = pool.getConn();
        try {
            PreparedStatement equipment = conn.prepareStatement("insert into einsatz_equipment values(?,?)");
            for (int i = 0; i < e.getEquipment().size(); i++) {
                equipment.setInt(1, e.getEquipment().get(i).getId());
                equipment.setInt(2, e.getId());
                anz = equipment.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

}
