
package logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Odontologo extends Persona{
   
    private String especialidad;
    @OneToMany(mappedBy="odonto")
    private List <Turno> ListaTurno;
    @OneToOne
    private Usuario Unusuario;
    @OneToOne
    private Horario Unhorario;

    public Odontologo() {
    }

   
public Odontologo(String especialidad, List<Turno> ListaTurno,
        Usuario Unusuario, Horario Unhorario,
        int id, String dni, String nombre, String apellido,
        String telefono, String direccion, Date fecha_nacim) {

    super(id, dni, nombre, apellido, telefono, direccion, fecha_nacim);

    this.especialidad = especialidad;
    this.ListaTurno = ListaTurno;
    this.Unusuario = Unusuario;
    this.Unhorario = Unhorario;
}




  

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurno() {
        return ListaTurno;
    }

    public void setListaTurno(List<Turno> ListaTurno) {
        this.ListaTurno = ListaTurno;
    }

    public Usuario getUnusuario() {
        return Unusuario;
    }

    public void setUnusuario(Usuario Unusuario) {
        this.Unusuario = Unusuario;
    }

    public Horario getUnhorario() {
        return Unhorario;
    }

    public void setUnhorario(Horario Unhorario) {
        this.Unhorario = Unhorario;
    }

    public int getId_odontologo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setFechanac(Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
