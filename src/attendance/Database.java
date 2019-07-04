package attendance;
import java.awt.event.ActionListener;
import java.sql.*;

public class Database {
  
    Connection conn = null;
    String user = "root";
    String password = "123Alpha"; 
    String url = "jdbc:mysql://localhost/attendance?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public Connection getConnection() {
        // SQLite connection string
       try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            System.out.println("Databse Error : "+e);
        }
        return conn;
    }
    

}