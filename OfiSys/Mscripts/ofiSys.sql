create database if not exists ofiSys;

use ofiSys;

drop table Veiculo;
select * from Veiculo;

create table if not exists Veiculo(
	id mediumint primary key not null auto_increment,	
	marca varchar(100) not null,
	modelo varchar(100) not null,
	ano int(4),
	placa varchar(7),
	km int (10)
);
