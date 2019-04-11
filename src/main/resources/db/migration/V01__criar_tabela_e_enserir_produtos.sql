CREATE TABLE produto(
  id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  quantidade DECIMAL(10,2) NOT NULL,
  valor DECIMAL(10,2) NOT NULL

)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO produto(nome, quantidade, valor) values('Ar-Condicionado', 2, 2100.56);
INSERT INTO produto(nome, quantidade, valor) values('Smart Tv', 3, 3541.51);
INSERT INTO produto(nome, quantidade, valor) values('Onix',  1, 51214.51);