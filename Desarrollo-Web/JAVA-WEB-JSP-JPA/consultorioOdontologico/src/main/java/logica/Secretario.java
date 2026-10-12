
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Entity
public class Secretario extends Persona implements Serializable {
  /*  private int id_secretario;*/
    private String sector;
    @OneToOne
    private Usuario UnUsuario;

    public Secretario() {
    }

    public Secretario(String sector, Usuario UnUsuario, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nacim) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nacim);
        this.sector = sector;
        this.UnUsuario = UnUsuario;
    }

  

   

   /* public int getId_secretario() {
        return id_secretario;
    }

    public void setId_secretario(int id_secretario) {
        this.id_secretario = id_secretario;
    }*/

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUnUsuario() {
        return UnUsuario;
    }

    public void setUnUsuario(Usuario UnUsuario) {
        this.UnUsuario = UnUsuario;
    }
    
    
    
}
