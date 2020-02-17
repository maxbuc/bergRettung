
package Persistenz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConnectionPool {
    private static ConnectionPool singlePool;
    private final Stack<Connection> pool; 
    private final int size;
    private final String driver = "org.apache.derby.jdbc.ClientDriver";
    private final String url = "jdbc:derby://localhost:1527/Bergrettung";
    private final String user = "SPE";
    private final String pwd = "123";
    
    public static ConnectionPool getSinglePool(int size){
        if(singlePool == null){
            singlePool = new ConnectionPool(size);
        }
        return singlePool;
    }
    
    private ConnectionPool(int size){
        pool=new Stack<>();
        this.size = size;
    }
    
    public Connection getConn(){
        if(pool.isEmpty()){
        return getNew();
        }
        else {
            try{
            Connection conn=pool.pop();
            if(conn.isValid(100)){
                return conn;
            }
            else{
                return getNew();
            }
        }   catch (SQLException ex){
                Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE,null,ex);
                return null;
            }
        }
    }

    private Connection getNew() {
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pwd);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } catch (SQLException e){
            System.out.println("getConn" + e);
        }
        return conn;
    }
    
    public void releaseConn(Connection conn){
        if(pool.size() == size){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            pool.push(conn);
        }
    }
    
}
