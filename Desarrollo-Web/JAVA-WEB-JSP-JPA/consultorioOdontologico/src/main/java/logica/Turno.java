package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_turno;
    
    @Temporal(TemporalType.DATE)
    private Date Fecha_turno;
    
    private String hora_turno;
    private String afeccion;
    
    // ✅ FK correcta hacia Odontologo
    @ManyToOne
    @JoinColumn(name = "id_odontologo", referencedColumnName = "id_odontologo")
    private Odontologo odonto;
    
    // ✅ FK correcta hacia Paciente
    @ManyToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
    private Paciente pacien;
    
    public Turno() {
    }

    // ... resto de tus métodos (getters y setters)


    public Turno(int id_turno, Date Fecha_turno, String hora_turno, String afeccion) {
        this.id_turno = id_turno;
        this.Fecha_turno = Fecha_turno;
        this.hora_turno = hora_turno;
        this.afeccion = afeccion;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public Date getFecha_turno() {
        return Fecha_turno;
    }

    public void setFecha_turno(Date Fecha_turno) {
        this.Fecha_turno = Fecha_turno;
    }

    public String getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(String hora_turno) {
        this.hora_turno = hora_turno;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}   

