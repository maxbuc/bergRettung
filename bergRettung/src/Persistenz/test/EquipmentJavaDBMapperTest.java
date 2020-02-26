/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz.test;

import Persistenz.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bergrettung.Equipment;
      

public class EquipmentJavaDBMapperTest{
    
    private final int size = 4;//Konstante final
    private final ConnectionPool pool = ConnectionPool.getSinglePool(size);
    private Integer anz;
    
    
    @Override
    public void insertEquipment(Equipment e){
        Connection conn = pool.getConn();
        //alleHobbies = p.getHobbies();
        try {
            PreparedStatement insert = conn.prepareStatement("insert into equipment (bezeichnung, id) values (?,?)");
            insert.setString(1, e.getBezeichnung());
            insert.setInt(2, e.getId());
            anz = insert.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapperTest.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(EquipmentJavaDBMapperTest.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        pool.releaseConn(conn);
    }
    
    
    @Override
    public void updateEquipment(Equipment e){
        Connection conn = pool.getConn();
        //alleHobbies = p.getHobbies();
        try {
            PreparedStatement update = conn.prepareStatement("update equipment set bezeichnung=? where id=?");
            update.setString(1, e.getBezeichnung());
            update.setInt(2, e.getId());
            anz = update.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapperTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    @Override
    public void deleteEquipment(int id){
        Connection conn = pool.getConn();
        try {
            PreparedStatement delete = conn.prepareStatement("delete from equipment where id=?");
            delete.setInt(1,id);
            anz = delete.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapperTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    @Override
    public Equipment readEquipment(int id){
        Connection conn = pool.getConn();
        Equipment e;
        try {
            PreparedStatement select = conn.prepareStatement("select * from equipment where id =?");
            select.setInt(1,id);
            ResultSet rs = select.executeQuery();
            pool.releaseConn(conn);
            if(rs.next()){
                e = new Equipment(rs.getString(2),rs.getInt(1));
                return e;
            }  
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapperTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
        return null;
    }
    
    @Override
    public List<Equipment> readAll (){
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
            Logger.getLogger(EquipmentJavaDBMapperTest.class.getName()).log(Level.SEVERE, null, ex);
            return alleEquipment;
        }       
    }
    
    public int getNextFree(){
        Connection conn = pool.getConn();
        try {
            PreparedStatement max = conn.prepareStatement("select max(id) from equipment");
            ResultSet result = max.executeQuery();
            if(result.next()){
                return result.getInt(1)+1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapperTest.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return 0;
    }
    
}
