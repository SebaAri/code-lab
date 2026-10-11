
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuario;

@WebServlet(name = "SvEditUsuarios", urlPatterns = {"/SvEditUsuarios"})
public class SvEditUsuarios extends HttpServlet {

    
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
      
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        int id = Integer.parseInt(request.getParameter("id"));
        Usuario usu = control.traerUsuario(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("usuEditar", usu);
        
        response.sendRedirect("editarUsuarios.jsp");
    }


   @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    
    // 1. Obtener el usuario de la sesión
    Usuario usuSesion = (Usuario) request.getSession().getAttribute("usuEditar");
    
    if (usuSesion != null) {
        // 2. ¡CLAVE! Traer el usuario FRESCO de la base de datos usando su ID.
        // Esto garantiza que JPA lo reconozca como una entidad existente.
        int id = usuSesion.getId_Usuario(); // Asegúrate que este getter exista
        Usuario usuDB = control.traerUsuario(id);
        
        // 3. Actualizar los datos con lo que viene del formulario
        usuDB.setNombreUsuario(request.getParameter("nombreusu"));
        usuDB.setContrasenia(request.getParameter("contrasenia"));
        usuDB.setRol(request.getParameter("rol"));
        
        // 4. (Opcional pero recomendado) Imprimir en consola para verificar que el ID NO es 0
        System.out.println("Editando usuario con ID: " + usuDB.getId_Usuario());
        
        // 5. Guardar los cambios. Al ser un objeto traído con find(), el merge funcionará perfecto.
        control.editarUsuario(usuDB);
        
        // 6. Limpiar la sesión y redirigir
        request.getSession().removeAttribute("usuEditar");
        response.sendRedirect("SvUsuarios");
    } else {
        // Si la sesión expiró o se perdió, redirigir a la lista
        response.sendRedirect("SvUsuarios");
    }
}
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
