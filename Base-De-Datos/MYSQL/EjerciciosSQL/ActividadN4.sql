create database empleados;
use empleados;
create table departamentos (
codDepto varchar (4) primary key,
nombreDpto varchar (20),
ciudad varchar (15),
codDirector varchar (12) not null--
-- foreign key (codDirector) references empleados (jefeID)
);
create table empleados (
nDIEmp varchar (12) primary key,
nomEmp varchar (30),
sexEmp varchar (1),
fecNac date,
fecIncorporacion date,
salEmp float,
comisionE float,
cargoE varchar (15),
jefeID varchar (12),
codDepto1 varchar (4) not null
-- foreign key (jefeID) references empleados (nDIEmp),
-- foreign key (codDepto1) references departamentos (codDepto)
);
-- Las llaves foraneas fueron creadas con el asistente.
select * from departamentos;
INSERT INTO departamentos VALUES('MARK','Marketing', 'Buenos Aires', 'Rodriguez01');
INSERT INTO departamentos VALUES('SIST','Sistemas', 'Cordoba', 'Fernandez03');
INSERT INTO departamentos VALUES('REHU','Recursos Humanos','Entre Rios', 'Gutierrez04');
INSERT INTO departamentos VALUES('INGE','Ingenieria','La Plata', 'Marcos09');
INSERT INTO departamentos VALUES('CONT','Contabilidad', 'Buenos Aires', 'Suarez07');

select * from empleados;
INSERT INTO empleados VALUES('G8752124H', 'Marta', 'F', '1985-09-24','2006-01-11', '200','100.10','Vendedor','25.321.212','MARK');
INSERT INTO empleados VALUES(2, 'Y5575632D', 'Adela', 'Salas', 'Díaz', 2);
INSERT INTO empleados VALUES(3, 'R6970642B', 'Adolfo', 'Rubio', 'Flores', 3);
INSERT INTO empleados VALUES(4, '77705545E', 'Adrián', 'Suárez', NULL, 4);
INSERT INTO empleados VALUES(5, '17087203C', 'Marcos', 'Loyola', 'Méndez', 5);
INSERT INTO empleados VALUES(6, '38382980M', 'María', 'Santana', 'Moreno', 1);
INSERT INTO empleados VALUES(7, '80576669X', 'Pilar', 'Ruiz', NULL, 2);
INSERT INTO empleados VALUES(8, '71651431Z', 'Pepe', 'Ruiz', 'Santana', 3);
INSERT INTO empleados VALUES(9, '56399183D', 'Juan', 'Gómez', 'López', 2);
INSERT INTO empleados VALUES(10, '46384486H', 'Diego','Flores', 'Salas', 5);
INSERT INTO empleados VALUES(11, '67389283A', 'Marta','Herrera', 'Gil', 1);
INSERT INTO empleados VALUES(12, '41234836R', 'Irene','Salas', 'Flores', NULL);
INSERT INTO empleados VALUES(13, '82635162B', 'Juan Antonio','Sáez', 'Guerrero', NULL);
INSERT INTO empleados VALUES(13, '82635162B', 'Juan Antonio','Sáez', 'Guerrero', NULL);
INSERT INTO empleados VALUES(13, '82635162B', 'Juan Antonio','Sáez', 'Guerrero', NULL);

show tables;