
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:3306/database","postgres","postgres");
        return conn;
    }
}