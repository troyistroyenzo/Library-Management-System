/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ConnectionProvider {
    
    
    public static Connection getCon() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/lms", "root", "3696");
            return connection;
        } catch (Exception e) {
            System.out.print("Stuff wen wrong");
            return null;
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
