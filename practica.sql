CREATE TABLE `Estado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `fronteras` int(15) NOT NULL,
  `clima` varchar(45) NOT NULL,
  `poblacion` int(10) NOT NULL,

  PRIMARY KEY (`id`)
 ) ;

INSERT INTO `estado` VALUES (1,'Puntarenas',2,'soleado',100000);
INSERT INTO `estado` VALUES (2,'Limon',1,'humedo',47000);
INSERT INTO `estado` VALUES (3,'Guanacaste',3,'tropical',47000);
INSERT INTO `estado` VALUES (4,'Panama',10,'Soleado',8000000);
INSERT INTO `estado` VALUES (5,'Nicaragua',8,'Ventoso',4000000);

CREATE USER 'usuario_practica'@'localhost' IDENTIFIED BY 'la_Clave';
