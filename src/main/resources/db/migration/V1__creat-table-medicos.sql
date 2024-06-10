create table medico(

id bignit not null auto_increment,
nome varchar(100) not null,
email varchar(100) not null unique,
crm varchar(100) not null unique,
especialiadade varchar(100) not null ,
logradouro varchar(100) not null ,
bairro varchar(100) not null ,
cpe varchar(9) not null ,
complento varchar(20),
uf varchar(20) not null,
cidade varchar(100) not null,

primary key(id)

);