
package Persistenz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bergrettung.Patient;

public class PatientJavaDBMapper implements IPatientMapper{
    private Integer anz;
    private final int size=4; 
    private final ConnectionPool pool=ConnectionPool.getSinglePool(size);
    
    @Override
    public void insertPatient(Patient p){
        Connection conn = pool.getConn();
        try {
            conn.setAutoCommit(false);
            PreparedStatement insert = conn.prepareStatement("insert into patient (id,vorname,nachname) values (?,?,?)");
            insert.setInt(1, p.getId());
            insert.setString(2, p.getVorname());
            insert.setString(3,p.getNachname());
            anz = insert.executeUpdate();         
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(PatientJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PatientJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        pool.releaseConn(conn);
    }
    
    @Override
    public void updatePatient(Patient p){
        Connection conn = pool.getConn();
        try {
            PreparedStatement update = conn.prepareStatement("update patient set vorname=?, nachname=? where id=?");
            update.setString(1, p.getVorname());
            update.setString(2, p.getNachname());
            update.setInt(3,p.getId());
            anz = update.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(PatientJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    @Override
    public void deletePatient(int id){
        Connection conn = pool.getConn();
        try {
            PreparedStatement delete = conn.prepareStatement("delete from patient where id=?");
            delete.setInt(1,id);
            int anz = delete.executeUpdate();
            delete.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PatientJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    @Override
    public Patient readPatient(int id){
        Connection conn = pool.getConn();
        Patient p;
        try {
            PreparedStatement select = conn.prepareStatement("select * from patient where id =?");
            select.setInt(1,id);
            ResultSet rs = select.executeQuery();
            if(rs.next()){
                p = new Patient(rs.getInt(1),rs.getString(2), rs.getString(3));
                return p;
            }            
        } catch (SQLException ex) {
            Logger.getLogger(PatientJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
        return null;
    }
    
    @Override
    public List<Patient> readAll (){
        Connection conn = pool.getConn();
        List<Patient> allePatienten = new ArrayList<>();
        try {
            PreparedStatement select = conn.prepareStatement("select id,vorname,nachname from patient");
            ResultSet rs = select.executeQuery();
            while (rs.next()){
                 Patient p = new Patient(rs.getInt(1),rs.getString(2), rs.getString(3));
                 allePatienten.add(p);
            }
            return allePatienten;
        } catch (SQLException ex) {
            Logger.getLogger(PatientJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
            return allePatienten;
        }       
    }
}
