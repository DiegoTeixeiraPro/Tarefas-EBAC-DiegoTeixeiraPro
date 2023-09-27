create table tb_cliente (
	id bigint,
	nome varchar(50) not null,
	cpf bigint not null,
	tel bigint not null,
	endereco varchar(50) not null,
	numero bigint not null,
	cidade varchar(50) not null,
	estado varchar(50) not null,
	email varchar(50) not null,
	constraint pk_id_cliente primary key(id)
);


create table tb_produto(
	id bigint,
	codigo varchar(10) not null,
	nome varchar(50) not null,
	descricao varchar(100) not null,
	valor numeric(10,2) not null,
	categoria varchar(100) not null,
	constraint pk_id_produto primary key(id)
);

create table tb_venda(
	id bigint,
	codigo varchar(10) not null,
	id_cliente_fk bigint not null,
	valor_total numeric(10,2) not null,
	data_venda TIMESTAMPTZ not null,
	status_venda varchar(50) not null,
	constraint pk_id_venda primary key(id),
	constraint fk_id_cliente_venda foreign key(id_cliente_fk) references tb_cliente(id)
);

create table tb_produto_quantidade(
	id bigint,
	id_produto_fk bigint not null,
	id_venda_fk bigint not null,
	quantidade int not null,
	valor_total numeric(10,2) not null,
	constraint pk_id_prod_venda primary key(id),
	constraint fk_id_prod_venda foreign key(id_produto_fk) references tb_produto(id),
	constraint fk_id_prod_venda_venda foreign key(id_venda_fk) references tb_venda(id)
);

create sequence sq_cliente
start 1
increment 1
owned by tb_cliente.id;

create sequence sq_produto
start 1
increment 1
owned by tb_produto.id;

create sequence sq_venda
start 1
increment 1
owned by tb_venda.id;

create sequence sq_produto_quantidade
start 1
increment 1
owned by tb_produto_quantidade.id;

ALTER TABLE TB_CLIENTE
ADD CONSTRAINT UK_CPF_CLIENTE UNIQUE (CPF);

ALTER TABLE TB_PRODUTO
ADD CONSTRAINT UK_CODIGO_PRODUTO UNIQUE (CODIGO);

ALTER TABLE TB_VENDA
ADD CONSTRAINT UK_CODIGO_VENDA UNIQUE (CODIGO);


SELECT * FROM tb_cliente;

SELECT * FROM tb_produto;