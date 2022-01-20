/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author adm
 */
public class Proveedor {
    
    private int idProveedor;
    private String ProveedorRnc;
    private String ProveedorNombre;
    private String ProveedorDireccion;
    private String ProveedorTelefono;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String ProveedorRnc, String ProveedorNombre, String ProveedorDireccion, String ProveedorTelefono) {
        this.idProveedor = idProveedor;
        this.ProveedorRnc = ProveedorRnc;
        this.ProveedorNombre = ProveedorNombre;
        this.ProveedorDireccion = ProveedorDireccion;
        this.ProveedorTelefono = ProveedorTelefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProveedorRnc() {
        return ProveedorRnc;
    }

    public void setProveedorRnc(String ProveedorRnc) {
        this.ProveedorRnc = ProveedorRnc;
    }

    public String getProveedorNombre() {
        return ProveedorNombre;
    }

    public void setProveedorNombre(String ProveedorNombre) {
        this.ProveedorNombre = ProveedorNombre;
    }

    public String getProveedorDireccion() {
        return ProveedorDireccion;
    }

    public void setProveedorDireccion(String ProveedorDireccion) {
        this.ProveedorDireccion = ProveedorDireccion;
    }

    public String getProveedorTelefono() {
        return ProveedorTelefono;
    }

    public void setProveedorTelefono(String ProveedorTelefono) {
        this.ProveedorTelefono = ProveedorTelefono;
    }
    
    
    
    
    
    
    
    
    
}
