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

create table Venda(
	cod_Venda int primary key auto_increment not null,
    numeroVenda int not null,
    valorTotal decimal not null,
    dataVenda date not null
);

create table itemVenda(
	cod_ItemVenda int primary key auto_increment not null,
    cod_Venda int not null,
    cod_Produto int not null,
    cod_Cliente int not null,
    valorUnitProduto decimal not null,
    quantidadeProduto int not null,
    foreign key(cod_Cliente) references Cliente(cod_Cliente),
    foreign key(cod_Produto) references Produto(Cod_Produto)
);

select nome, cod_cliente from cliente where cpf='11111111111';

select*from Cliente;
desc produto;
insert into cliente (nome, cpf, email, celular, endereco, dataNasc, nro_casa, cep, sexo, statusCivil)
			values('teste1', '11111111111', 'teste1@teste', '11911111111', 'teste1 teste', '2001-01-01',1,01111111,1,1),
				('teste2', '22222222222', 'teste2@teste', '11922222222', 'teste2 teste', '2001-01-01',2,0222222,2,2),
                ('teste3', '33333333333', 'teste3@teste', '11933333333', 'teste3 teste', '2001-01-01',3,03333333,3,3);

insert into produto  (cor, descricao, fornecedor, quantidade, tamanho, valor)
			values('branco', 'tenis', 'adidas', 10, 35, 100),
            ('preto', 'sapatenis', 'nike', 15, 32, 500),
            ('rosa', 'tenis', 'olimpcos', 20, 33, 600);

select 	cod_produto, descricao, cor, tamanho, valor from Produto where descricao='tenis';

"cod_produto"));
                    novoProduto.setDescricao(rs.getString("descricao"));
                    novoProduto.setCor(rs.getString("cor"));
                    novoProduto.setTamanho(rs.getInt("tamanho"));
                    novoProduto.setValor(rs.getDouble("valor"));
