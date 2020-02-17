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
    private List<String>//was hier?? alleHobbies;
    
    public void insertEquipment(Equipment e){
        Connection conn = pool.getConn();
        //alleHobbies = p.getHobbies();
        try {
            conn.setAutoCommit(false);
            PreparedStatement insert = conn.prepareStatement("insert into equipment (id) values (?,?)");
            insert.setString(1, e.getEqid());
            anz = insert.executeUpdate(); //insert, delete, update in sql
            //PreparedStatement insertH = conn.prepareStatement("insert into hobbies (pid,hobby) values (?,?)");
            //insertH.setString(1, p.getId());
             
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
            PreparedStatement update = conn.prepareStatement("update personen set name=? where id=?");
            update.setString(1, e.getBezeichnung());
            update.setString(2, e.getEqid());
            anz = update.executeUpdate();
            PreparedStatement updateH1 = conn.prepareStatement("delete from hobbies where pid=?");
            updateH1.setString(1,e.getEqid());
            updateH1.executeUpdate();
            PreparedStatement updateH2 = conn.prepareStatement("insert into hobbies (pid,hobby) values (?,?)");
            updateH2.setString(1,e.getId());
            for(int i=0; i<alleHobbies.size();i++){
                String h = alleHobbies.get(i);
                updateH2.setString(2,h);
                updateH2.executeUpdate();
            }    
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    public void deleteEquipment(int eqid){
        Connection conn = pool.getConn();
        try {
            PreparedStatement delete = conn.prepareStatement("delete from personen where id=?");
            delete.setString(1,eqid);
            int anz = delete.executeUpdate();
            PreparedStatement deleteH = conn.prepareStatement("delete from hobbies where pid=?");
            deleteH.setString(1,eqid);
            deleteH.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EquipmentJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
    public Equipment readEquipment(String id){
        Connection conn = pool.getConn();
        Equipment e = null;
        try {
            alleHobbies = new ArrayList<>();
            PreparedStatement select = conn.prepareStatement("select name,hobby from personen left outer join hobbies on id=pid where id =?");
            select.setString(1,id);
            ResultSet rs = select.executeQuery();
            //1. Zeile für Person
            if(rs.next()){
                e = new Equipment(rs.getString(1),eqid);
                alleHobbies.add(rs.getString(2));
            }
            //Alle anderen für restliche Hobbies
            while (rs.next()){
                alleHobbies.add(rs.getString(2));
            }
            if( e!=null){
                e.setHobbies(alleHobbies);
            }
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
            PreparedStatement select = conn.prepareStatement("select name,id from personen");
            ResultSet rs = select.executeQuery();
            while (rs.next()){
                 Equipment e = new Equipment(rs.getString(1),rs.getString(2));
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
        List<String> alleHobbies= null;
        Equipment e =null;
        try {
            PreparedStatement read=conn.prepareStatement("select name, id, hobby from personen left outer join hobbies on id=pid order by pid");
            ResultSet rs= read.executeQuery();
            String alt="";
            while(rs.next()){
                if(!alt.equals(rs.getString(1))){
                    e = new Equipment(rs.getString(1), rs.getString(2));
                    alleHobbies = new ArrayList<>();
                    e.setHobbies(alleHobbies);
                    alt=rs.getString(1);
                    alle.add(e);
                }
                if(rs.getString(3) !=null){
                    alleHobbies.add(rs.getString(3).trim());
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
