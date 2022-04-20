
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
