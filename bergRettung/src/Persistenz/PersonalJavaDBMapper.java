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
    private Integer anz;
    private final int size = 4;
    private final ConnectionPool pool = ConnectionPool.getSinglePool(size);

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
            anz = insert.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("fehler pers insert");
        } 
        pool.releaseConn(conn);
    }

    @Override
    public void delete(int id) {
        Connection conn = pool.getConn();
        try {
            PreparedStatement insert = conn.prepareStatement("delete from personal where id = ?");
            insert.setInt(1, id);
            anz = insert.executeUpdate();
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

            anz = update.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }

    @Override
    public List<Personal> readAll() {
        Connection conn = pool.getConn();
        List<Personal> all = new ArrayList<>();
        Personal p;
        try {
            PreparedStatement readAll = conn.prepareStatement("select * from personal");
            ResultSet result = readAll.executeQuery();

            while (result.next()) {
                p = newPersonFromDB(result);
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
            if (result.next()) {

                p = newPersonFromDB(result);
                return p;
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);

        return null;

    }

    private Personal newPersonFromDB(ResultSet result) throws SQLException {
        Personal p;
        p = new Personal(result.getInt(1), result.getString(2), result.getString(3));
        if (result.getString(4) != null) {
            p.setGebdat(result.getString(4));
        }
        if (result.getString(5) != null) {
            p.setQualifikation(result.getString(5));
        }

        return p;
    }
    
    public int getNextFree(){
        Connection conn = pool.getConn();
        try {
            PreparedStatement max = conn.prepareStatement("select max(id) from personal");
            ResultSet result = max.executeQuery();
            if(result.next()){
                return result.getInt(1)+1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);

        return 0;
    }

}
