
package servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logica.Controladora;
import logica.Odontologo;

@WebServlet(name = "SvOdontologos", urlPatterns = {"/SvOdontologos"})
public class SvOdontologos extends HttpServlet {

    Controladora control = new Controladora();

  
@Override
protected void doGet(HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

    List<Odontologo> listaOdontologos =
            control.getOdontologos();

  

    HttpSession misesion = request.getSession();

    misesion.setAttribute(
            "listaOdontologos", listaOdontologos);

    response.sendRedirect("verOdontologos.jsp");
}


    
    
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        String fechaNac = request.getParameter("fechanac");
        String especialidad = request.getParameter("especialidad");

        // El registro se implementa mediante la Controladora.
        // La llamada debe coincidir con la firma real de tu método.
        control.crearOdontologo(
                dni, nombre, apellido, telefono,
                direccion, fechaNac, especialidad);

        response.sendRedirect("SvOdontologos");
    }

    @Override
    public String getServletInfo() {
        return "Servlet para gestionar odontólogos";
    }
}
