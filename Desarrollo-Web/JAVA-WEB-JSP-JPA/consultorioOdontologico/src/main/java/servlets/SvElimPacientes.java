
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;


@WebServlet(name = "SvElimPacientes",
            urlPatterns = {"/SvElimPacientes"})

public class SvElimPacientes extends HttpServlet {

    Controladora control = new Controladora();

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));

            control.borrarPaciente(id);

            response.sendRedirect("SvPacientes");

        } catch (NumberFormatException e) {
            response.sendError(
                HttpServletResponse.SC_BAD_REQUEST,
                "El ID del paciente no es válido."
            );
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet para eliminar pacientes";
    }
}
