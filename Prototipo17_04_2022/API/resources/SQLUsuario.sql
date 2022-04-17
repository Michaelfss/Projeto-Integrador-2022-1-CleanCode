CREATE DATABASE Usuario;
USE Usuario;

CREATE TABLE Cadastro(

id int unsigned not null auto_increment,
usuario varchar(45) not null,
senha varchar(45) not null,
primary key(ID)

);

SELECT * from Cadastro;

insert into Cadastro (usuario,senha) values ('teste','1234');





