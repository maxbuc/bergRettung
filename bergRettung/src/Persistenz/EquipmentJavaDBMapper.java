/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bergrettung.Equipment;
      

public class EquipmentJavaDBMapper implements IEquipmentMapper {
    
    private final int size = 4;//Konstante final
    private ConnectionPool pool = ConnectionPool.getSinglePool(size);
    private Integer anz;
    
    
    public void insertEquipment(Equipment e){
        Connection conn = pool.getConn();
        //alleHobbies = p.getHobbies();
        try {
            PreparedStatement insert = conn.prepareStatement("insert into equipment (bezeichnung, id) values (?,?)");
            insert.setString(1, e.getBezeichnung());
            insert.setInt(2, e.getEqid());
            anz = insert.executeUpdate();
             
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(EquipmentJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        pool.releaseConn(conn);
    }
    
    
    public void updateEquipment(Equipment e){
        Connection conn = pool.getConn();
        //alleHobbies = p.getHobbies();
        try {
            PreparedStatement update = conn.prepareStatement("update equipment set bezeichnung=? where id=?");
            update.setString(1, e.getBezeichnung());
            update.setInt(2, e.getEqid());
            anz = update.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    public void deleteEquipment(int eqid){
        Connection conn = pool.getConn();
        try {
            PreparedStatement delete = conn.prepareStatement("delete from equipment where id=?");
            delete.setInt(1,eqid);
            int anz = delete.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    public Equipment readEquipment(int id){
        Connection conn = pool.getConn();
        Equipment e = null;
        try {
            PreparedStatement select = conn.prepareStatement("select bezeichnung, id from equipment where id =?");
            select.setInt(1,id);
            ResultSet rs = select.executeQuery();
            pool.releaseConn(conn);
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
            pool.releaseConn(conn);
            return null;
        }
    }
    
    public List<Equipment> readAlleEquipment (){
        Connection conn = pool.getConn();
        List<Equipment> alleEquipment = new ArrayList<>();
        try {
            PreparedStatement select = conn.prepareStatement("select bezeichnung,id from equipment");
            ResultSet rs = select.executeQuery();
            while (rs.next()){
                 Equipment e = new Equipment(rs.getString(1),rs.getInt(2));
                 alleEquipment.add(e);
            }
            return alleEquipment;
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
            return alleEquipment;
        }       
    }
    
    public List<Equipment> readAlles (){
        Connection conn = pool.getConn();
        List<Equipment> alle = new ArrayList();
        Equipment e =null;
        try {
            PreparedStatement read=conn.prepareStatement("select bezeichnung, id from equipment order by id");
            ResultSet rs= read.executeQuery();
            String alt="";
            while(rs.next()){
                if(!alt.equals(rs.getString(1))){
                    e = new Equipment(rs.getString(1), rs.getInt(2));
                    alt=rs.getString(1);
                    alle.add(e);
                }
                if(rs.getString(3) !=null){
//                    alleHobbies.add(rs.getString(3).trim());
                    ;
                }
        }
            rs.close();
            pool.releaseConn(conn);
            return alle;
        }
        catch (SQLException ex){
            Logger.getLogger(EquipmentJavaDBMapper.class.getName()).log(Level.SEVERE,null,ex);
            pool.releaseConn(conn);
            return alle;}
    }
}
