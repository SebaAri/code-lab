
<%@page import="logica.Odontologo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp"%>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Odontólogos</h1>
    <p class="mb-4">
        A continuación podrá visualizar la lista de odontólogos registrados.
    </p>

    <!-- DataTables Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">
                Odontólogos
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
                            <th>Especialidad</th>
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
                            <th>Especialidad</th>
                            <th>Acción</th>
                        </tr>
                    </tfoot>

                    <%
                        List<Odontologo> listaOdontologos =
                            (List<Odontologo>) request.getSession()
                                .getAttribute("listaOdontologos");
                    %>

                    <tbody>
                        <% if (listaOdontologos != null
                                && !listaOdontologos.isEmpty()) { %>

                            <% for (Odontologo od : listaOdontologos) { %>

                                <tr>
                                    <td><%= od.getId() %></td>
                                    <td><%= od.getDni() %></td>
                                    <td><%= od.getNombre() %></td>
                                    <td><%= od.getApellido() %></td>
                                    <td><%= od.getTelefono() %></td>
                                    <td><%= od.getDireccion() %></td>
                                    <td><%= od.getFecha_nacim() %></td>
                                    <td><%= od.getEspecialidad() %></td>

                                    <td>
                                        <div class="d-flex justify-content-center gap-2">

                                            <!-- Formulario Eliminar -->
                                            <form action="SvElimOdontologos"
                                                  method="POST"
                                                  onsubmit="return confirm('¿Desea eliminar este odontólogo?');">

                                                <input type="hidden" name="id"
                                                       value="<%= od.getId() %>">

                                                <button type="submit"
                                                        class="btn btn-primary btn-user btn-block"
                                                        style="background-color: red;">
                                                    <i class="fas fa-trash-alt"></i>
                                                    Eliminar
                                                </button>
                                            </form>

                                            <!-- Formulario Editar -->
                                            <form action="SvEditOdontologos"
                                                  method="GET">

                                                <input type="hidden" name="id"
                                                       value="<%= od.getId() %>">

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
                                    No hay odontólogos registrados.
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
