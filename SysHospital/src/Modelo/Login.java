
package Modelo;


public class Login {
    
    private int Id;
    private String Nombre;
    private String User;
    private String Clave;

    
    
    public Login() {
    }

    public Login(int Id, String Nombre, String User, String Clave) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.User = User;
        this.Clave = Clave;
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
    
    
    
    
    
    
    
    
}
