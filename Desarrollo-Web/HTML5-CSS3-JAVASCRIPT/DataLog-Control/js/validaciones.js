function mostrarReportes() {
    const tabla = document.getElementById("tablaOperaciones");

    if (!tabla) {
        return;
    }

    tabla.innerHTML = "";

    const operaciones = obtenerOperaciones();

    operaciones.forEach(function(operacion) {
        const fila = document.createElement("tr");

        fila.innerHTML = `
            <th scope="row">${operacion.id}</th>
            <td>${operacion.cantidad}</td>
            <td>${operacion.fecha}</td>
            <td>${operacion.estado}</td>
            <td>${operacion.descripcion}</td>
           
        `;

        tabla.appendChild(fila);
    });
}

mostrarReportes();