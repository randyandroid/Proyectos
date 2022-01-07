
package Modelo;

public class Cliente {
    
    private int idCliente;
    private String ClienteCedula;
    private String ClienteNombre;
    private String ClienteApellido;
    private String ClienteDireccion;
    private String ClienteTelefono;

    public Cliente() {
    }

    public Cliente(int idCliente, String ClienteCedula, String ClienteNombre,String ClienteApellido, String ClienteDireccion, String ClienteTelefono) {
        this.idCliente = idCliente;
        this.ClienteCedula = ClienteCedula;
        this.ClienteNombre = ClienteNombre;
        this.ClienteDireccion = ClienteDireccion;
        this.ClienteTelefono = ClienteTelefono;
        this.ClienteApellido = ClienteApellido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getClienteCedula() {
        return ClienteCedula;
    }

    public void setClienteCedula(String ClienteCedula) {
        this.ClienteCedula = ClienteCedula;
    }

    public String getClienteNombre() {
        return ClienteNombre;
    }

    public void setClienteNombre(String ClienteNombre) {
        this.ClienteNombre = ClienteNombre;
    }

    public String getClienteDireccion() {
        return ClienteDireccion;
    }

    public void setClienteDireccion(String ClienteDireccion) {
        this.ClienteDireccion = ClienteDireccion;
    }

    public String getClienteTelefono() {
        return ClienteTelefono;
    }

    public void setClienteTelefono(String ClienteTelefono) {
        this.ClienteTelefono = ClienteTelefono;
    }

    public String getClienteApellido() {
        return ClienteApellido;
    }

    public void setClienteApellido(String ClienteApellido) {
        this.ClienteApellido = ClienteApellido;
    }

  
    
    
    
    
    
    
    
    
}
