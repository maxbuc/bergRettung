
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

public class EinsatzJavaDBMapper implements IEinsatzMapper{
    private Integer anz;
    private final int size=4; 
    private final ConnectionPool pool=ConnectionPool.getSinglePool(size);
    
    @Override
    public void insertEinsatz(Einsatz e){
        Connection conn = pool.getConn();
        try {
            conn.setAutoCommit(false);
            PreparedStatement insert = conn.prepareStatement("insert into einsatz (id,datum,ort,stichwort) values (?,?,?,?)");
            insert.setInt(1, e.getId());
            insert.setString(2, e.getDatum());
            insert.setString(3,e.getOrt());
            insert.setString(4,e.getStichwort());
            anz = insert.executeUpdate();         
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
    public void updateEinsatz(Einsatz e){
        Connection conn = pool.getConn();
        try {
            PreparedStatement update = conn.prepareStatement("update einsatz set datum=? and ort=? and stichwort=? where id=?");
            update.setString(1, e.getDatum());
            update.setString(2, e.getOrt());
            update.setString(3, e.getStichwort());
            anz = update.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    @Override
    public void deleteEinsatz(int id){
        Connection conn = pool.getConn();
        try {
            PreparedStatement delete = conn.prepareStatement("delete from einsatz where id=?");
            delete.setInt(1,id);
            int anz = delete.executeUpdate();
            delete.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    @Override
    public Einsatz readEinsatz(int id){
        Connection conn = pool.getConn();
        Einsatz e;
        try {
            PreparedStatement select = conn.prepareStatement("select datum,ort,stichwort from einsatz where id =?");
            select.setInt(1,id);
            ResultSet rs = select.executeQuery();
            e = new Einsatz(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4));
            pool.releaseConn(conn);
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
            pool.releaseConn(conn);
            return null;
        }
    }
    
    @Override
    public List<Einsatz> readAll (){
        Connection conn = pool.getConn();
        List<Einsatz> alleEinsaetze = new ArrayList<>();
        try {
            PreparedStatement select = conn.prepareStatement("select id,datum,ort,stichwort from einsatz");
            ResultSet rs = select.executeQuery();
            while (rs.next()){
                 Einsatz e = new Einsatz(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(3));
                 alleEinsaetze.add(e);
            }
            return alleEinsaetze;
        } catch (SQLException ex) {
            Logger.getLogger(EinsatzJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
            return alleEinsaetze;
        }       
    }
}
