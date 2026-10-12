
package logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Paciente extends Persona{
  /*  private int id_paciente;*/
    private Boolean tiene_OS;
    private String tipo_sangre;
    @OneToOne
    private Responsable un_responsable;
    @OneToMany(mappedBy="pacien")
    private List <Turno> ListaTurno;

    public Paciente() {
    }

    public Paciente(Boolean tiene_OS, String tipo_sangre, Responsable un_responsable, List<Turno> ListaTurno, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nacim) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nacim);
        this.tiene_OS = tiene_OS;
        this.tipo_sangre = tipo_sangre;
        this.un_responsable = un_responsable;
        this.ListaTurno = ListaTurno;
    }


  

   

   /* public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }*/

    public Boolean getTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(Boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public Responsable getUn_responsable() {
        return un_responsable;
    }

    public void setUn_responsable(Responsable un_responsable) {
        this.un_responsable = un_responsable;
    }

    public List<Turno> getListaTurno() {
        return ListaTurno;
    }

    public void setListaTurno(List<Turno> ListaTurno) {
        this.ListaTurno = ListaTurno;
    }

  

    
    
}
