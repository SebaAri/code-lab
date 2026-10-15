
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Alta Pacientes</h1>
<p>Este es el apartado para dar de alta los diferentes pacientes en el sistema.</p>

<form class="user" action="SvPacientes" method="POST">

    <div class="form-group col">

        <div class="col-sm-6 mb-3">
            <input type="text"
                   class="form-control form-control-user"
                   id="dni"
                   name="dni"
                   placeholder="DNI"
                   required>
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text"
                   class="form-control form-control-user"
                   id="nombre"
                   name="nombre"
                   placeholder="Nombre"
                   required>
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text"
                   class="form-control form-control-user"
                   id="apellido"
                   name="apellido"
                   placeholder="Apellido"
                   required>
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text"
                   class="form-control form-control-user"
                   id="telefono"
                   name="telefono"
                   placeholder="Teléfono"
                   required>
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text"
                   class="form-control form-control-user"
                   id="direccion"
                   name="direccion"
                   placeholder="Dirección"
                   required>
        </div>

        <div class="col-sm-6 mb-3">
            <input type="date"
                   class="form-control form-control-user"
                   id="fechanac"
                   name="fechanac"
                   required>
        </div>

      

        <!-- Más adelante podemos incorporar usuarios y horarios. -->

    </div>

    <button class="btn btn-primary btn-user btn-block" type="submit">
        Crear Paciente
    </button>

</form>

<%@include file="components/bodyfinal.jsp" %>
