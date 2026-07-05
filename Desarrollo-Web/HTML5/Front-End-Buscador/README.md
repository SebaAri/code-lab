# 🔍 Google Search Suite (Clon de Interfaces Avanzadas)

Este proyecto consiste en una réplica funcional y visual de tres de las interfaces principales del motor de búsqueda de Google: la **Búsqueda Principal**, la **Búsqueda de Imágenes** y la **Búsqueda Avanzada**. 

El objetivo principal de este laboratorio fue dominar la manipulación de formularios HTML nativos, la integración con motores de búsqueda reales mediante el método `GET`, y la alineación precisa de layouts complejos y rígidos.

---

## 🚀 Páginas Incluidas

1. **Google Principal (`index.html`):** Interfaz clásica y minimalista centrada con capacidad de búsqueda general y el botón funcional "Me siento afortunado".
2. **Google Imágenes:** Variante especializada que dirige las consultas directamente al motor de indexación visual de Google.
3. **Búsqueda Avanzada:** Formulario estructurado con lógica de filtrado específica que emula las directrices exactas de ordenamiento de Google.

---

## 🛠️ Tecnologías Utilizadas

* **HTML5 Estructural:** Uso exhaustivo de formularios (`<form>`), inputs diversificados (`text`, `submit`) y etiquetas de vinculación accesibles (`<label>`).
* **CSS3 Nativo:** 
  * Uso de **Flexbox** para centrado absoluto, distribución en columnas y alineación quirúrgica de los campos del formulario avanzado.
  * Propiedades de posicionamiento avanzado (`position: fixed`) para los accesos directos de navegación entre las vistas.
  * Efectos interactivos mediante pseudo-clases (`:hover`, `:focus`, `:active`) que replican las transiciones de sombra (`box-shadow`) y variaciones de bordes originales de Google.
* **Fuentes Web:** Integración de tipografías externas mediante Google Fonts (`Open Sans`).

---

## 📊 Integración Técnica de Parámetros (Query Strings)

El valor técnico más importante de este proyecto es el comportamiento funcional de los formularios, los cuales envían parámetros reales utilizando el método `GET` a los servidores de Google:

| Input (Name) | Propósito de Filtrado Técnico | Destino Final (Action) |
| :--- | :--- | :--- |
| `q` | Búsqueda general o término exacto de imágenes | `google.com/search` y `google.com/images` |
| `as_q` | Coincidencia de todas las palabras clave especificadas | `google.com/search` (Avanzada) |
| `as_epq` | Coincidencia exacta de frase o palabras (equivale a usar comillas) | `google.com/search` (Avanzada) |
| `as_oq` | Operador lógico inclusivo (equivale a usar la sentencia "OR") | `google.com/search` (Avanzada) |
| `as_eq` | Operador de exclusión estricta (equivale a usar el signo menos `-`) | `google.com/search` (Avanzada) |

---

## 🧠 Desafíos Superados y Aprendizajes

* **Alineación Asimétrica con Flexbox:** El diseño de la *Búsqueda Avanzada* requirió estructurar filas estables donde el texto informativo descriptivo (`label-info`) se alineara exactamente en una grilla implícita junto a las cajas de texto utilizando técnicas de `min-width` y `calc()`.
* **Prioridad y Especificidad en CSS:** Se controló de manera precisa el solapamiento de estilos generales de los inputs (`input[type="text"]`) frente a los estilos específicos del formulario avanzado (`input.buscador1`) para que los comportamientos de foco no rompieran la estética clásica de cada vista.

---

## 👤 Autor

* **Ariel Roberto Sebastian** - *Software Developer & Data*
* LinkedIn: [arielrsebas](https://www.linkedin.com/in/arielrsebas)
* GitHub: [@SebaAri](https://github.com/SebaAri)
