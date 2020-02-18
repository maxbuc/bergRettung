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

    @Override
    public Einsatz readEinsatz(int id) {
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
    
    public Einsatz read(int id){
        Connection conn = pool.getConn();
        Einsatz e;
        try {
            PreparedStatement select = conn.prepareStatement(
                    "select ein.id, datum, ort, stichwort, equ.id, bezeichnung, pat.id, pat.vorname, pat.nachname, pers.id, pers.vorname, pers.nachname, gebdat, qual"
                            + "from einsatz ein, equipment equ, patient pat, personal pers, einsatz_equipment ee, einsatz_patient epat, einsatz_personal epers"
                            + "where ein.id = ee.eid AND equ.id = ee.eqid"
                            + "AND ein.id = epat.eid AND epat.paid = pat.id"
                            + "AND ein.id = epers.eid AND epers.pid = pers.id"
                            + "AND ein.id = ?");
            select.setInt(1, id);
            ResultSet result = select.executeQuery();
            if(result.next()){
                //erstelle Einsatz aus SQL Abfrage
            }
            
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
                equipment.setInt(1, e.getEquipment().get(i).getEqid());
                equipment.setInt(2, e.getId());
                anz = equipment.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

}
