
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginDAO {
    
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion objConexion = new Conexion();
    
    
    
    public boolean RegistrarUsuario(Login Nlogin) {

        String sql = "INSERT INTO usuario (UsuarioNombre,UsuarioUser,UsuarioClave,UsuarioTipo) VALUES (?,?,?,?)";

        try{
                
            con = objConexion.getConnection();
            ps  = con.prepareStatement(sql);
            
            ps.setString(1, Nlogin.getNombre());
            ps.setString(2, Nlogin.getUser());
            ps.setString(3, Nlogin.getClave());
            ps.setString(4, Nlogin.getUsuarioTipo());
            
            ps.execute();
            
            return true;
            
            
        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());

            return false;
            
        }//fin del try catch
        
        finally{
            
            try{
                 con.close();
                
            }catch(SQLException e){
                 
                        JOptionPane.showMessageDialog(null, e.toString());
                
            }//fin del try catch
            
        } //fin del finally

    }//fin del metodo registrar
    
    public int ConsultarUsuario(String Usuario){
        
        String sql = "SELECT count (idUsuario) FROM usuario WHERE UsuarioNombre = ?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
           rs =  ps.executeQuery();
           
           if(rs.next()){
           
               return rs.getInt(1);
           }
           
           return 1;
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e.toString());
            
            return 1;
        }
        
    }//fin del metodo consultarUsuario
    
    
    
    public Login Iniciar(String User, String Clave){
        
        Login objLogin = new Login();
        
        String sql = "SELECT * FROM usuario WHERE UsuarioUser = ? AND UsuarioClave = ?";
        
        try{
            
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, User);
            ps.setString(2, Clave);
            
           rs = ps.executeQuery();
            
            if(rs.next()){
               objLogin.setId(rs.getInt("idUsuario"));
               objLogin.setNombre(rs.getString("UsuarioNombre"));
               objLogin.setUser(rs.getString("UsuarioUser"));
               objLogin.setClave(rs.getString("UsuarioClave"));
                
                
            }
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }//fin de la excepcion
        
        return objLogin;
        
    }//fin del metodo
    
    
    
}
