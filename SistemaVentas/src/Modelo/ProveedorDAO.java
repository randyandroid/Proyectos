
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;



public class ProveedorDAO {
    
    //INSTANCIO MI CONEXION
    
    Conexion ObjConexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    
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
    
    public List ListarProveedor(){
        
        List<Proveedor> objProveedorLista = new ArrayList();
        
        String sql = "SELECT *FROM proveedor";
        
        try{
            
            con = ObjConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            while(rs.next()){
                
                Proveedor Lproveedor = new Proveedor();
                
                Lproveedor.setIdProveedor(rs.getInt("idProveedor"));
                Lproveedor.setProveedorRnc(rs.getString("ProveedorRNC"));
                Lproveedor.setProveedorNombre(rs.getString("ProveedorNombre"));
                Lproveedor.setProveedorDireccion(rs.getString("ProveedorDireccion"));
                Lproveedor.setProveedorTelefono(rs.getString("ProveedorTelefono"));
                
                objProveedorLista.add(Lproveedor);
                
                
                
                
            }//fin de while
            
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        return objProveedorLista;
    }
    
    public boolean EliminarProveedor(int idProveedor){
        
        String sql = "DELETE FROM proveedor WHERE idProveedor = ?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ps.execute();
            
            return true;
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
            return false;
            
        }//fin try catch
        
        finally{
         
            try{
               
                con.close();
                
                
            } catch (SQLException e) {
            
                JOptionPane.showMessageDialog(null, e.toString());
                
           }
            
        }//fin del finally
        
        
        
      
    }
    
    
    public boolean ModificarProveedor(Proveedor Aproveedor){
        
        String sql = "UPDATE proveedor SET  ProveedorRNC = ?, ProveedorNombre = ?, ProveedorDireccion = ?, ProveedorTelefono = ? WHERE idProveedor = ?";
        
        try{
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, Aproveedor.getProveedorRnc());
            ps.setString(2, Aproveedor.getProveedorNombre());
            ps.setString(3, Aproveedor.getProveedorDireccion());
            ps.setString(4, Aproveedor.getProveedorTelefono());
            ps.setInt(5,    Aproveedor.getIdProveedor());
            
            ps.execute();
            
            return true;
            
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
            return false;
        }
        //fin de la excepcion
        
        finally{
            
            try{
                
                con.close();
                
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null, e.toString());
            }
            
        }//fin del finally
        
        
    }
    
    
    
}
