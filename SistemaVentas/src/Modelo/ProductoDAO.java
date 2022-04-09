
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


public class ProductoDAO {
    
    Conexion ObjConexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public boolean RegistrarProducto(Producto Nproducto){
        
        String sql = "INSERT INTO producto (ProductoCodigo, ProductoNombre, ProductoCosto, ProductoPrecio, ProductoStock, ProductoProveedor) VALUES (?,?,?,?,?,?)";
        
        try{
            
            con = ObjConexion.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1,Nproducto.getProductoCodigo());
            ps.setString(2, Nproducto.getProductoNombre());
            ps.setDouble(3, Nproducto.getProductoCosto());
            ps.setDouble(4, Nproducto.getProductoPrecio());
            ps.setInt(5, Nproducto.getProductoStock());
            ps.setString(6, Nproducto.getProductoProveedor());
            
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
            
        }//fin del finally
        
        
    }
    
    public void ConsultarProveedor(JComboBox Cproveedor ){
        
        String sql = "SELECT ProveedorNombre FROM proveedor";
        
        try{
        
            con = ObjConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Cproveedor.addItem(rs.getString("ProveedorNombre"));
                
                
            }
            
            
            
    }catch(SQLException e){
        
        JOptionPane.showMessageDialog(null, e.toString());
    }
        
        
    }
    
    
    public List ListarProducto(){
        
        List<Producto> objProductoLista = new ArrayList();
        
        String sql = "SELECT *FROM producto";
        
        try{
            
            con = ObjConexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            while(rs.next()){
                
                Producto Lproducto = new Producto();
                
                Lproducto.setIdProducto(rs.getInt("idProducto"));
                Lproducto.setProductoCodigo(rs.getString("ProductoCodigo"));
                Lproducto.setProductoNombre(rs.getString("ProductoNombre"));
                Lproducto.setProductoCosto((int) rs.getDouble("ProductoCosto"));
                Lproducto.setProductoPrecio((int) rs.getDouble("ProductoPrecio"));
                Lproducto.setProductoStock(rs.getInt("ProductoStock"));
                Lproducto.setProductoProveedor(rs.getString("ProductoProveedor"));
                
                objProductoLista.add(Lproducto);
                
                
                
                
            }//fin de while
            
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        return objProductoLista;
    
    
    }
    
    public boolean EliminarProducto(int idProducto){
        
        String sql = "DELETE FROM producto WHERE idProducto = ?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ps.execute();
            
            return true;
            
            
        
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
            return false;
            
        }//fin del try catch
        
        finally{
            
            try{
                con.close();
            } catch (SQLException ex)  {
                
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }//fin dell finally
        
        
    }
    
    
    public boolean ModificarProducto(Producto Mproducto){
        
        String sql = "UPDATE  producto SET ProductoCodigo =?,  ProductoNombre = ?, ProductoCosto =?, ProductoPrecio = ?, ProductoStock =?, ProductoProveedor =? WHERE idProducto=?";
        
        
        try{
            
         ps=   con.prepareStatement(sql);
         
            ps.setString(1, Mproducto.getProductoCodigo());
            ps.setString(2, Mproducto.getProductoNombre());
            ps.setDouble(3, Mproducto.getProductoCosto());
            ps.setDouble(4, Mproducto.getProductoPrecio());
            ps.setInt(5, Mproducto.getProductoStock());
            ps.setString(6, Mproducto.getProductoProveedor());
            ps.setInt(7, Mproducto.getIdProducto());
        
            ps.execute();
            
            return true;
        
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
            return false;
            
            
        }//fin del try catch
        
        finally{
            
            try{
                
                con.close();
                
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }//fin del finally
        
        
        
    }


    
    public  Producto BuscarProducto(String Cproducto){
        
        Producto Bproducto = new Producto();
        
        String sql = "SELECT  * FROM producto WHERE ProductoCodigo =?";
        
        try{
            
            con = ObjConexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Cproducto);
           rs= ps.executeQuery();
            
            if(rs.next()){
                
                Bproducto.setProductoNombre(rs.getString("ProductoNombre"));
                Bproducto.setProductoPrecio((int) rs.getDouble("ProductoPrecio"));
                Bproducto.setProductoStock(rs.getInt("ProductoStock"));
                
                
            }//fin del if
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }//fin try catch
        
        return Bproducto;
    }
        
        
        public void PruebaClase(){
            
            
            
        }
        
    


    
}
