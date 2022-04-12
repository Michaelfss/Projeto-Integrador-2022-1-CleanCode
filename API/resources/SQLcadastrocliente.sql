CREATE DATABASE Cadastro_cliente;
USE Cadastro_cliente;

CREATE TABLE cadastros
(
  
	id int unsigned not null auto_increment,
    razao_social varchar(50) not null,
    cnpj varchar (14) not null,
    endereco varchar(45) not null,
    numero varchar (45) not null,
    cep varchar(8) noT null,
    PRIMARY KEY (ID)
    
    


);


