
package Modelo;


public class Medicos {
    
    int Id;
    String Nombre;
    String Apellido;
    String Cedula;
    String Telefono;
    String Domicilio;
    String Sexo;
    String Estado;
    String Jornada;
    String Especialidad;
    

    public Medicos() {
    }

    public Medicos(int Id, String Nombre, String Apellido, String Cedula, String Telefono, String Domicilio, String Sexo, String Estado, String Jornada, String Especialidad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.Domicilio = Domicilio;
        this.Sexo = Sexo;
        this.Estado = Estado;
        this.Jornada = Jornada;
        this.Especialidad = Especialidad;
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }
   
       public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    
    
    
    
    
    
    
    
    
}
