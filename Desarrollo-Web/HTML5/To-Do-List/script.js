const btn = document.querySelector("button");

function cambiarColor() {
  const backcolor = "rgb(0, 252, 0)";
  btn.style.backgroundColor = backcolor;
}

function mostrarTexto() {
  const input = document.getElementById("fname");
  const resultado = document.getElementById("resultado");

  const li = document.createElement("li");

  li.innerHTML = `
    <span>${input.value}</span>
    <button class="editar">Editar</button>
    <button class="eliminar">Eliminar</button>
  `;

  resultado.appendChild(li);

  input.value = "";

  const editarBtn = li.querySelector(".editar");

  editarBtn.addEventListener("click", () => {
    const tarea = li.querySelector("span");

    const nuevoTexto = prompt("Ingrese el nuevo texto de la tarea:");

    if (nuevoTexto) {
      tarea.textContent = nuevoTexto;
    }
  });
}

function eliminarTarea() {
  const eliminarBtn = document.querySelectorAll(".eliminar");
  eliminarBtn.forEach((btn) => {
    btn.addEventListener("click", () => {
      const Texto = prompt("Desea eliminar esta tarea? si/no");
      if (Texto === "si") {
        btn.parentElement.remove();
      }
    });
  });
}

btn.addEventListener("click", cambiarColor);
btn.addEventListener("click", mostrarTexto);
btn.addEventListener("click", eliminarTarea);
