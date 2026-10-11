package persistencia;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Odontologo_UP");

    HorarioJpaController horaJPA = new HorarioJpaController(emf);
    OdontologoJpaController odontoJPA = new OdontologoJpaController(emf);
    PacienteJpaController pacJPA = new PacienteJpaController(emf);
    PersonaJpaController persJPA = new PersonaJpaController(emf);
    ResponsableJpaController respJPA = new ResponsableJpaController(emf);
    SecretarioJpaController secreJPA = new SecretarioJpaController(emf);
    TurnoJpaController turnJPA = new TurnoJpaController(emf);
    UsuarioJpaController usuJPA = new UsuarioJpaController(emf);

    public ControladoraPersistencia() {
    }

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public List<Usuario> getUsuarios() {
        
        return usuJPA.findUsuarioEntities();
    }

    public void borrarUsuario(int id) {
        
        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Usuario traerUsuario(int id) {
        
      return  usuJPA.findUsuario(id);
     
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }
}