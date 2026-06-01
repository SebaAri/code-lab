create database Colegio;
use Colegio;
create table ALUMNO(
					N_matricula int auto_increment,
                    Nombre varchar (30),
                    FechaNacimiento date,
                    Telefono int,
                    primary key (N_matricula)
                    );
create table PROFESOR(
					  id_P int auto_increment,
					  Nombre varchar (30),
                      Especialidad varchar (60),
                      Telefono int,
					  primary key (id_P)
                       );                    
create table ASIGNATURA(
					    Codigo_asignatura int auto_increment,
                        id_P1 int ,
						Nombre varchar (30),
					    primary key (Codigo_asignatura),
					    foreign key (id_P1) references PROFESOR (id_P)
                        );

create table ALUMNO_VS_ASIGNATURA( 
								 id int auto_increment,
								 N_Matricula1 int,
                                 Codigo_asignatura1 int,
                                 primary key (id),
								 foreign key (N_Matricula1) references ALUMNO(N_Matricula),
								 foreign key (Codigo_asignatura1) references ASIGNATURA(Codigo_asignatura)
                                  );
-- la insercion de datos de la tabla alumno es realizada con el siguiente procedimiento almacenado:                               
call Pa_Insertardatos('Patricia Carro', '1991-05-25',4113327);
call MostrarTalumno;   
-- la insercion de datos de la tabla profesor es realizada con el siguiente procedimiento almacenado:
call Pa_InsertarProfes('Teresa Miner', 'Religion', 4779080);                                 
call Pa_MostrarProfes;
-- la insercion de datos de la tabla asignatura es realizada con el siguiente procedimiento almacenado:
call InsertarAsignatu ('Biologia');
call MostrarNomAsig;
select * from alumno_vs_asignatura;
select count( * ) as registros from alumno;
-- la insercion de datos de la tabla alumno_vs_asignatura es realizada con el siguiente procedimiento almacenado:
call MostrarAlumVsAsig;
call InsertarAlumVsAsig(1,2);
select alu.Nombre as Alumno, asig.Nombre as Asignatura, prof.Nombre as Profesor from alumno as alu inner join alumno_vs_asignatura as aluasig
on alu.N_matricula = aluasig.N_Matricula1
inner join asignatura as asig on aluasig.Codigo_asignatura1 = asig.Codigo_asignatura
inner join profesor as prof on asig.id_P1 = prof.id_P;

 


	   




 


    