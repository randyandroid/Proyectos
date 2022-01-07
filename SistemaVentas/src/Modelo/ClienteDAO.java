
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    Conexion objConexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarCliente(Cliente Ncliente){
        
        String sql = "INSERT INTO cliente (ClienteCedula,ClienteNombre,ClienteApellido,ClienteDireccion,ClienteTelefono) VALUES (?,?,?,?,?) ";
       
        try{
            
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, Ncliente.getClienteCedula());
            ps.setString(2, Ncliente.getClienteNombre());
            ps.setString(3, Ncliente.getClienteApellido());
            ps.setString(4, Ncliente.getClienteDireccion());
            ps.setString(5, Ncliente.getClienteTelefono());
            
            ps.execute();
            
            return true;
            
            
        }catch(SQLException e){
            
            
            JOptionPane.showMessageDialog(null, e.toString());
         return false;
         
        }//fin try catch
        
        finally{
            
            try{
                
                con.close();
                
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null, e.toString());
                
                
            }//fin del try catch
            
            
            
        }//fin del finally
        
        
        
        
    }//fin del metodo
    
    
    
}
