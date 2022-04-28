
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class EspecialidadesDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion objConexion = new Conexion();
    
    
      public boolean RegistrarEspecialidad(Especialidades Nespecialidad) {

        String sql = "INSERT INTO medico_especialidad (Descripcion) VALUES (?)";

        try{
                
            con = objConexion.getConnection();
            ps  = con.prepareStatement(sql);
            
            ps.setString(1, Nespecialidad.getDescripcion());
              
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
    
    
    
}
