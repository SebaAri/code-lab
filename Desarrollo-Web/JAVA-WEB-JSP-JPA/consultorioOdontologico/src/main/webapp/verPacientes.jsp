
<%@page import="logica.Paciente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp"%>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Pacientes</h1>
    <p class="mb-4">
        A continuación podrá visualizar la lista de pacientes registrados.
    </p>

    <!-- DataTables Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">
                Pacientes
            </h6>
        </div>

        <div class="card-body">
            <div class="table-responsive">

                <table class="table table-bordered"
                       id="dataTable" width="100%" cellspacing="0">

                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Teléfono</th>
                            <th>Dirección</th>
                            <th>Fecha de nacimiento</th>
                            <th style="width: 210px;">Acción</th>
                        </tr>
                    </thead>

                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Teléfono</th>
                            <th>Dirección</th>
                            <th>Fecha de nacimiento</th>
                            <th>Acción</th>
                        </tr>
                    </tfoot>

                    <%
                        List<Paciente> listaPacientes =
                            (List<Paciente>) request.getSession()
                                .getAttribute("listaPacientes");
                    %>

                    <tbody>
                        <% if (listaPacientes != null
                                && !listaPacientes.isEmpty()) { %>

                            <% for (Paciente pac : listaPacientes) { %>

                                <tr>
                                    <td><%=pac.getId() %></td>
                                    <td><%= pac.getDni() %></td>
                                    <td><%= pac.getNombre() %></td>
                                    <td><%=pac.getApellido() %></td>
                                    <td><%= pac.getTelefono() %></td>
                                    <td><%= pac.getDireccion() %></td>
                                    <td><%= pac.getFecha_nacim() %></td>

                                    <td>
                                        <div class="d-flex justify-content-center gap-2">

                                            <!-- Formulario Eliminar -->
                                            <form action="SvElimPacientes"
                                                  method="POST"
                                                  onsubmit="return confirm('¿Desea eliminar este paciente?');">

                                                <input type="hidden" name="id"
                                                       value="<%= pac.getId() %>">

                                                <button type="submit"
                                                        class="btn btn-primary btn-user btn-block"
                                                        style="background-color: red;">
                                                    <i class="fas fa-trash-alt"></i>
                                                    Eliminar
                                                </button>
                                            </form>

                                            <!-- Formulario Editar -->
                                            <form action="SvEditPacientes"
                                                  method="GET">

                                                <input type="hidden" name="id"
                                                       value="<%=pac.getId() %>">

                                                <button type="submit"
                                                        class="btn btn-primary btn-user btn-block">
                                                    <i class="fas fa-pencil-alt"></i>
                                                    Editar
                                                </button>
                                            </form>

                                        </div>
                                    </td>
                                </tr>

                            <% } %>

                        <% } else { %>

                            <tr>
                                <td colspan="9" class="text-center text-danger">
                                    No hay pacientes registrados.
                                </td>
                            </tr>

                        <% } %>
                    </tbody>

                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<%@include file="components/bodyfinal.jsp" %>
