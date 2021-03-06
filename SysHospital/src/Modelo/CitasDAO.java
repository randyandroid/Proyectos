/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;



public class CitasDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion objConexion = new Conexion();
  
    
    public boolean RegistrarCita(Citas Ncita){
        
        String sql = "INSERT INTO citas (PacienteNombre,PacienteApellido, PacienteCedula, Telefono, PacienteEdad, PacienteSexo,"
                + " PacienteFecha, PacienteJornada, PacienteHora, TipoCita, PacienteMedico) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            
            con = objConexion.getConnection();
            ps  = con.prepareStatement(sql);
            
            ps.setString(1, Ncita.getNombre());
            ps.setString(2, Ncita.getApellido());
            ps.setString(3, Ncita.getCedula());
            ps.setString(4, Ncita.getTelefono());
            ps.setInt(5, Ncita.getEdad());
            ps.setString(6, Ncita.getSexo());
            ps.setString(7, Ncita.getFecha());
            ps.setString(8, Ncita.getJornada());
            ps.setString(9, Ncita.getHora());
            ps.setString(10, Ncita.getTipo());
             ps.setString(11, Ncita.getMedico());
            
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
    
     public List ListarCita(){
        
        List<Citas> objCitaLista = new ArrayList();
        
        String sql = "SELECT *FROM citas";
        
        try{
            
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Citas Lcita = new Citas();
                               
               Lcita.setId(rs.getInt("idcitas"));
               Lcita.setNombre(rs.getString("PacienteNombre"));
               Lcita.setApellido(rs.getString("PacienteApellido"));
               Lcita.setCedula(rs.getString("PacienteCedula"));
               Lcita.setTelefono(rs.getString("Telefono"));
               Lcita.setEdad(rs.getInt("PacienteEdad"));
               Lcita.setSexo(rs.getString("PacienteSexo"));
               Lcita.setFecha(rs.getString("PacienteFecha"));
               Lcita.setJornada(rs.getString("PacienteJornada"));
               Lcita.setHora(rs.getString("PacienteHora"));
               Lcita.setTipo(rs.getString("TipoCita"));
               Lcita.setMedico(rs.getString("PacienteMedico"));
               
               
                objCitaLista.add(Lcita);
                
            }//fin del while
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return objCitaLista;
    }
    //fin listar 
  
     
     public boolean ModificarCita(Citas Acita){

        String sql = "UPDATE citas SET PacienteNombre=?, PacienteApellido=?, PacienteCedula=?, Telefono=?, PacienteEdad=?,"
                + "PacienteSexo =?, PacienteFecha =?,PacienteJornada=?,PacienteHora=?,TipoCita=?,PacienteMedico=? WHERE idcitas =?";
       
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, Acita.getNombre());
            ps.setString(2, Acita.getApellido());
            ps.setString(3, Acita.getCedula());
            ps.setString(4, Acita.getTelefono());
            ps.setInt(5, Acita.getEdad());
            ps.setString(6, Acita.getSexo());
            ps.setString(7, Acita.getFecha());
            ps.setString(8, Acita.getJornada());
            ps.setString(9, Acita.getHora());
            ps.setString(10, Acita.getTipo());
           ps.setString(11, Acita.getMedico());
            ps.setInt(12, Acita.getId());
           
            
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


