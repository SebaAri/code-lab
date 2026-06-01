
CREATE TABLE lectores (
    id_lector SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    fecha_nacimiento DATE NOT NULL
);

INSERT INTO lectores (nombre, apellido, email, fecha_nacimiento) VALUES
('Juan Alberto', 'Cortéz', 'juancortez@gmail.com', '1983-06-20'),
('Antonia', 'de los Ríos', 'antoniarios_23@yahoo.com', '1978-11-24'),
('Nicolás Martin', 'Martin', 'nico_martin23@gmail.com', '1986-07-11'),
('Néstor', 'Casco', 'nestorcasc02331@hotmail.com', '1981-02-11'),
('Lisa', 'Pérez', 'lisperez@hotmail.com', '1994-08-11'),
('Ana Rosa', 'Estagnolli', 'anros@abcdatos.com', '1974-10-15'),
('Milagros', 'Pastoruti', 'mili_2231@gmail.com', '2001-01-22'),
('Pedro', 'Alonso', 'alonso.pedro@impermebilizantesrosario.com', '1983-09-05'),
('Arturo Ezequiel', 'Ramírez', 'artu.rama@outlook.com', '1998-03-29'),
('Juan Ignacio', 'Altarez', 'juanaltarez.223@yahoo.com', '1975-08-24');

CREATE TABLE libros (
    id_libro SERIAL PRIMARY KEY,
    nombre_libro VARCHAR(100) NOT NULL,
    editorial VARCHAR(80) NOT NULL,
    autor VARCHAR(80) NOT NULL,
    isbn VARCHAR(20) UNIQUE
);

INSERT INTO libros (nombre_libro, editorial, autor, isbn) VALUES
('Cementerio de animales', 'Ediciones de Mente', 'Stephen King', '4568874'),
('En el nombre de la rosa', 'Editorial España', 'Umberto Eco', '44558877'),
('Cien años de soledad', 'Sudamericana', 'Gabriel García Márquez', '7788845'),
('El diario de Ellen Rimbauer', 'Editorial Maine', 'Stephen King', '45699874'),
('La hojarasca', 'Sudamericana', 'Gabriel García Márquez', '7787898'),
('El amor en los tiempos del cólera', 'Sudamericana', 'Gabriel García Márquez', '2564111'),
('La casa de los espíritus', 'Ediciones Chile', 'Isabel Allende', '5544781'),
('Paula', 'Ediciones Chile', 'Isabel Allende', '22545447'),
('La tregua', 'Alfa', 'Mario Benedetti', '2225412'),
('Gracias por el fuego', 'Alfa', 'Mario Benedetti', '88541254');

SELECT * FROM lectores;
SELECT * FROM libros;

CREATE TABLE prestamos (
    id_prestamo SERIAL PRIMARY KEY,
    id_lector INT NOT NULL,
    id_libro INT NOT NULL,
    fecha_prestamo DATE NOT NULL DEFAULT CURRENT_DATE,
    FOREIGN KEY (id_lector) REFERENCES lectores(id_lector),
    FOREIGN KEY (id_libro) REFERENCES libros(id_libro),
    UNIQUE (id_libro)
);

ALTER TABLE prestamos
DROP CONSTRAINT prestamos_id_libro_key;


INSERT INTO prestamos (id_lector, id_libro) VALUES
-- Lector 1
(1,1),(1,2),(1,3),(1,4),(1,5),

-- Lector 2
(2,6),(2,7),(2,8),(2,9),(2,1),

-- Lector 3
(3,2),(3,3),(3,4),(3,5),(3,6),

-- Lector 4
(4,7),(4,8),(4,9),(4,1),(4,2);

INSERT INTO prestamos (id_lector, id_libro) VALUES
-- Lector 5
(5,1),(5,2),(5,3),

-- Lector 6
(6,4),(6,5),(6,6),

-- Lector 7
(7,7),(7,8),(7,9);

INSERT INTO prestamos (id_lector, id_libro) VALUES
(8,8),
(9,9);

SELECT * FROM lectores
WHERE id_lector NOT IN (
    SELECT DISTINCT id_lector FROM prestamos
);

SELECT id_lector, COUNT(*) AS cantidad_libros
FROM prestamos
GROUP BY id_lector
ORDER BY cantidad_libros DESC;

SELECT 
    l.id_lector,
    l.nombre,
    l.apellido,
    COUNT(p.id_libro) AS cantidad_libros
FROM lectores l
LEFT JOIN prestamos p ON l.id_lector = p.id_lector
GROUP BY l.id_lector, l.nombre, l.apellido
ORDER BY cantidad_libros DESC;

SELECT id_prestamo, id_libro
FROM prestamos
WHERE id_lector = 1;

DELETE FROM prestamos
WHERE id_lector = 1
  AND id_libro = 3;

SELECT 
    l.id_lector,
    l.nombre,
    l.apellido,
    COUNT(p.id_libro) AS cantidad_libros
FROM lectores l
LEFT JOIN prestamos p ON l.id_lector = p.id_lector
GROUP BY l.id_lector, l.nombre, l.apellido
ORDER BY cantidad_libros DESC;

SELECT 
    ROUND(AVG(EXTRACT(YEAR FROM AGE(CURRENT_DATE, fecha_nacimiento))), 2) 
    AS promedio_edad
FROM lectores;


SELECT 
    id_lector,
    nombre,
    apellido,
    EXTRACT(YEAR FROM AGE(CURRENT_DATE, fecha_nacimiento)) AS edad
FROM lectores
ORDER BY fecha_nacimiento ASC
LIMIT 1;

SELECT 
    id_lector,
    nombre,
    apellido,
    EXTRACT(YEAR FROM AGE(CURRENT_DATE, fecha_nacimiento)) AS edad
FROM lectores
ORDER BY fecha_nacimiento DESC
LIMIT 1;

SELECT
    ROUND(AVG(EXTRACT(YEAR FROM AGE(CURRENT_DATE, fecha_nacimiento))), 2) 
        AS promedio_edad,
    MAX(EXTRACT(YEAR FROM AGE(CURRENT_DATE, fecha_nacimiento))) 
        AS edad_maxima,
    MIN(EXTRACT(YEAR FROM AGE(CURRENT_DATE, fecha_nacimiento))) 
        AS edad_minima
FROM lectores;


CREATE VIEW libros_prestados AS
SELECT
    l.nombre AS nombre_lector,
    l.apellido AS apellido_lector,
    b.nombre_libro,
    b.editorial,
    b.isbn
FROM lectores l
JOIN prestamos p ON l.id_lector = p.id_lector
JOIN libros b ON p.id_libro = b.id_libro;

SELECT * FROM libros_prestados;

SELECT * FROM libros_prestados
WHERE nombre_lector = 'Pedro'
  AND apellido_lector = 'Alonso';

ALTER TABLE PRESTAMOS
ADD COLUMN Fecha_Devolucion DATE;

SELECT * FROM PRESTAMOS;

CREATE TABLE logs (
    Id_Lector  INT NOT NULL PRIMARY KEY,
  id_Libro INT NOT NULL,
 Fecha_Hora_Devolucion  TIMESTAMP
);

SELECT Libros_Prestados();

SELECT * FROM Logs;

SELECT 
    l.id_lector,
    l.nombre,
    l.apellido,
	logs.id_Libro,
    logs.Fecha_Hora_Devolucion
FROM LECTORES l
INNER JOIN Logs logs 
    ON l.id_lector = logs.Id_lector
GROUP BY 
    l.id_lector,
    logs.id_libro,
    l.nombre,
    l.apellido,
    logs.Fecha_Hora_Devolucion;

