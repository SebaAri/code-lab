-- crear base de datos
create database prueba1;
-- para cambiar de contexto usamos:
use prueba2;
-- borrar base de datos 
drop database prueba1;
use prueba2;
select * from t_prueba where id_prueba = 2;
select peso from t_prueba;
select nombre, peso from t_prueba;
select * from t_prueba where fecha = '2022-01-04';
select * from t_prueba where nombre = 'pepito';
select * from t_prueba;
select * from t_prueba where peso between 60 and 80;
select * from t_prueba where fecha between '2018-03-01' and '2022-01-04';
select fecha from t_prueba where fecha between '2018-03-01' and '2022-01-04';
select * from t_prueba where nombre like 'p%';
select * from t_prueba;
select * from t_prueba where nombre like '%o';
select * from t_prueba where comentarios like '%amigo%';
select * from t_prueba where comentarios like '%mexico%';
select * from t_prueba where   fecha = '2022-01-06';
select * from t_prueba where fecha = '2022-01-04' and fecha = '2018-03-01';
select * from t_prueba where fecha = '2022-01-04' and peso = '55.5';
select * from t_prueba where nombre <> 'jose';
select * from t_prueba where comentarios <> '';
select * from t_prueba order by nombre desc;
select * from t_prueba order by nombre asc;
select * from t_prueba order by peso asc;
select * from t_prueba order by fecha asc;
select * from t_prueba group by comentarios;
update t_prueba set comentarios = 'hacia falta' where id_prueba = 1;
update t_prueba set fecha = '2022-01-05' where id_prueba = 3;
update t_prueba set comentarios = 'hola chavo', peso = 22 where id_prueba = 4;
describe t_prueba;
select * from t_prueba;
delete from t_prueba where id_prueba = 5;