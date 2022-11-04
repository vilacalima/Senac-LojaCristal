create database LojaCristal;

use LojaCristal;
create table Cliente(
	cod_cliente int primary key auto_increment,
    nome varchar(40),
    cpf varchar(11) unique,
    dataNasc date,
    sexo int,
    statusCivil int,
    email varchar(40),
    celular varchar(13),
    endereco varchar(40),
    cep int,
    nro_casa varchar(10)
);
create table Produto(
	cod_produto int primary key auto_increment,
    descricao varchar(25),
    cor varchar(10),
    tamanho int,
    valor decimal,
    quantidade int,
    fornecedor varchar(15)    
);

select*from Cliente;
desc produto;

	
