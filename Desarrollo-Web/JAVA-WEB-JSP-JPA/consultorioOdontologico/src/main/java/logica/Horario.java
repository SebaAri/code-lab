
package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_horario;
    private String Hoarario_inicio;
    private String Horario_final;

    public Horario() {
    }

    public Horario(int id_horario, String Hoarario_inicio, String Horario_final) {
        this.id_horario = id_horario;
        this.Hoarario_inicio = Hoarario_inicio;
        this.Horario_final = Horario_final;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHoarario_inicio() {
        return Hoarario_inicio;
    }

    public void setHoarario_inicio(String Hoarario_inicio) {
        this.Hoarario_inicio = Hoarario_inicio;
    }

    public String getHorario_final() {
        return Horario_final;
    }

    public void setHorario_final(String Horario_final) {
        this.Horario_final = Horario_final;
    }

    public void getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
    
}
