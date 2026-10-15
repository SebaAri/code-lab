
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;

@WebServlet(name = "SvElimOdontologos",
            urlPatterns = {"/SvElimOdontologos"})
public class SvElimOdontologos extends HttpServlet {

    Controladora control = new Controladora();

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));

            control.borrarOdontologo(id);

            response.sendRedirect("SvOdontologos");

        } catch (NumberFormatException e) {
            response.sendError(
                HttpServletResponse.SC_BAD_REQUEST,
                "El ID del odontólogo no es válido."
            );
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet para eliminar odontólogos";
    }
}
