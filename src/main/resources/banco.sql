CREATE database `trabalhoFinal`;

CREATE TABLE `trabalhoFinal`.`usuario` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `login` varchar(20) UNIQUE NOT NULL,
  `senha` varchar(20) NOT NULL,
  `permissao` int(1) NOT NULL
);

CREATE TABLE `trabalhoFinal`.`prato` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `principal` varchar(100),
  `secundario` varchar(100),
  `carne` varchar(100),
  `salada` varchar(100),
  `acompanhamento` varchar(100),
  `preco` float NOT NULL,
  `status` boolean NOT NULL
);

CREATE TABLE `trabalhoFinal`.`cliente` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `sobrenome` varchar(100) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `estado` varchar(70) NOT NULL,
  `cidade` varchar(70) NOT NULL,
  `bairro` varchar(70) NOT NULL,
  `rua` varchar(70) NOT NULL,
  `numero` int NOT NULL,
  `qtnPedidos` int
);

CREATE TABLE `trabalhoFinal`.`pedido` (
  `fk_prato` int NOT NULL,
  `fk_cliente` int NOT NULL,
  `quantidade` int NOT NULL,
  `preco` float NOT NULL,
  `numero` int NOT NULL,
   primary key (`fk_prato`, `fk_cliente`, `numero`)
);

ALTER TABLE `trabalhoFinal`.`pedido` ADD FOREIGN KEY (`fk_prato`) REFERENCES `trabalhoFinal`.`prato` (`id`);
ALTER TABLE `trabalhoFinal`.`pedido` ADD FOREIGN KEY (`fk_cliente`) REFERENCES `trabalhoFinal`.`cliente` (`id`);

INSERT INTO `trabalhoFinal`.`usuario` VALUES (null, "ADM", "admin", "admin", 2);

