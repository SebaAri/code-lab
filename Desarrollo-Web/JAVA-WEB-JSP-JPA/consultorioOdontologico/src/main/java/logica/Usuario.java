package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L; // Obligatorio para Serializable

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Usuario;
    
    private String nombreUsuario;
    private String contrasenia;
    private String rol;

    public Usuario() {
    }

    public Usuario(int id_Usuario, String nombreUsuario, String contrasenia, String rol) {
        this.id_Usuario = id_Usuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // ¡CRÍTICO! Esto es lo que JPA y tu JpaController necesitan
    public int getId() {
        return this.id_Usuario;
    }
}