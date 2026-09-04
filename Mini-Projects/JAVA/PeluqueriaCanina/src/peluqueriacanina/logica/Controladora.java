
package peluqueriacanina.logica;

import java.util.List;
import peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
 public void guardar(String nombremasco, String raza, String color, 
                    String observaciones, String alergico, String atencesp, 
                    String nombreduenio, String celduenio) {
    
    // 1. Crear el objeto Dueño y asignar sus valores
    Duenio duenio = new Duenio();
    duenio.setNombre(nombreduenio);
    duenio.setCel_duenio(celduenio);
    
    // 2. Crear el objeto Mascota y asignar sus valores
    Mascota masco = new Mascota();
    masco.setNombre(nombremasco);
    masco.setRaza(raza);
    masco.setColor(color);
    masco.setAlergico(alergico);
    masco.setAtencion_especial(atencesp);
    masco.setObservaciones(observaciones);
    masco.setUnDuenio(duenio); // Asignar la relación con el dueño
    
    // 3. Llamar a la Controladora de Persistencia para guardar en BD
    controlPersis.guardar(duenio, masco);
}

    public List<Mascota> TraerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) throws Exception {
      controlPersis.borrarMascota(num_cliente);
}

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    
    }

    public void modificarMascota(Mascota masco, String nombremasco, String raza, String color, String observaciones, String alergico, String atencesp, String nombreduenio, String celduenio) {
              masco.setNombre(nombremasco);
masco.setRaza(raza);
masco.setColor(color);
masco.setObservaciones(observaciones);
masco.setAtencion_especial(atencesp);
masco.setAlergico(alergico);

//modifico mascota
controlPersis.modificarMascota(masco);

Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
dueno.setCel_duenio(celduenio);
dueno.setNombre(nombreduenio);
//llamar al modificar dueño
this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
           return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
            controlPersis.modificarDuenio(dueno);
    }
 
}
