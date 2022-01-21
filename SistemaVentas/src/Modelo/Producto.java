
package Modelo;

public class Producto {
    
    private int idProducto;
    private String ProductoCodigo;
    private String ProductoNombre;
    private double ProductoCosto;
    private double ProductoPrecio;
    private int ProductoStock;
    private String ProductoProveedor;
    
    public Producto() {
    }

    public Producto(int idProducto, String ProductoCodigo, String ProductoNombre, double ProductoCosto, double ProductoPrecio, int ProductoStock, String ProductoProveedor) {
        this.idProducto = idProducto;
        this.ProductoCodigo = ProductoCodigo;
        this.ProductoNombre = ProductoNombre;
        this.ProductoCosto = ProductoCosto;
        this.ProductoPrecio = ProductoPrecio;
        this.ProductoStock = ProductoStock;
        this.ProductoProveedor = ProductoProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getProductoCodigo() {
        return ProductoCodigo;
    }

    public void setProductoCodigo(String ProductoCodigo) {
        this.ProductoCodigo = ProductoCodigo;
    }

    public String getProductoNombre() {
        return ProductoNombre;
    }

    public void setProductoNombre(String ProductoNombre) {
        this.ProductoNombre = ProductoNombre;
    }

    public double getProductoCosto() {
        return ProductoCosto;
    }

    public void setProductoCosto(int ProductoCosto) {
        this.ProductoCosto = ProductoCosto;
    }

    public double getProductoPrecio() {
        return ProductoPrecio;
    }

    public void setProductoPrecio(int ProductoPrecio) {
        this.ProductoPrecio = ProductoPrecio;
    }

    public int getProductoStock() {
        return ProductoStock;
    }

    public void setProductoStock(int ProductoStock) {
        this.ProductoStock = ProductoStock;
    }

    public String getProductoProveedor() {
        return ProductoProveedor;
    }

    public void setProductoProveedor(String ProductoProveedor) {
        this.ProductoProveedor = ProductoProveedor;
    }

   
    
    
    
    
    
    
}
