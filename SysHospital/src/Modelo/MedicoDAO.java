
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;





public class MedicoDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion objConexion = new Conexion();
    
    
    public boolean RegistrarMedico(Medicos Nmedico){
        
        String sql = "INSERT INTO medicos (MedicoCedula, MedicoNombre, MedicoApellido, MedicoTelefono, MedicoDomicilio,"
                + " MedicoEstado, MedicoSexo, MedicoEspecialidad, MedicoJornada) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try{
            
            con = objConexion.getConnection();
            ps  = con.prepareStatement(sql);
            
            ps.setString(1, Nmedico.getCedula());
            ps.setString(2, Nmedico.getNombre());
            ps.setString(3, Nmedico.getApellido());
            ps.setString(4, Nmedico.getTelefono());
            ps.setString(5, Nmedico.getDomicilio());           
            ps.setString(6, Nmedico.getEstado());
            ps.setString(7, Nmedico.getSexo());
            ps.setString(8, Nmedico.getEspecialidad());
            ps.setString(9, Nmedico.getJornada());
           
            ps.execute();
            
            return true;
            
            
            
        }catch(SQLException e){
         
            JOptionPane.showMessageDialog(null, e.toString());
            
            return false;
            
        }
        finally{
            
            try{
                con.close();
                
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        
    }
    //fin del metodo
    
    
     public void ConsultarEspecialidad(JComboBox Cespecialidad ){
        
        String sql = "SELECT Descripcion FROM Medico_Especialidad";
        
        try{
        
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Cespecialidad.addItem(rs.getString("Descripcion"));
                
                
            }
            
            
            
    }catch(SQLException e){
        
        JOptionPane.showMessageDialog(null, e.toString());
    }
        
        
    }
    
    
    
}
