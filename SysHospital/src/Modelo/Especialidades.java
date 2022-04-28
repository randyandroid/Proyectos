
package Modelo;

/**
 *
 * @author adm
 */
public class Especialidades {
    
    int Id;
    String Descripcion;

    public Especialidades() {
    }

    public Especialidades(int Id, String Descripcion) {
        this.Id = Id;
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
    
}
