/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author tauhid
 */
public class koneksi {
    
    static Connection con;
    
    public static Connection connection() {
    
        if (con==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("damairesto");
            data.setUrl("10.33.109.15");
            data.setUser("root");
            data.setPort(3306);
            data.setPassword("damairesto");
            
            try{
            con = data.getConnection();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    
        return con;
    }

    
}
