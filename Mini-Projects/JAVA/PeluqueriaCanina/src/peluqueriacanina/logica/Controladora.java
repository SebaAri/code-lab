
package peluqueriacanina.logica;

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
 }

