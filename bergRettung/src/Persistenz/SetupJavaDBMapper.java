package Persistenz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SetupJavaDBMapper implements ISetupMapper {
    private Integer anz;
    private final int SIZE = 4;
    private ConnectionPool pool = ConnectionPool.getSinglePool(SIZE);

    @Override
    public void deleteTable() throws SQLSyntaxErrorException{
        try {
            Connection conn = pool.getConn();
            
            PreparedStatement drop = conn.prepareStatement("drop table einsatz_equipment");
            anz = drop.executeUpdate();
            
            drop = conn.prepareStatement("drop table einsatz_patient");
            anz = drop.executeUpdate();
            
            drop = conn.prepareStatement("drop table einsatz_personal");
            anz = drop.executeUpdate();
            
            drop = conn.prepareStatement("drop table einsatz");
            anz = drop.executeUpdate();
            
            drop = conn.prepareStatement("drop table equipment");
            anz = drop.executeUpdate();
            
            drop = conn.prepareStatement("drop table patient");
            anz = drop.executeUpdate();
            
            drop = conn.prepareStatement("drop table personal");
            anz = drop.executeUpdate();
            
            
            pool.releaseConn(conn);
        } catch (SQLException ex) {
            Logger.getLogger(SetupJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void createTable() throws SQLSyntaxErrorException{
        Connection conn = pool.getConn();
        try {
            PreparedStatement insert = conn.prepareStatement("create table einsatz(id int primary key, datum date, ort varchar(20), stichwort varchar(40))");
            anz = insert.executeUpdate();
            
            insert = conn.prepareStatement("create table equipment(id int primary key, bezeichnung varchar(40))");
            anz = insert.executeUpdate();
            
            insert = conn.prepareStatement("create table patient(id int primary key, vorname varchar(20), nachname varchar(20))");
            anz = insert.executeUpdate();
            
            insert = conn.prepareStatement("create table personal(id int primary key, vorname varchar(20), nachname varchar(20), gebdat date, qual varchar(40))");
            anz = insert.executeUpdate();
            
            insert = conn.prepareStatement("create table einsatz_equipment(eqid int, eid int, primary key(eqid, eid))");
            anz = insert.executeUpdate();
            
            insert = conn.prepareStatement("create table einsatz_patient(paid int, eid int, primary key(paid, eid))");
            anz = insert.executeUpdate();
            
            insert = conn.prepareStatement("create table einsatz_personal(pid int, eid int, primary key(pid, eid))");
            anz = insert.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
}
