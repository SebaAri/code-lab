
function actualizarDashboard() {
    const totalElemento = document.getElementById("totalOperaciones");

    // Evita errores si el panel no está presente.
    if (!totalElemento) {
        return;
    }

    const operaciones = obtenerOperaciones();

    totalElemento.textContent = operaciones.length;

    document.getElementById("operacionesProcesadas").textContent =
        operaciones.filter(function(operacion) {
            return operacion.estado === "Procesada";
        }).length;

    document.getElementById("operacionesPendientes").textContent =
        operaciones.filter(function(operacion) {
            return operacion.estado === "Pendiente";
        }).length;

    document.getElementById("operacionesErrores").textContent =
        operaciones.filter(function(operacion) {
            return operacion.estado === "Error";
        }).length;
}

actualizarDashboard();



function modificarDatos(id) {
    const formulario = document.getElementById("formularioOperacion");

    if (!formulario) {
        return;
    }

    const operaciones = obtenerOperaciones();

    const operacion = operaciones.find(function(operacion) {
        return operacion.id === id;
    });

    if (!operacion) {
        return;
    }

    document.getElementById("cantidad").value = operacion.cantidad;
    document.getElementById("fecha").value = operacion.fecha;
    document.getElementById("autoSizingSelect").value = operacion.estado;
    document.getElementById("descripcion").value = operacion.descripcion;
}
;

