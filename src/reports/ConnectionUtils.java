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
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getConnection()
    throws ClassNotFoundException, SQLException{
    
        
        return MysqlConnUtils.getMySQLConnection();
                }
    
  public static void main(String[] args) 
          throws ClassNotFoundException, SQLException {
  
      System.out.println("Get connection....");
      Connection conn = ConnectionUtils.getConnection();
      System.out.println("Get connection "+conn);
      System.out.println("Done!");
  }  
}
