
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
import logica.Paciente;

@WebServlet(name = "SvPacientes", urlPatterns = {"/SvPacientes"})
public class SvPacientes extends HttpServlet {

    Controladora control = new Controladora();

  
/*@Override
protected void doGet(HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

    List<Paciente> listaPacientes =
            control.getPacientes();

   

    HttpSession misesion = request.getSession();

    misesion.setAttribute(
            "listaPacientes", listaPacientes);

    response.sendRedirect("verPacientes.jsp");
}
*/
    
    

@Override
protected void doGet(HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

    System.out.println(">>> Se ejecuto SvPacientes.doGet()");

    List<Paciente> listaPacientes = control.getPacientes();

    System.out.println(">>> Lista de pacientes: "
            + (listaPacientes == null
                ? "ES NULL"
                : listaPacientes.size() + " pacientes"));

    HttpSession misesion = request.getSession();
    misesion.setAttribute("listaPacientes", listaPacientes);

    response.sendRedirect("verPacientes.jsp");
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
      

        // El registro se implementa mediante la Controladora.
        // La llamada debe coincidir con la firma real de tu método.
        control.crearPaciente(
                dni, nombre, apellido, telefono,
                direccion, fechaNac);

        response.sendRedirect("SvPacientes");
    }

    @Override
    public String getServletInfo() {
        return "Servlet para gestionar pacientes";
    }
}
