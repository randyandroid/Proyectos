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
               Lpaciente.setFechaNacimiento(rs.getString("PacienteNacimiento"));
               Lpaciente.setEdad(rs.getInt("PacienteEdad"));
               Lpaciente.setEstado(rs.getString("PacienteEstado"));
               Lpaciente.setSexo(rs.getString("PacienteSexo"));
               Lpaciente.setFechaIngreso(rs.getString("PacienteFecha"));
                objPacienteLista.add(Lpaciente);
                
            }//fin del while
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return objPacienteLista;
    }
    //fin listar 
  
    
        public  Paciente BuscarPaciente(String Cpaciente){
        
        Paciente Bpaciente = new Paciente();
        
        String sql = "SELECT  * FROM paciente WHERE idPaciente=? or PacienteCedula=? or PacienteNombre=?";
        
        try{
            
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
                    
            ps.setString(1, Cpaciente);
            ps.setString(2, Cpaciente);
            ps.setString(3, Cpaciente);
           rs= ps.executeQuery();
            
            if(rs.next()){
                
                Bpaciente.setNombre(rs.getString("PacienteNombre"));
                Bpaciente.setApellido(rs.getString("PacienteApellido"));
                Bpaciente.setCedula(rs.getString("PacienteCedula"));
                Bpaciente.setTelefono(rs.getString("PacienteTelefono"));
                Bpaciente.setSexo(rs.getString("PacienteSexo"));
                Bpaciente.setEdad(rs.getInt("PacienteEdad"));
                
            }//fin del if
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }//fin try catch
        
        return Bpaciente;
    }
     
     
        public void ConsultarMedicos(JComboBox Cmedicos ){
        
        String sql = "SELECT distinct concat_ws(' ',MedicoNombre,MedicoApellido) AS 'Nombre' from medicos;";
        
        try{
        
            con = objConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Cmedicos.addItem(rs.getString("Nombre"));
                
                
            }
            
            
            
    }catch(SQLException e){
        
        JOptionPane.showMessageDialog(null, e.toString());
    }
        
        
    }
    
        
        public boolean ModificarPaciente(Paciente Mpaciente){

        String sql = "UPDATE paciente SET PacienteCedula = ?, PacienteNombre=?, PacienteApellido=?, PacienteTelefono=?, PacienteDomicilio=?, PacienteNacimiento=?,"
                + "PacienteEdad =?, PacienteEstado =?,PacienteSexo=?,PacienteFecha=? WHERE idPaciente =?";
       
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, Mpaciente.getCedula());
            ps.setString(2, Mpaciente.getNombre());
            ps.setString(3, Mpaciente.getApellido());
            ps.setString(4, Mpaciente.getTelefono());
            ps.setString(5, Mpaciente.getDireccion());
            ps.setString(6, Mpaciente.getFechaNacimiento());
            ps.setInt(7, Mpaciente.getEdad());
            ps.setString(8, Mpaciente.getEstado());
            ps.setString(9, Mpaciente.getSexo());
            ps.setString(10, Mpaciente.getFechaIngreso());
            ps.setInt(11, Mpaciente.getId());
           
            
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
