package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsuario(String nombreUsuario, String contrasenia, String rol) {

        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        controlPersis.crearUsuario(usu);

    }
    
    

public void crearOdontologo(String dni, String nombre, String apellido,
        String telefono, String direccion, String fechaNac,
        String especialidad) {

    try {
        Odontologo odonto = new Odontologo();

        odonto.setDni(dni);
        odonto.setNombre(nombre);
        odonto.setApellido(apellido);
        odonto.setTelefono(telefono);
        odonto.setDireccion(direccion);
        odonto.setEspecialidad(especialidad);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        formato.setLenient(false);

        Date fecha = formato.parse(fechaNac);
        odonto.setFecha_nacim(fecha);

        controlPersis.crearOdontologo(odonto);

    } catch (ParseException e) {
        throw new IllegalArgumentException(
                "La fecha de nacimiento no tiene un formato válido.", e);
    }
}


    public List<Usuario> getUsuarios() {
        return controlPersis.getUsuarios();
        
    }

    public void borrarUsuario(int id) {
        
        controlPersis.borrarUsuario(id);
    }

      public Usuario traerUsuario(int id) {
          
    return controlPersis.traerUsuario(id);
}

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

    public boolean comprobarIngreso(String usuario, String contrasenia) {
            
        boolean ingreso = false;
        
           List <Usuario> listaUsuarios = new ArrayList<>();
           listaUsuarios = controlPersis.getUsuarios();
           
           for (Usuario usu:listaUsuarios){
              if (usu.getNombreUsuario().equals(usuario)){
                  if(usu.getContrasenia().equals(contrasenia)){
                      ingreso = true;
                  }
                  
                  else {
                      ingreso = false;
                  }
              }
              
           }
    
        return ingreso;
   }

 
    
public List<Odontologo> getOdontologos() {
    return controlPersis.getOdontologos();
}

public Odontologo traerOdontologo(int id) {
    return controlPersis.traerOdontologo(id);
}

public void editarOdontologo(Odontologo odDB) {
    controlPersis.editarOdontologo(odDB);
}

   public void borrarOdontologo(int id) {
    controlPersis.borrarOdontologo(id);
}

public List<Paciente> getPacientes() {
    return controlPersis.getPacientes();
}

public Paciente traerPaciente(int id) {
    return controlPersis.traerPaciente(id);
}

public void editarPaciente(Paciente paciente) {
    controlPersis.editarPaciente(paciente);
}

  public void crearPaciente(String dni, String nombre,
        String apellido, String telefono,
        String direccion, String fechaNac) {

    Paciente paciente = new Paciente();

    paciente.setDni(dni);
    paciente.setNombre(nombre);
    paciente.setApellido(apellido);
    paciente.setTelefono(telefono);
    paciente.setDireccion(direccion);

    SimpleDateFormat formato =
            new SimpleDateFormat("yyyy-MM-dd");
    formato.setLenient(false);

    try {
        Date fecha = formato.parse(fechaNac);
        paciente.setFechanac(fecha);
    } catch (ParseException e) {
        throw new IllegalArgumentException(
                "La fecha de nacimiento no es válida.", e);
    }

    controlPersis.crearPaciente(paciente);
}

    public void borrarPaciente(int id) {
        controlPersis.borrarPaciente(id);
    }

}