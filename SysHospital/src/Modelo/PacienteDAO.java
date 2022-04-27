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
import javax.swing.JOptionPane;

public class PacienteDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion objConexion = new Conexion();
    
    public boolean RegistrarPaciente(Paciente Npaciente){
        
        String sql = "INSERT INTO paciente (PacienteCedula, PacienteNombre, PacienteApellido, PacienteTelefono, PacienteDomicilio,"
                + " PacienteNacimiento, PacienteEdad, PacienteEstado, PacienteSexo, PacienteFecha) VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try{
            
            con = objConexion.getConnection();
            ps  = con.prepareStatement(sql);
            
            ps.setString(1, Npaciente.getCedula());
            ps.setString(2, Npaciente.getNombre());
            ps.setString(3, Npaciente.getApellido());
            ps.setString(4, Npaciente.getTelefono());
            ps.setString(5, Npaciente.getDireccion());
            ps.setString(6, Npaciente.getFechaNacimiento());
            ps.setInt(7, Npaciente.getEdad());
            ps.setString(8, Npaciente.getEstado());
            ps.setString(9, Npaciente.getSexo());
            ps.setString(10, Npaciente.getFechaIngreso());
           
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
    
     public List ListarPaciente(){
        
        List<Paciente> objPacienteLista = new ArrayList();
        
        String sql = "SELECT *FROM Paciente";
        
        try{
            
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Paciente Lpaciente = new Paciente();
                
                
                Lpaciente.setId(rs.getInt("idPaciente"));
               Lpaciente.setCedula(rs.getString("PacienteCedula"));
               Lpaciente.setNombre(rs.getString("PacienteNombre"));
               Lpaciente.setApellido(rs.getString("PacienteApellido"));
               Lpaciente.setTelefono(rs.getString("PacienteTelefono"));
               Lpaciente.setDireccion(rs.getString("PacienteDomicilio"));
               Lpaciente.setEdad(rs.getInt("PacienteEdad"));
               Lpaciente.setEstado(rs.getString("PacienteEstado"));
               Lpaciente.setSexo(rs.getString("PacienteSexo"));
                
                objPacienteLista.add(Lpaciente);
                
            }//fin del while
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return objPacienteLista;
    }
    //fin listar 
    
    
    
    
}
