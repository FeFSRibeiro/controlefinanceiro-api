create table receitas(
id int auto_increment primary key,
descricao varchar(100),
valor decimal(10,2),
data date
);

create table despesas(
id int auto_increment primary key,
descricao varchar(100),
valor decimal(10,2),
data date
);