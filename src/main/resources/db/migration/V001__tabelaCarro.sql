create table carro
    (id bigint not null auto_increment,
    nome varchar(255),
    descricao varchar(255),
    url_foto varchar(255),
    url_video varchar(255),
    tipo varchar(60), primary key (id) );