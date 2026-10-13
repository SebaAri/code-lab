

const botonOpe = document.getElementById("operaciones");

if (botonOpe) {
    botonOpe.addEventListener("click", function() {
        window.location.href = "operaciones.html";
    });
}


const botonRep = document.getElementById("reportes");

if (botonRep) {
    botonRep.addEventListener("click", function() {
        window.location.href = "reportes.html";
    });
}


const botonNueva = document.getElementById("nuevaOperacion");

if (botonNueva) {
    botonNueva.addEventListener("click", function() {
        window.location.href = "formulario.html";
    });
}






// ===============================
// MOSTRAR OPERACIONES
// ===============================


function mostrarOperaciones() {
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
            <td>
                <div class="d-flex justify-content-center gap-3">
                    <button class="btn btn-warning"
                        onclick="editarOperacion(${operacion.id})">
                        Editar
                    </button>
                    <button class="btn btn-danger"
                        onclick="eliminarOperacion(${operacion.id})">
                        Eliminar
                    </button>
                </div>
            </td>
        `;

        tabla.appendChild(fila);
    });
}

mostrarOperaciones();



function eliminarOperacion(id) {
    const confirmar = confirm(
        "¿Está seguro de eliminar esta operación?"
    );

    if (!confirmar) {
        return;
    }

    const operaciones = obtenerOperaciones();

    const operacionesActualizadas = operaciones.filter(
        function(operacion) {
            return operacion.id !== id;
        }
    );

    guardarOperaciones(operacionesActualizadas);

    mostrarOperaciones();
}



// ===============================
// EDITAR OPERACIÓN
// ===============================


function editarOperacion(id) {
    window.location.href = "modificar.html?id=" + id;
}



const formulario = document.getElementById("formularioOperacion");

if (formulario) {
    formulario.addEventListener("submit", function(evento) {
        evento.preventDefault();

        const nuevaOperacion = {
            id: obtenerNuevoId(),
            cantidad: Number(document.getElementById("cantidad").value),
            fecha: document.getElementById("fecha").value,
            estado: document.getElementById("autoSizingSelect").value,
            descripcion: document.getElementById("descripcion").value.trim()
        };

        // Guardar la operación en localStorage
        agregarOperacion(nuevaOperacion);

        alert("¡Operación guardada correctamente!");

        formulario.reset();

        // Volver a la página de operaciones
        window.location.href = "operaciones.html";
    });
}


const formularioModificar = document.getElementById("formularioModificar");

if (formularioModificar) {
    const parametros = new URLSearchParams(window.location.search);
    const idOperacion = parametros.get("id");

    const operacionesGuardadas = obtenerOperaciones();

    const operacionEditar = operacionesGuardadas.find(function(operacion) {
        return String(operacion.id) === idOperacion;
    });

    if (!operacionEditar) {
        alert("No se encontró la operación que querés modificar.");
        window.location.href = "operaciones.html";
    } else {
        // Cargar los datos actuales en los campos
        document.getElementById("cantidad").value = operacionEditar.cantidad;
        document.getElementById("fecha").value = operacionEditar.fecha;
        document.getElementById("autoSizingSelect").value = operacionEditar.estado;
        document.getElementById("descripcion").value = operacionEditar.descripcion;

        // Guardar los cambios
        formularioModificar.addEventListener("submit", function(evento) {
            evento.preventDefault();

            const operaciones = obtenerOperaciones();

            const indice = operaciones.findIndex(function(operacion) {
                return String(operacion.id) === idOperacion;
            });

            if (indice === -1) {
                alert("No se encontró la operación.");
                return;
            }

            operaciones[indice] = {
                ...operaciones[indice],
                cantidad: Number(document.getElementById("cantidad").value),
                fecha: document.getElementById("fecha").value,
                estado: document.getElementById("autoSizingSelect").value,
                descripcion: document.getElementById("descripcion").value.trim()
            };

            guardarOperaciones(operaciones);

            alert("¡Operación modificada correctamente!");

            window.location.href = "operaciones.html";
        });
    }
}


const botonBuscar = document.getElementById("buscar");

if (botonBuscar) {
    botonBuscar.addEventListener("click", function() {

        const texto = document
            .getElementById("formGroupExampleInput1")
            .value.trim()
            .toLowerCase();

        const operaciones = obtenerOperaciones();

        const resultados = operaciones.filter(function(operacion) {
            return String(operacion.id).includes(texto) ||
                   operacion.descripcion.toLowerCase().includes(texto);
        });

        mostrarResultados(resultados);
    });
}

function mostrarResultados(operaciones) {
    const tabla = document.getElementById("tablaOperaciones");

    if (!tabla) return;

    tabla.innerHTML = "";

    operaciones.forEach(function(operacion) {
        const fila = document.createElement("tr");

        fila.innerHTML = `
            <th scope="row">${operacion.id}</th>
            <td>${operacion.cantidad}</td>
            <td>${operacion.fecha}</td>
            <td>${operacion.estado}</td>
            <td>${operacion.descripcion}</td>
            <td>
                <div class="d-flex justify-content-center gap-3">
                    <button class="btn btn-warning"
                        onclick="editarOperacion(${operacion.id})">
                        Editar
                    </button>
                    <button class="btn btn-danger"
                        onclick="eliminarOperacion(${operacion.id})">
                        Eliminar
                    </button>
                </div>
            </td>
        `;

        tabla.appendChild(fila);
    });
}



const botonFiltrar = document.getElementById("filtrar");

if (botonFiltrar) {
    botonFiltrar.addEventListener("click", function() {

        const texto = document
            .getElementById("autoSizingSelect")
            .value
            .toLowerCase();

        const operaciones = obtenerOperaciones();

        const resultados = operaciones.filter(function(operacion) {

            if (texto === "todos") {
                return true;
            }

            return operacion.estado.toLowerCase() === texto;
        });

        mostrarResultados(resultados);
    });
}

