 $(document).ready(function() {
    const btn = $("button");
    $("input").focus();
    // Ejecutar al cargar la página para mostrar lo que ya estaba guardado
    mostrarTareasGuardadas();

    // Asignar eventos al botón principal

    btn.click(mostrarTexto);

    function mostrarTexto() {
        const input = $("#fname");
        if (input.val().trim() === "") return;

        const resultado = $("#resultado");
        const li = $("<li>").html(`
            <span>${input.val()}</span>
            <button class="editar">Editar</button>
            <button class="eliminar">Eliminar</button>
            <button class="guardar">Guardar</button>
        `);

        resultado.append(li);
        
        // Evento Guardar
        li.find(".guardar").click(function() {
            const tareaTexto = li.find("span").text();
            const tareas = JSON.parse(localStorage.getItem("tareas")) || [];

            if (!tareas.includes(tareaTexto)) {
                tareas.push(tareaTexto);
                localStorage.setItem("tareas", JSON.stringify(tareas));
                alert("Tarea guardada en localStorage");
                li.remove()
                mostrarTareasGuardadas();
            
             
            }
        });

        // Evento Editar
        li.find(".editar").click(function() {
            const tarea = li.find("span");
            const nuevoTexto = prompt("Ingrese el nuevo texto de la tarea:");
            if (nuevoTexto) {
                tarea.text(nuevoTexto);
            }
        });

        // Evento Eliminar (De la pantalla)
        li.find(".eliminar").click(function() {
            const texto = prompt("Desea eliminar esta tarea? si/no");
            if (texto === "si") {
                li.remove();
            }
        });

        input.val(""); // Limpiar input
    }

    function mostrarTareasGuardadas() {
        const listaGuardadas = $("#lista-guardadas");
        listaGuardadas.empty();
        const tareas = JSON.parse(localStorage.getItem("tareas")) || [];

        $.each(tareas, function(index, tarea) {
            $("<li>").text(tarea).appendTo(listaGuardadas);
        });
    
    }

    function limpiarTareas(){
        // Espera un elemento botón con id "clear-tasks" para eliminar todas las tareas guardadas
        $("#clear-tasks").click(function() {
            const texto = prompt("Desea eliminar todas las tareas? si/no");
            if (texto === "si") {
                localStorage.removeItem("tareas");
                $("#lista-guardadas").empty();
                alert("Todas las tareas eliminadas");
            }
        });
    }

    // Inicializar controlador de limpieza (no obligatorio si no existe el botón)
    limpiarTareas();


    });
