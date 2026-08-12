# 📊 Operations & Data Control Platform

Un sitio web responsivo de 3 páginas diseñado para la visualización, control y gestión de datos de operaciones. Este proyecto fue desarrollado utilizando **Bootstrap 5** para la estructura de componentes y **Sass (SCSS)** para una arquitectura de estilos escalable, mantenible y basada en metodologías modernas de desarrollo frontend.

---

## 🛠️ Stack Tecnológico & Herramientas

* **HTML5 Semántico:** Estructura limpia y accesible dividida en entornos multi-página.
* **Bootstrap 5 (UI Framework):** Implementación del sistema de grilla fluida, utilidades de espaciado y componentes nativos avanzados.
* **Sass / SCSS (Preprocesador):** Modularización de estilos mediante el uso de variables, anidación estricta y mecanismos de herencia.

---

## 📐 Arquitectura de las Páginas

El sitio se compone de tres vistas estratégicas y completamente adaptables:

### 1. Panel de Inicio (Dashboard & Overview)
* **Navegación Global:** Barra de menú (`.navbar`) con posicionamiento fijo (`sticky/fixed`) en la parte superior para garantizar un acceso fluido entre secciones.
* **Mensaje Principal:** Un componente de tipo *Jumbotron* personalizado que expone la propuesta de valor del sistema de control de operaciones.
* **Galería Dinámica:** Un *Carousel* integrado para la exposición visual de capturas y métricas destacadas del procesamiento de datos.

### 2. Catálogo de Servicios de Datos
* **Estructura Grid:** Distribución adaptativa basada en filas (`.row`) y columnas (`.col-*`) que se reordenan automáticamente según el dispositivo de visualización.
* **Módulos Contenedores:** Uso de *Cards* de Bootstrap para segmentar de forma limpia las especificaciones técnicas de cada servicio operativo.

### 3. Centro de Contacto & Soporte
* **Formularios Estructurados:** Formulario de captura validado con clases nativas de control de estado (`.form-control`).
* **Campos Técnicos:** Inputs optimizados para la recolección de Nombre, Correo Electrónico, Asunto y un área de texto extendida para el Mensaje.

---

## 🎨 Ingeniería de Estilos con Sass (SCSS)

La lógica visual se estructuró evitando la repetición de código y asegurando la escalabilidad del diseño mediante las siguientes características del preprocesador:

* **Variables de Configuración:** Centralización de la identidad visual del sitio (paleta de colores principales, tipografías del sistema y escalas de tamaño de texto).
* **Anidación Limpia (Nesting):** Mapeo de selectores que imita la estructura del árbol DOM, reduciendo el ruido en el código y encapsulando los estilos por componentes.
* **Herencia (`@extend`):** Reutilización de bloques de código comunes (como estructuras de botones o alertas) para mantener el CSS compilado limpio y alineado al principio DRY (*Don't Repeat Yourself*).

```scss
// Ejemplo conceptual de la arquitectura Sass utilizada
$color-primary: #003f47;
$font-main: 'Segoe UI', sans-serif;

.form-busqueda {
  font-family: $font-main;
  background-color: lighten($color-primary, 60%);
  
  .fila-campo {
    display: flex;
    align-items: center;
    
    input {
      border: 1px solid $color-primary;
      @extend %shared-input-styles; // Uso de herencia
    }
  }
}
