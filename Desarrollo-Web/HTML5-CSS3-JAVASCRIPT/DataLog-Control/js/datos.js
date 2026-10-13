function obtenerOperaciones() {
    const datos = localStorage.getItem("operaciones");

    return datos ? JSON.parse(datos) : [];
}

function guardarOperaciones(operaciones) {
    localStorage.setItem("operaciones", JSON.stringify(operaciones));
}

function agregarOperacion(nuevaOperacion) {
    const operaciones = obtenerOperaciones();

    operaciones.push(nuevaOperacion);

    guardarOperaciones(operaciones);
}

function obtenerNuevoId() {
    const operaciones = obtenerOperaciones();

    if (operaciones.length === 0) {
        return 1;
    }

    const mayorId = Math.max(
        ...operaciones.map(function(operacion) {
            return Number(operacion.id);
        })
    );

    return mayorId + 1;
}

