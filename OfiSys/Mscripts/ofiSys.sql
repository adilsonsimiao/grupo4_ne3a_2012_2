create database aluno;

create database if not exists ofiSys;
drop database if exists ofiSys;

use ofiSys;	

drop table Veiculo;
drop table Cliente;
drop table Servico;

select * from Veiculo;
select * from Cliente;
select * from Servico;

describe Veiculo;
describe Cliente;
describe Servico;

create table if not exists Cliente(
	id mediumint primary key not null auto_increment,	
	nome varchar(100) not null
);

create table if not exists Veiculo(
	id mediumint primary key not null auto_increment,	
	marca varchar(100) not null,
	modelo varchar(100) not null,
	ano int(4),
	placa varchar(7),
	km int (10),
	proprietario_Id mediumint,
	foreign key(proprietario_ID) references Cliente(id)
);
