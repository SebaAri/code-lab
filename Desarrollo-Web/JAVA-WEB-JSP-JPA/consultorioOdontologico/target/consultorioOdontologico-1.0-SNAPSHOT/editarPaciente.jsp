
<%@page import="logica.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<div class="container-fluid">

    <h1 class="h3 mb-2 text-gray-800">Edición de Pacientes</h1>

    <p class="mb-4">
        Este es el apartado para modificar los datos de un paciente.
    </p>

    <%
        Paciente pac = (Paciente)
            request.getSession().getAttribute("pacEditar");

        if (pac == null) {
            response.sendRedirect("SvPacientes");
            return;
        }
    %>

    <div class="card shadow mb-4">

        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">
                Datos del paciente
            </h6>
        </div>

        <div class="card-body">

            <form class="user" action="SvEditPacientes" method="POST">

                <div class="form-group col">

                    <div class="col-sm-6 mb-3">
                        <label for="dni">DNI</label>
                        <input type="text"
                               class="form-control form-control-user"
                               id="dni"
                               name="dni"
                               value="<%= pac.getDni() %>"
                               required>
                    </div>

                    <div class="col-sm-6 mb-3">
                        <label for="nombre">Nombre</label>
                        <input type="text"
                               class="form-control form-control-user"
                               id="nombre"
                               name="nombre"
                               value="<%= pac.getNombre() %>"
                               required>
                    </div>

                    <div class="col-sm-6 mb-3">
                        <label for="apellido">Apellido</label>
                        <input type="text"
                               class="form-control form-control-user"
                               id="apellido"
                               name="apellido"
                               value="<%= pac.getApellido() %>"
                               required>
                    </div>

                    <div class="col-sm-6 mb-3">
                        <label for="telefono">Teléfono</label>
                        <input type="tel"
                               class="form-control form-control-user"
                               id="telefono"
                               name="telefono"
                               value="<%= pac.getTelefono() %>">
                    </div>

                    <div class="col-sm-6 mb-3">
                        <label for="direccion">Dirección</label>
                        <input type="text"
                               class="form-control form-control-user"
                               id="direccion"
                               name="direccion"
                               value="<%= pac.getDireccion() %>">
                    </div>

                    <div class="col-sm-6 mb-3">
                        <label for="fechanac">Fecha de nacimiento</label>
                        <input type="date"
                               class="form-control form-control-user"
                               id="fechanac"
                               name="fechanac"
                               value="<%= pac.getFecha_nacim() %>">
                    </div>

                  

                </div>

                <button class="btn btn-primary btn-user btn-block"
                        type="submit">
                    <i class="fas fa-save"></i>
                    Guardar modificación
                </button>

            </form>

        </div>
    </div>
</div>

</div>

<%@include file="components/bodyfinal.jsp" %>
