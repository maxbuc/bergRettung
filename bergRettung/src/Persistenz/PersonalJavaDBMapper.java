package Persistenz;

import bergrettung.Personal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonalJavaDBMapper implements IPersonalMapper {

    private final int size = 4;
    private ConnectionPool pool = ConnectionPool.getSinglePool(size);

    @Override
    public void insert(Personal p) {
        Connection conn = pool.getConn();
        try {
            PreparedStatement insert = conn.prepareStatement("insert into personal (id, vorname, nachname, gebdat, qual) values (?,?,?,?,?)");
            insert.setInt(1, p.getId());
            insert.setString(2, p.getVorname());
            insert.setString(3, p.getNachname());
            insert.setString(4, p.getGebdat());
            insert.setString(5, p.getQualifikation());
            int anz = insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

    @Override
    public void delete(int id) {
        Connection conn = pool.getConn();
        try {
            PreparedStatement insert = conn.prepareStatement("delete from personal where id = ?");
            insert.setInt(1, id);
            int anz = insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

    @Override
    public void update(Personal p) {
        Connection conn = pool.getConn();
        try {
            PreparedStatement update = conn.prepareStatement("update personal set vorname = ?, nachname = ?, qual = ? where id = ?");
            
            update.setString(1, p.getVorname());
            update.setString(2, p.getNachname());
            update.setString(3, p.getQualifikation());
            update.setInt(4, p.getId());
            
            int anz = update.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

    @Override
    public List<Personal> readAll() {
        Connection conn = pool.getConn();
        List<Personal> all = new ArrayList<Personal>();
        Personal p;
        try {
            PreparedStatement readAll = conn.prepareStatement("select * from personal");
            ResultSet result = readAll.executeQuery();

            while (result.next()) {

                if (result.getString(5) == null) {
                    if (result.getString(4) == null) {
                        p = new Personal(result.getInt(1), result.getString(2), result.getString(3));
                    } else {
                        p = new Personal(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
                    }
                } else {
                    p = new Personal(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5));
                }
                all.add(p);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);

        return all;

    }

    @Override
    public Personal read(int id) {
        Connection conn = pool.getConn();
        Personal p;
        try {
            PreparedStatement read = conn.prepareStatement("select * from personal where id = ?");
            read.setInt(1, id);
            ResultSet result = read.executeQuery();
            if(result.next()){
                 p = new Personal(id, result.getString(2), result.getString(3));
                 System.out.println(p.toString());
                 return p;
            }
           
            
            
            
//            if (result.getString(5) == null) {
//                if (result.getString(4) == null) {
//                    return new Personal(result.getInt(1), result.getString(2), result.getString(3));
//                } else {
//                    return new Personal(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
//                }
//            } else {
//                return new Personal(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5));
//            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);

        return null;

    }
    
    

}
