
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List ListarEspecialidad(){
        
        List<Especialidades> objEspLista = new ArrayList();

        
       String sql = "SELECT *FROM Medico_Especialidad";
        
        try{
            
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Especialidades Lesp = new Especialidades();
                     
               Lesp.setId(rs.getInt("idEspecialidad"));
               Lesp.setDescripcion(rs.getString("Descripcion"));
              
           
               
                objEspLista.add(Lesp);
                
            }//fin del while
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return objEspLista;
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
    
    
    public boolean EditarEspecialidad(Especialidades Mespecialidad){

        String sql = "UPDATE Medico_Especialidad SET Descripcion =? WHERE idEspecialidad =?";
       
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, Mespecialidad.getDescripcion());
            ps.setInt(2, Mespecialidad.getId());
           
            
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
