create database if not exists BitByte_Commerce;
use BitByte_commerce;

select *  from empresas_cadastradas;
Create table Empresas_cadastradas(
empresa_id int auto_increment primary key,
Razão_social varchar(255)  not null unique,
Email_da_empresa varchar(320) not null unique  ,
CNPJ_da_empresa varchar(20) not null unique ,
Senha_da_empresa varchar(255) not null unique ,
Telefone_da_empresa varchar(15) not null,
Endereco_da_empresa varchar(255) not null,
Capital_social varchar(255)
);


select * from empresas_cadastradas;

drop table empresas_cadastradas;
insert into empresas_cadastradas(Razão_social,Email_da_empresa,CNPJ_da_empresa,Senha_da_empresa,Telefone_da_empresa,Endereco_da_empresa,Capital_Social)values
('Padaria doce sabor','contato@padariadocesabor.com.br','54.321.098/0001-99','Pds@2025','(11)4021-5185','Rua dos Pinheiros 32 Vila Madalena','R$50.000,00'),
('Marcenaria do seu zé','marcenariaseuze@gmail.com','43.455.123/0002-88','seuze#333','(11)4321-2121','Rua das Anandorinhas 42 Santo Amaro','R$40.000,00'),
('Mercadinho do Professor','contatodoprofessor@gmail.com','12.333.890/0001-90','doprofessor@2025','(11)5015-0876','Rua Estevão Guimarães 25 Água Funda','R$30.000,00'),
('Lanchonete dos 3 irmãos ','tresirmaos@gmail.com','19.425.900/0003-79','lanches3irmaos@2025','(11)4742-9090','Rua das Estrelas 43 Vila Maria','R$35.000,00'),
('Papelaria Lazer','papelaria@gmail.com.br','47.890.334/0002-90','Paplz2020','(21)5042-8597','Rua Liberdade 122 Tucuruvi','R$20.000,00');