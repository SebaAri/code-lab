// 1. CARGAR TAREAS AL ABRIR/REFRESCAR LA PÁGINA
document.addEventListener("DOMContentLoaded", function() {
    mostrarTareas();
});

// Función auxiliar para obtener siempre un arreglo válido
function obtenerTareasStorage() {
    const datos = JSON.parse(localStorage.getItem("mis_tareas"));
    return Array.isArray(datos) ? datos : [];
}

function mostrarTareas() {
    const listaUI = document.getElementById("listaTareas");
    listaUI.innerHTML = "";

    const tareasGuardadas = obtenerTareasStorage();

    tareasGuardadas.forEach((textoTarea, index) => {
        const nuevaTarea = document.createElement("li");
        nuevaTarea.textContent = textoTarea + " ";

        const botonEliminar = document.createElement("button");
        botonEliminar.textContent = "Eliminar";
        botonEliminar.onclick = function() {
            eliminarDeStorage(index);
        };

        nuevaTarea.appendChild(botonEliminar);
        listaUI.appendChild(nuevaTarea);
    });
}

// 2. AGREGAR NUEVA TAREA
function agregarTarea() {
    const inputTarea = document.getElementById("nuevaTarea");
    const nuevaTareaTexto = inputTarea.value.trim();

    if (nuevaTareaTexto === "") {
        alert("Por favor, ingrese una tarea");
        return;
    }

    const tareasGuardadas = obtenerTareasStorage();
    tareasGuardadas.push(nuevaTareaTexto);
    localStorage.setItem("mis_tareas", JSON.stringify(tareasGuardadas));

    inputTarea.value = "";
    mostrarTareas();
}

// 3. ELIMINAR TAREA POR SU ÍNDICE
function eliminarDeStorage(indice) {
    let tareas = obtenerTareasStorage();
    tareas.splice(indice, 1);
    localStorage.setItem("mis_tareas", JSON.stringify(tareas));
    mostrarTareas();
}