package ZENSDENTAL;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    public static Connection conn;
    public static final String USER = "root";
    public static final String PASS = "";
    public static final String DB_NAME = "zensdental";
    
    public static Connection getConnection(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DB_NAME, USER, PASS);
        } catch (SQLException e){
            System.out.println(e);
        }
        
        if (conn != null){
            System.out.println("Connection Established");
        } else {
            JOptionPane.showMessageDialog(null, "Connection Failed!");
            System.exit(0);
        }
        
        return conn;
    }
}
