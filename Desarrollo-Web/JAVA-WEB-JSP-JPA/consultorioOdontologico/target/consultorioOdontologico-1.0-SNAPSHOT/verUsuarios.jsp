<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp"%> 

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
    <p class="mb-4">A continuación podrá visualizar la lista completa de usuarios</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre de Usuario</th>
                            <th>Rol</th>
                            <th style="width: 210px;">Acción</th>
                        </tr>
                    </thead>
                    
                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>Nombre de Usuario</th>
                            <th>Rol</th>
                            <th style="width: 210px;">Acción</th>
                        </tr>
                    </tfoot>

                    <%
                        List<Usuario> listaUsuarios = (List<Usuario>) request.getSession().getAttribute("listaUsuarios");
                    %>

                    <tbody>
                        <% if (listaUsuarios != null && !listaUsuarios.isEmpty()) { %>
                            
                            <% for (Usuario usu : listaUsuarios) { %>
                                <tr>
                                    <td><%= usu.getId_Usuario() %></td>
                                    <td><%= usu.getNombreUsuario() %></td>
                                    <td><%= usu.getRol() %></td>
                                    <td style="display: flex; width: 230px;">
                                        
                                        <!-- Formulario Eliminar -->
                                        <form name="eliminar" action="SvElimUsuarios" method="POST">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" 
                                                    style="background-color:red; margin-right: 5px;">
                                                <i class="fas fa-trash-alt"></i> Eliminar
                                            </button>
                                            <input type="hidden" name="id" value="<%= usu.getId_Usuario() %>">
                                        </form>

                                        <!-- Formulario Editar -->
                                        <form name="editar" action="SvEditUsuarios" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" 
                                                    style="margin-left: 5px;">
                                                <i class="fas fa-pencil-alt"></i> Editar
                                            </button>
                                            <input type="hidden" name="id" value="<%= usu.getId_Usuario() %>">
                                        </form>

                                    </td>
                                </tr>
                            <% } %>

                        <% } else { %>
                            <tr>
                                <td colspan="4" class="text-center text-danger">
                                    No hay usuarios registrados o no se pudo cargar la lista.
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