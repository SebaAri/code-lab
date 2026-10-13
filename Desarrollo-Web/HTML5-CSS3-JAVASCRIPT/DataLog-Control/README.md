# DataLog Control

Aplicación web para la gestión, el seguimiento y el control de operaciones.

## Descripción

**DataLog Control** es un proyecto de desarrollo web que permite registrar y administrar operaciones, consultar información, buscar registros, filtrar por estado y generar reportes en formato PDF.

El sistema incluye un panel de control con indicadores estadísticos para facilitar la visualización y el seguimiento de las operaciones registradas.

## Funcionalidades

- **Gestión de operaciones:** registrar, consultar, modificar y eliminar operaciones.
- **Búsqueda:** localizar operaciones por ID o descripción.
- **Filtrado:** consultar operaciones según su estado: Procesada, Pendiente o Error.
- **Panel de control:** visualizar indicadores y estadísticas de las operaciones.
- **Reportes:** generar y descargar informes en formato PDF.
- **Persistencia local:** almacenar los registros en el navegador mediante `localStorage`.

## Tecnologías utilizadas

- HTML5
- CSS3
- JavaScript
- Bootstrap 5
- `localStorage`
- html2pdf.js

## Estructura del proyecto

```text
DataLog-Control/
├── index.html
├── operaciones.html
├── formulario.html
├── modificar.html
├── reportes.html
├── styles.css
└── js/
    ├── datos.js
    ├── operaciones.js
    ├── app.js
    └── validaciones.js
```

*La estructura puede variar según la organización final de los archivos del proyecto.*

## Instalación y ejecución

1. Clonar o descargar el repositorio.
2. Abrir la carpeta del proyecto.
3. Ejecutar `index.html` en un navegador web moderno.
4. Comenzar a registrar y administrar operaciones.

No requiere una base de datos externa, ya que los datos se almacenan localmente en el navegador.

## Almacenamiento de datos

La aplicación utiliza `localStorage` para conservar las operaciones entre sesiones del navegador en el mismo dispositivo y perfil de usuario.

Los datos no se sincronizan automáticamente entre distintos dispositivos o navegadores.

## Objetivo del proyecto

Aplicar conocimientos de desarrollo web mediante la construcción de una aplicación funcional que integre manipulación del DOM, eventos, funciones, arrays, filtrado de datos, almacenamiento local y generación de reportes.

## Autor

Proyecto personal de práctica y desarrollo de habilidades en programación web.

## Estado del proyecto

Completado.
