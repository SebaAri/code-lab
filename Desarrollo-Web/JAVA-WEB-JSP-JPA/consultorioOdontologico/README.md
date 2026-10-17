# 🦷 Sistema de Gestión de Consultorio Odontológico

Aplicación web desarrollada en Java para la gestión de las operaciones principales de un consultorio odontológico. El sistema permite administrar pacientes, odontólogos, turnos y usuarios mediante una interfaz web conectada a una base de datos MySQL.

## 📌 Descripción del proyecto

Este proyecto tiene como objetivo digitalizar y organizar la información de un consultorio odontológico, facilitando la administración de pacientes, profesionales, turnos y accesos al sistema.

Fue desarrollado como proyecto práctico para aplicar conocimientos de programación orientada a objetos, desarrollo web con Java, persistencia de datos y conexión con bases de datos relacionales.

## 🎓 Origen del proyecto

Proyecto desarrollado siguiendo los contenidos formativos de **TodoCode**, como parte de mi proceso de aprendizaje de Java y desarrollo de aplicaciones web.

A partir de esta experiencia, trabajé en la comprensión de la arquitectura del sistema, la gestión de entidades mediante JPA, las operaciones CRUD y la conexión con MySQL.

## 🚀 Tecnologías utilizadas

- **Java:** lógica de negocio y programación orientada a objetos.
- **JSP (JavaServer Pages):** generación de páginas web dinámicas.
- **Servlets:** recepción y procesamiento de peticiones HTTP.
- **JPA (Java Persistence API):** persistencia y gestión de entidades.
- **MySQL:** almacenamiento de los datos.
- **HTML y CSS:** estructura y presentación de la interfaz.
- **NetBeans IDE:** entorno de desarrollo.

## ⚙️ Funcionalidades

- Gestión de pacientes: alta, consulta, modificación y eliminación de registros.
- Gestión de odontólogos.
- Gestión de turnos.
- Administración de usuarios y acceso al sistema.
- Operaciones CRUD (crear, consultar, actualizar y eliminar).
- Conexión con base de datos MySQL mediante JPA.

*Las funcionalidades disponibles dependen del estado actual de desarrollo de cada módulo.*

## 🏗️ Arquitectura del proyecto

La aplicación organiza sus responsabilidades en distintas capas:

1. **Presentación:** páginas JSP que permiten al usuario interactuar con el sistema.
2. **Controladores web:** Servlets que reciben las peticiones HTTP.
3. **Lógica de negocio:** clases encargadas de coordinar las operaciones.
4. **Persistencia:** controladoras y clases JPA que gestionan las entidades.
5. **Base de datos:** MySQL, donde se almacenan los registros.

### Flujo general

`JSP → Servlet → Controladora → ControladoraPersistencia → JPA → MySQL`

## 🗄️ Base de datos

El sistema utiliza MySQL para almacenar la información del consultorio. JPA permite mapear las clases Java a entidades persistentes y realizar operaciones sobre los registros.

## 💻 Instalación y ejecución

Para ejecutar el proyecto en un entorno local:

1. Instalar el JDK compatible con la versión del proyecto.
2. Instalar Apache NetBeans y configurar un servidor compatible con la aplicación web.
3. Instalar MySQL.
4. Crear la base de datos y configurar las credenciales de conexión.
5. Abrir el proyecto desde NetBeans.
6. Verificar la configuración de JPA y la conexión a la base de datos.
7. Ejecutar y probar la aplicación desde el servidor configurado.

**Nota:** los nombres de la base de datos, las credenciales y la configuración del servidor deben ajustarse a los archivos reales del proyecto.

## 📚 Aprendizajes

Este proyecto me permitió practicar y reforzar conocimientos sobre:

- Programación orientada a objetos con Java.
- Desarrollo de aplicaciones web con JSP y Servlets.
- Separación de responsabilidades por capas.
- Operaciones CRUD.
- Persistencia de entidades mediante JPA.
- Conexión y gestión de datos con MySQL.
- Depuración y resolución de errores durante el desarrollo.

## 🔧 Mejoras futuras

- Implementar una API REST para exponer las funcionalidades del sistema.
- Mejorar el diseño visual y la experiencia de usuario.
- Ampliar las validaciones de formularios.
- Incorporar nuevas funcionalidades según las necesidades del consultorio.

## 👨‍💻 Autor

**Ariel R. Sebastian&#x20;**

Estudiante de Técnico Superior en Programación y egresado de Técnico Superior en Data Science.

- GitHub: [SebaAri](https://github.com/SebaAri)
- Portfolio: [Ver portfolio](https://sebaari.github.io/sebaari-dev/)

---

*Proyecto académico y de portfolio desarrollado con fines educativos y de práctica profesional.*
