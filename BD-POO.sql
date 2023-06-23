#Projeto BD e POO - Ana Júlia Pinto 401 e Luís Eduardo M. Carvalho 331

#criando o banco de dados do projeto
create database bancopoo;

#definindo o bancopo como padrão
use bancopoo;

#criando a tabela usuario
create table if not exists usuario (
  idusuario int not null auto_increment,
  nome varchar(45) null,
  email varchar(45) null,
  primary key (idusuario) 
  );
  
  #criando a tabela perfil
  create table if not exists perfil(
	idperfil int not null auto_increment,
    generofavorito varchar(45) null,
    usuario_idusuario int not null,
    primary key (idperfil, usuario_idusuario),
    index fk_perfil_usuario_idx (usuario_idusuario asc) visible,
    constraint fk_perfil_usuario
		foreign key(usuario_idusuario)
        references usuario (idusuario)
        on delete cascade
        on update cascade
  );
  
  #criando a tabela filme
  create table if not exists filme(
	idfilme int not null auto_increment,
    titulo varchar(45) null,
    ano varchar(45) null,
    duracao float null,
    primary key(idfilme)
  );
  
  #criando a tabela avaliação
  create table if not exists avaliacao(
	idavaliacao int not null auto_increment,
    pontuacao varchar(45) null,
    comentario varchar(45) null,
    filme_idfilme int not null,
    usuario_idusuario int not null,
    primary key(idavaliacao, filme_idfilme, usuario_idusuario),
    index fx_avaliacao_filme1_idx (filme_idfilme asc) visible,
    index fx_avaliacao_usuario1_idx (usuario_idusuario asc) visible,
    constraint fk_avaliacao_filme1
		foreign key(filme_idfilme)
        references filme(idfilme)
        on delete no action
        on update no action,
    constraint fk_avaliacao_usuario1
		foreign key(usuario_idusuario)
        references usuario(idusuario)
        on delete no action
        on update no action
  );
  
  #criando a tabela categoria
  create table if not exists categoria(
	idcategoria int not null auto_increment,
    nome varchar(45),
    primary key(idcategoria)
 );
 
 #criando a tabela filme_has_categoria
 create table if not exists filme_has_categoria(
	filme_idfilme int not null,
    categoria_idcategoria int not null,
    primary key(filme_idfilme, categoria_idcategoria),
    index fk_filme_has_categoria_categoria1_idx (categoria_idcategoria asc) visible,
    index fk_filme_has_categoria_filme1_idx (filme_idfilme asc) visible,
    constraint fk_filme_has_categoria_filme1
		foreign key(filme_idfilme)
        references filme(idfilme)
        on delete no action
        on update no action,
   constraint fk_filme_has_categoria_categoria1avaliacao
		foreign key(categoria_idcategoria)
        references categoria (idcategoria)
        on delete cascade
        on update cascade
 );
 
