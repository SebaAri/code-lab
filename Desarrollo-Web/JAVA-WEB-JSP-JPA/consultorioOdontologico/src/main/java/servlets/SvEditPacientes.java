
package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Paciente;

@WebServlet(name = "SvEditPacientes",
            urlPatterns = {"/SvEditPacientes"})
public class SvEditPacientes extends HttpServlet {

    Controladora control = new Controladora();

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));

            Paciente pac = control.traerPaciente(id);

            if (pac == null) {
                response.sendRedirect("SvPacientes");
                return;
            }

            HttpSession sesion = request.getSession();
            sesion.setAttribute("pacEditar", pac);

            response.sendRedirect("editarPaciente.jsp");

        } catch (NumberFormatException e) {
            response.sendError(
                HttpServletResponse.SC_BAD_REQUEST,
                "El ID del paciente no es válido."
            );
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

        Paciente pacSesion =
                (Paciente) sesion.getAttribute("pacEditar");

        if (pacSesion == null) {
            response.sendRedirect("SvPacientes");
            return;
        }

        try {
            int id = pacSesion.getId();

            // Recuperar el paciente de la base de datos.
            Paciente pacDB = control.traerPaciente(id);

            if (pacDB == null) {
                sesion.removeAttribute("pacEditar");
                response.sendRedirect("SvPacientes");
                return;
            }

            // Actualizar los datos del paciente.
            pacDB.setDni(request.getParameter("dni"));
            pacDB.setNombre(request.getParameter("nombre"));
            pacDB.setApellido(request.getParameter("apellido"));
            pacDB.setTelefono(request.getParameter("telefono"));
            pacDB.setDireccion(request.getParameter("direccion"));

            String fechaNac = request.getParameter("fechanac");

            if (fechaNac != null && !fechaNac.isEmpty()) {
               SimpleDateFormat formato =
        new SimpleDateFormat("yyyy-MM-dd");
                formato.setLenient(false);

                try {
                    Date fecha = formato.parse(fechaNac);
                    pacDB.setFechanac(fecha);
                } catch (ParseException e) {
                    response.sendError(
                        HttpServletResponse.SC_BAD_REQUEST,
                        "La fecha de nacimiento no es válida."
                    );
                    return;
                }
            }

            // Guardar los cambios del paciente.
            control.editarPaciente(pacDB);

            sesion.removeAttribute("pacEditar");

            response.sendRedirect("SvPacientes");

        } catch (Exception e) {
            throw new ServletException(
                    "No se pudo actualizar el paciente.", e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet para editar paciente";
    }
}
