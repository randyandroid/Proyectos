
package Modelo;


public class Login {
    
    private int Id;
    private String Nombre;
    private String User;
    private String Clave;
    private String UsuarioTipo;
    private String Buscar;
    
    

    
    
    public Login() {
    }

    public Login(int Id, String Nombre, String User, String Clave, String UsuarioTipo, String Buscar) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.User = User;
        this.Clave = Clave;
        this.UsuarioTipo = UsuarioTipo;
        this.Buscar = Buscar;
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getUsuarioTipo() {
        return UsuarioTipo;
    }

    public void setUsuarioTipo(String UsuarioTipo) {
        this.UsuarioTipo = UsuarioTipo;
    }

    public String getBuscar() {
        return Buscar;
    }

    public void setBuscar(String Buscar) {
        this.Buscar = Buscar;
    }
    
    
    
    
    
    
    
    
}
