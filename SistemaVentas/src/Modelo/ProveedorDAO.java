
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class ProveedorDAO {
    
    //INSTANCIO MI CONEXION
    
    Conexion ObjConexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    
    
    
    
    public boolean RegistrarProveedor(Proveedor Nproveedor){
        
       String sql = "INSERT INTO proveedor (ProveedorRNC, ProveedorNombre, ProveedorDireccion, ProveedorTelefono ) VALUES (?,?,?,?)";
        
       try{
           
           con = ObjConexion.getConnection();
           ps = con.prepareStatement(sql);
           
           ps.setString(1, Nproveedor.getProveedorRnc());
           ps.setString(2, Nproveedor.getProveedorNombre());
           ps.setString(3, Nproveedor.getProveedorDireccion());
           ps.setString(4, Nproveedor.getProveedorTelefono());
           
           ps.execute();
           
           return true;
           
           
       }catch(SQLException e){
           
           JOptionPane.showMessageDialog(null, e.toString());
           
           return false;
           
       }//fin try catch
       
        finally {
           
           try{
               
               con.close();
               
           }catch(SQLException e){
               
               JOptionPane.showMessageDialog(null, e.toString());
               
           }//fin try catch 
           
           
       }//fin del finally
       
       
    }//fin del metodo
    
    
}
