const btn = document.querySelector("button");

function mostrarTexto() {

  const input = document.getElementById("fname");
    if (input.value.trim() === "") {
  return;
}
  const resultado = document.getElementById("resultado");
  const li = document.createElement("li");

  li.innerHTML = `
    <span>${input.value}</span>
    <button class="editar">Editar</button>
    <button class="eliminar">Eliminar</button>
    <button class="guardar">Guardar Tarea</button>
    
  `;

  resultado.appendChild(li);

  const guardarBtn = li.querySelector(".guardar");
  guardarBtn.addEventListener("click", () => {
    const tareaTexto = li.querySelector("span").textContent;
    const tarea = JSON.parse(localStorage.getItem("tarea")) || [];

    if (!tarea.includes(tareaTexto)) {
      tarea.push(tareaTexto);
      localStorage.setItem("tarea", JSON.stringify(tarea));
      alert("Tarea guardada en localStorage");
      
      mostrarTareasGuardadas();
    }
    

    

});



  const editarBtn = li.querySelector(".editar");
  editarBtn.addEventListener("click", () => {
    const tarea = li.querySelector("span");
    const nuevoTexto = prompt("Ingrese el nuevo texto de la tarea:");
    if (nuevoTexto) {
      tarea.textContent = nuevoTexto;
    }
  });

  const eliminarBtn = li.querySelector(".eliminar");
  eliminarBtn.addEventListener("click", () => {
    const Texto = prompt("Desea eliminar esta tarea? si/no");
    if (Texto === "si") {
      li.remove();
      
    }
  });

  input.value = "";
}

 


function mostrarTareasGuardadas() {
    const listaGuardadas = document.getElementById("lista-guardadas");

    listaGuardadas.innerHTML = "";

    const tarea = JSON.parse(localStorage.getItem("tarea")) || [];

    tarea.forEach(tarea => {
        const li = document.createElement("li");
        li.textContent = tarea;
        listaGuardadas.appendChild(li);
       
     
      
    });
  
}




btn.addEventListener("click", mostrarTexto);

