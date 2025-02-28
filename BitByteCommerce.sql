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
('Padaria doce sabor','contato@padariadocesabor.com.br','54.321.098/0001-99','Pds@2025','(11)4021-5185','Rua dos Pinheiros 32 Vila Madalena','R$50.000,00');