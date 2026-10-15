
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Odontologo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "SvEditOdontologos",
            urlPatterns = {"/SvEditOdontologos"})
public class SvEditOdontologos extends HttpServlet {

    Controladora control = new Controladora();

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));

            Odontologo od = control.traerOdontologo(id);

            if (od == null) {
                response.sendRedirect("SvOdontologos");
                return;
            }

            HttpSession sesion = request.getSession();
            sesion.setAttribute("odEditar", od);

            response.sendRedirect("editarOdontologos.jsp");

        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                               "El ID del odontólogo no es válido.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sesion = request.getSession(false);

        if (sesion == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        Odontologo odSesion =
                (Odontologo) sesion.getAttribute("odEditar");

        if (odSesion == null) {
            response.sendRedirect("SvOdontologos");
            return;
        }

        try {
           int id = odSesion.getId();

            // Recuperar la entidad actual de la base de datos.
            Odontologo odDB = control.traerOdontologo(id);

            if (odDB == null) {
                sesion.removeAttribute("odEditar");
                response.sendRedirect("SvOdontologos");
                return;
            }

            // Actualizar los datos del odontólogo.
            odDB.setDni(request.getParameter("dni"));
            odDB.setNombre(request.getParameter("nombre"));
            odDB.setApellido(request.getParameter("apellido"));
            odDB.setTelefono(request.getParameter("telefono"));
            odDB.setDireccion(request.getParameter("direccion"));
            
            String fechaNac = request.getParameter("fechanac");

if (fechaNac != null && !fechaNac.isEmpty()) {
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    formato.setLenient(false);

    try {
        Date fecha = formato.parse(fechaNac);
        odDB.setFechanac(fecha);
    } catch (ParseException e) {
        response.sendError(
            HttpServletResponse.SC_BAD_REQUEST,
            "La fecha de nacimiento no es válida."
        );
        return;
    }
}
            odDB.setEspecialidad(request.getParameter("especialidad"));

            // Guardar los cambios.
            control.editarOdontologo(odDB);

            sesion.removeAttribute("odEditar");

            response.sendRedirect("SvOdontologos");

        } catch (IOException e) {
            throw new ServletException(
                    "No se pudo actualizar el odontólogo.", e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet para editar odontólogos";
    }
}
