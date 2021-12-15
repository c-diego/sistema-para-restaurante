CREATE TABLE `usuario` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `login` varchar(20) UNIQUE NOT NULL,
  `senha` varchar(20) NOT NULL,
  `permissao` int(1) NOT NULL
);

CREATE TABLE `prato` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `principal` varchar(100),
  `secundario` varchar(100),
  `carne` varchar(100),
  `salada` varchar(100),
  `acompanhamento` varchar(100),
  `preco` float NOT NULL
);

CREATE TABLE `cliente` (
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

CREATE TABLE `pedido` (
  `fk_prato` int PRIMARY KEY,
  `fk_cliente` int NOT NULL,
  `quantidade` int NOT NULL,
  `preco` float NOT NULL,
  `numero` int NOT NULL
);

ALTER TABLE `pedido` ADD FOREIGN KEY (`fk_prato`) REFERENCES `prato` (`id`);

ALTER TABLE `pedido` ADD FOREIGN KEY (`fk_cliente`) REFERENCES `cliente` (`id`);
