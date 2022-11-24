create database LojaCristal;

use LojaCristal;

create table Cliente(
	cod_cliente int primary key auto_increment,
    nome varchar(40) not null,
    cpf varchar(11) unique not null,
    dataNasc date not null,
    sexo int not null,
    statusCivil int not null,
    email varchar(40) not null,
    celular varchar(13) not null,
    endereco varchar(40) not null,
    cep int not null,
    nro_casa varchar(10) not null
);
create table Produto(
	cod_produto int primary key auto_increment,
    descricao varchar(25) not null,
    cor varchar(10) not null,
    tamanho int not null,
    valor double not null,
    quantidade int not null,
    fornecedor varchar(15) not null    
);

create table Venda(
	cod_Venda int primary key auto_increment,
    valorTotal double not null,
    dataVenda date not null,
    cod_Cliente int not null,
    cod_Vendedor int not null,
    tipoPagamento int not null,
	foreign key(cod_Cliente) references Cliente(cod_Cliente)
);

create table itemVenda(
	cod_ItemVenda int primary key auto_increment,
    cod_Venda int not null,
    cod_Produto int not null,
    quantidadeProduto int not null,
    valorUnitProduto double not null,
    foreign key(cod_Produto) references Produto(Cod_Produto),
    foreign key(cod_Venda) references Venda(cod_Venda)
);

#Insert na tabela Cliente
insert into cliente (nome, cpf, email, celular, endereco, dataNasc, nro_casa, cep, sexo, statusCivil)
			values('MICHAEL RICHARD KYLE', '85232809016', 'michaelkyle@senacsp.edu.br', '11911111111', 'Rua Estados Unidos', '1975-01-25',2,1427000,2,2),
				('SELENA GOMEZ', '68096015036', 'selenagomes@senacsp.edu.br', '11922222222', 'Rua Martins Fontes', '2000-07-20',1,01050000,1,1),
                ('LUCAS RANGEL', '90747263051', 'lucas@senacsp.edu.br', '11933333333', 'Rua Maravilha', '1995-10-13',73,02169090,3,3),
                ('ANA HICKMANN', '66327060021', 'hickmann@senacsp.edu.br', '11926353625', 'Rua Alcindo Guanabara', '1985-03-25',45,01111111,1,2),
				('GUSTAVO LIMA', '10234813083', 'g.lima@senacsp.edu.br', '11956322468', 'Rua Augusto Severo', '1989-10-14',43,01025010,1,1);

#Insert na tabela Produto
insert into produto  (cor, descricao, fornecedor, quantidade, tamanho, valor)
				values('Preto', 'Sapatilha Com Nó', 'GiGiL', 10, 35, 150),
					('Branco', 'Sapatilha', 'Modare', 15, 34, 130),
					('Verniz', 'Sandália Salto Grosso', 'Di Scarp', 20, 33, 199),
                    ('Branco', 'Sandália Salto Grosso Boneca Dina', 'Mirtz', 10, 35, 200),
					('Vermelho', 'Tênis Breaknet Floral', 'Adidas', 15, 36, 350),
					('Rosa', 'Tênis Runfalcon', 'Adidas', 20, 33, 365),
                    ('Branco', 'Tênis Grand Court Alpha', 'Adidas', 10, 35, 190),
					('Preto', 'Tênis Revolution', 'Nike', 15, 38, 160);

select *from produto;
#Insert na tabela Venda
insert into Venda(valorTotal, dataVenda, cod_Cliente, cod_Vendedor, tipoPagamento)
			value(529,'2022-11-20', 1, 3, 1),
				(280,'2022-11-21', 2, 2, 2),
				(914,'2022-11-22', 3, 1, 1),
				(830,'2022-11-22', 4, 4, 2),
				(150,'2022-11-23', 5, 1, 2);
#Insert na tabela ItemVenda
insert into itemVenda(cod_Venda, cod_Produto, quantidadeProduto, valorUnitProduto)
			value(1,2,2,130),
				(1,3,1,199),
				(1,4,1,200),
				(2,1,2,150),
                (2,2,3,130),
				(3,3,4,199),
                (3,5,1,350),
                (3,6,2,365),
				(4,2,1,130),
                (4,1,2,150),
                (4,4,2,200),
                (4,5,1,350),
				(5,1,2,150);
				