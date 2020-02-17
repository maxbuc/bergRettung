package Persistenz;

import bergrettung.Personal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonalJavaDBMapper implements IPersonalMapper{
    private final int size = 4;
    private ConnectionPool pool = ConnectionPool.getSinglePool(size);
    
    @Override
    public void einfuegen(Personal p){
        Connection conn = pool.getConn();
        try {
            PreparedStatement insert = conn.prepareStatement("insert into personal (id, vorname, nachname, gebdat, qual) values (?,?)");
            insert.setInt(1, p.getId());
            insert.setString(2, p.getVorname()); 
            int anz = insert.executeUpdate(); //insert, delete. update in sql
        } catch (SQLException ex) {
            Logger.getLogger(PersonalJavaDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        pool.releaseConn(conn);
    }
    
}
