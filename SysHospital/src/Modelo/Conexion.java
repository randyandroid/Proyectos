
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    
    Connection con;
    
    public Connection getConnection(){
        
        
        try{
            
            String DB = "jdbc:mysql://localhost:3306/db_hospital?serverTimezone=UTC";
            con = (Connection) DriverManager.getConnection(DB, "root","123456");
            
            return con;
            
            
        }catch(SQLException e){
            
            System.out.println(e);
            
            
        }//fin try catch
        
    
        
        return null;
    }
    

    
    
    
}
