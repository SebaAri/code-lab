package peluqueriacanina.persistencia;

import java.util.List;
import peluqueriacanina.logica.Duenio;
import peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {

    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    // ==========================
    // CREAR
    // ==========================
    public void crearMascota(Mascota masco, Duenio duenio) {

        // Primero guarda el dueño
        duenioJpa.create(duenio);

        // Asigna el dueño a la mascota
        masco.setUnDuenio(duenio);

        // Guarda la mascota
        mascotaJpa.create(masco);
    }

    // ==========================
    // CONSULTAR
    // ==========================
    public List<Mascota> traerMascotas() {
        return mascotaJpa.findMascotaEntities();
    }

    public Mascota traerMascota(int id) {
        return mascotaJpa.findMascota(id);
    }

    public List<Duenio> traerDuenios() {
        return duenioJpa.findDuenioEntities();
    }

    public Duenio traerDuenio(int id) {
        return duenioJpa.findDuenio(id);
    }

    // ==========================
    // EDITAR
    // ==========================
    public void editarMascota(Mascota masco) throws Exception {
        mascotaJpa.edit(masco);
    }

    public void editarDuenio(Duenio duenio) throws Exception {
        duenioJpa.edit(duenio);
    }

    // ==========================
    // ELIMINAR
    // ==========================
    public void borrarMascota(int id) throws Exception {
        mascotaJpa.destroy(id);
        
    }

    public void borrarDuenio(int id) throws Exception {
        duenioJpa.destroy(id);
    }

   public void guardar(Duenio duenio, Mascota masco) {
    // 1. Crear el Dueño en la Base de Datos
    duenioJpa.create(duenio);
    
    // 2. Crear la Mascota en la Base de Datos
    mascotaJpa.create(masco);
}

    public void modificarMascota(Mascota masco) {
        try {
            mascotaJpa.edit(masco);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}