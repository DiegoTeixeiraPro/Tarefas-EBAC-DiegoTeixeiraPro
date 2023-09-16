
create table tb_cliente_2 (
	id bigint,
	codigo varchar(50) not null,
	nome varchar(50) not null,
	constraint pk_id_cliente_2 primary key(id)
);

create sequence sq_cliente_2
start 1
increment 1
owned by tb_cliente_2.id;


select * from tb_cliente_2;
select * from tb_cliente_2 where id = 1;

drop table tb_cliente_2;

INSERT INTO tb_cliente_2 (ID, CODIGO, NOME)
VALUES (2, '999999', 'Diego');





-- Aqui para baixo estarei implementando o Produto

create table tb_produto_2 (
	id bigint,
	codigo varchar(50) not null,
	nome varchar(50) not null,
	constraint pk_id_produto_2 primary key(id)
);


create sequence sq_produto_2
start 1
increment 1
owned by tb_produto_2.id;


select * from tb_produto_2;
select * from tb_produto_2 where id = 1;

drop table tb_produto_2;

INSERT INTO tb_produto_2 (ID, CODIGO, NOME)
VALUES (1, '999999', 'Notebook Dell');