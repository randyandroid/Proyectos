
package Modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public List ListarCliente(){
        
        List<Cliente> objClienteLista = new ArrayList();
        
        String sql = "SELECT *FROM cliente";
        
        try{
            
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Cliente Lcliente = new Cliente();
                Lcliente.setIdCliente(rs.getInt("idCliente"));
                Lcliente.setClienteCedula(rs.getString("ClienteCedula"));
                Lcliente.setClienteNombre(rs.getString("ClienteNombre"));
                Lcliente.setClienteApellido(rs.getString("ClienteApellido"));
                Lcliente.setClienteDireccion(rs.getString("ClienteDireccion"));
                Lcliente.setClienteTelefono(rs.getString("ClienteTelefono"));
                
                objClienteLista.add(Lcliente);
                
            }
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return objClienteLista;
    }
    
    
    
}
