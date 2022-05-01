
package Modelo;

import Vista.VerUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    
    public List ListarUsuario(){
        
        List<Login> objLoginLista = new ArrayList();

        
       String sql = "SELECT *FROM Usuario";
        
        try{
            
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Login Llogin = new Login();
                     
               Llogin.setId(rs.getInt("idUsuario"));
               Llogin.setNombre(rs.getString("UsuarioNombre"));
               Llogin.setUser(rs.getString("UsuarioUser"));
               Llogin.setUsuarioTipo(rs.getString("UsuarioTipo"));
           
               
                objLoginLista.add(Llogin);
                
            }//fin del while
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return objLoginLista;
    }
    //fin listar 

    public boolean ModificarUsuario(Login ALogin){

        String sql = "UPDATE usuario SET UsuarioNombre=?, UsuarioUser=?, UsuarioTipo=? WHERE idUsuario =?";
       
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, ALogin.getNombre());
            ps.setString(2, ALogin.getUser());
            ps.setString(3, ALogin.getUsuarioTipo());
            ps.setInt(4, ALogin.getId());
           
            
            ps.execute();
            
            return true;
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
            
        }//fin de la excepcion
        
        finally{
            
            try{
               con.close();
                
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }//fin del cierre de conexion
        
        
    }
    
    
    public boolean ModificarClave(Login Mclave){

        String sql = "UPDATE usuario SET UsuarioClave =? WHERE idUsuario =?";
       
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, Mclave.getClave());
            ps.setInt(2, Mclave.getId());
           
            
            ps.execute();
            
            return true;
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
            
        }//fin de la excepcion
        
        finally{
            
            try{
               con.close();
                
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }//fin del cierre de conexion
        
        
    }
    
    
    
    
    
    
    
}
