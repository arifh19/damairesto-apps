/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reports;

/**
 *
 * @author Yuuki
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlConnUtils {
    public static Connection getMySQLConnection()
    throws ClassNotFoundException, SQLException{
    
        String hostName = "10.33.109.15";
        String dbName="damairesto";
        String userName="root";
        String password="damairesto";
        return getMySQLConnection(hostName, dbName, userName, password);
    }
    
    public static Connection getMySQLConnection(String hostName,String dbName,
            String userName,String password) throws SQLException, 
            ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
    String connectionURL = "jdbc:mysql://"+hostName+":3306/"+dbName;
    Connection conn = DriverManager.getConnection(connectionURL, userName, password);
    return conn;
    }
}

