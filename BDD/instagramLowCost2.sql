CREATE DATABASE  IF NOT EXISTS `instagram_low_cost` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;
USE `instagram_low_cost`;
-- MySQL dump 10.13  Distrib 8.0.36, for Linux (x86_64)
--
-- Host: localhost    Database: instagram_low_cost
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `comentarios`
--

DROP TABLE IF EXISTS `comentarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comentarios` (
  `idComentario` int(11) NOT NULL AUTO_INCREMENT,
  `comentario` varchar(256) NOT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  `fechaCreacion` timestamp NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`idComentario`),
  KEY `fk_comentarios_usuarios` (`idUsuario`),
  CONSTRAINT `fk_comentarios_usuarios` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentarios`
--

LOCK TABLES `comentarios` WRITE;
/*!40000 ALTER TABLE `comentarios` DISABLE KEYS */;
INSERT INTO `comentarios` VALUES (6,'¡Qué foto más bonita!',4,'2024-01-20 11:00:00'),(7,'Me encanta la comida de ese restaurante.',11,'2024-01-21 12:00:00'),(8,'¡Qué vista tan espectacular!',10,'2024-01-22 13:00:00'),(9,'Me gusta mucho el estilo de esa pintura.',4,'2024-01-23 14:00:00'),(10,'¡Qué concierto más divertido!',5,'2024-01-24 15:00:00');
/*!40000 ALTER TABLE `comentarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentariosFotos`
--

DROP TABLE IF EXISTS `comentariosFotos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comentariosFotos` (
  `idComentarioFoto` int(11) NOT NULL AUTO_INCREMENT,
  `idComentario` int(11) NOT NULL,
  `idFoto` int(11) NOT NULL,
  PRIMARY KEY (`idComentarioFoto`),
  KEY `fk_comentariosFotos_fotos` (`idFoto`),
  KEY `fk_comentariosFotos_comentarios` (`idComentario`),
  CONSTRAINT `fk_comentariosFotos_comentarios` FOREIGN KEY (`idComentario`) REFERENCES `comentarios` (`idComentario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_comentariosFotos_fotos` FOREIGN KEY (`idFoto`) REFERENCES `fotos` (`idFoto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentariosFotos`
--

LOCK TABLES `comentariosFotos` WRITE;
/*!40000 ALTER TABLE `comentariosFotos` DISABLE KEYS */;
INSERT INTO `comentariosFotos` VALUES (6,6,6),(7,6,7),(8,6,8),(9,9,8),(10,8,10);
/*!40000 ALTER TABLE `comentariosFotos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fotos`
--

DROP TABLE IF EXISTS `fotos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fotos` (
  `idFoto` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(256) DEFAULT NULL,
  `url` varchar(150) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `fechaCreacion` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`idFoto`),
  KEY `fk_fotos_usuarios` (`idUsuario`),
  CONSTRAINT `fk_fotos_usuarios` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=175 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fotos`
--

LOCK TABLES `fotos` WRITE;
/*!40000 ALTER TABLE `fotos` DISABLE KEYS */;
INSERT INTO `fotos` VALUES (6,'Una foto de un atardecer en la playa','https://i.imgur.com/t1s42kY.jpg',6,'2024-01-19 23:00:00'),(7,'Una foto de un plato de comida deliciosa','https://i.imgur.com/a684Y6a.jpg',6,'2024-01-20 23:00:00'),(8,'Una foto de una montaña nevada','https://i.imgur.com/15X1u7Y.jpg',11,'2024-01-21 23:00:00'),(9,'Una foto de una pintura abstracta','https://i.imgur.com/4v31516.jpg',4,'2024-01-22 23:00:00'),(10,'Una foto de un concierto de música rock','https://i.imgur.com/1234567890.jpg',5,'2024-01-23 23:00:00'),(11,'Paisaje Montañoso','https://ejemplo.com/foto1.jpg',4,'2024-01-26 12:49:06'),(12,'Atardecer en la Playa','https://ejemplo.com/foto2.jpg',11,'2024-01-26 12:49:06'),(13,'Ciudad Nocturna','https://ejemplo.com/foto3.jpg',12,'2024-01-26 12:49:06'),(14,'Retrato en Blanco y Negro','https://ejemplo.com/foto4.jpg',13,'2024-01-26 12:49:06'),(15,'Aventura en la Naturaleza','https://ejemplo.com/foto5.jpg',16,'2024-01-26 12:49:06'),(16,'Arquitectura Moderna','https://ejemplo.com/foto6.jpg',19,'2024-01-26 12:49:06'),(17,'Explorando el Bosque','https://ejemplo.com/foto7.jpg',21,'2024-01-26 12:49:06'),(18,'Urbanismo Creativo','https://ejemplo.com/foto8.jpg',24,'2024-01-26 12:49:06'),(19,'Momentos de Reflexión','https://ejemplo.com/foto9.jpg',27,'2024-01-26 12:49:06'),(20,'Detalles de la Ciudad','https://ejemplo.com/foto10.jpg',60,'2024-01-26 12:49:06'),(21,'Amanecer en la Ciudad','https://ejemplo.com/foto11.jpg',5,'2024-01-26 12:49:39'),(22,'Esculturas en el Parque','https://ejemplo.com/foto12.jpg',6,'2024-01-26 12:49:39'),(23,'Viaje en Tren','https://ejemplo.com/foto13.jpg',14,'2024-01-26 12:49:39'),(24,'Sesión de Retratos Artísticos','https://ejemplo.com/foto14.jpg',17,'2024-01-26 12:49:39'),(25,'Aurora Boreal','https://ejemplo.com/foto15.jpg',20,'2024-01-26 12:49:39'),(26,'Grafitis Urbanos','https://ejemplo.com/foto16.jpg',22,'2024-01-26 12:49:39'),(27,'Flor en Macro','https://ejemplo.com/foto17.jpg',25,'2024-01-26 12:49:39'),(28,'Concierto en Vivo','https://ejemplo.com/foto18.jpg',28,'2024-01-26 12:49:39'),(29,'Caminata por el Bosque','https://ejemplo.com/foto19.jpg',32,'2024-01-26 12:49:39'),(30,'Reflejos en el Agua','https://ejemplo.com/foto20.jpg',35,'2024-01-26 12:49:39'),(31,'Cielo Estrellado','https://ejemplo.com/foto21.jpg',38,'2024-01-26 12:49:39'),(32,'Reunión Familiar','https://ejemplo.com/foto22.jpg',41,'2024-01-26 12:49:39'),(33,'Rincones Históricos','https://ejemplo.com/foto23.jpg',44,'2024-01-26 12:49:39'),(34,'Ilustración en la Arena','https://ejemplo.com/foto24.jpg',47,'2024-01-26 12:49:39'),(35,'Explosión de Colores','https://ejemplo.com/foto25.jpg',50,'2024-01-26 12:49:39'),(36,'Instante de Felicidad','https://ejemplo.com/foto26.jpg',53,'2024-01-26 12:49:39'),(37,'Vista desde las Alturas','https://ejemplo.com/foto27.jpg',56,'2024-01-26 12:49:39'),(38,'Atardecer en el Desierto','https://ejemplo.com/foto28.jpg',59,'2024-01-26 12:49:39'),(39,'Caminando en la Playa','https://ejemplo.com/foto29.jpg',10,'2024-01-26 12:50:10'),(40,'Arquitectura Antigua','https://ejemplo.com/foto30.jpg',15,'2024-01-26 12:50:10'),(41,'Fiesta en la Ciudad','https://ejemplo.com/foto31.jpg',18,'2024-01-26 12:50:10'),(42,'Refugio en la Montaña','https://ejemplo.com/foto32.jpg',23,'2024-01-26 12:50:10'),(43,'Atracciones en el Parque de Diversiones','https://ejemplo.com/foto33.jpg',26,'2024-01-26 12:50:10'),(44,'Desfile de Moda','https://ejemplo.com/foto34.jpg',29,'2024-01-26 12:50:10'),(45,'Exploración Submarina','https://ejemplo.com/foto35.jpg',33,'2024-01-26 12:50:10'),(46,'Jardín de Esculturas','https://ejemplo.com/foto36.jpg',36,'2024-01-26 12:50:10'),(47,'Retrato en Blanco y Negro','https://ejemplo.com/foto37.jpg',39,'2024-01-26 12:50:10'),(48,'Festival de Luces','https://ejemplo.com/foto38.jpg',42,'2024-01-26 12:50:10'),(49,'Cascada en la Selva','https://ejemplo.com/foto39.jpg',45,'2024-01-26 12:50:10'),(50,'Bicicleteada en la Ciudad','https://ejemplo.com/foto40.jpg',48,'2024-01-26 12:50:10'),(51,'Crepúsculo en el Desierto','https://ejemplo.com/foto41.jpg',51,'2024-01-26 12:50:10'),(52,'Diversión en el Parque Acuático','https://ejemplo.com/foto42.jpg',54,'2024-01-26 12:50:10'),(53,'Fuegos Artificiales en la Noche','https://ejemplo.com/foto43.jpg',57,'2024-01-26 12:50:10'),(54,'Concierto al Aire Libre','https://ejemplo.com/foto44.jpg',60,'2024-01-26 12:50:10'),(119,'Recorrido en Bicicleta','https://ejemplo.com/foto45.jpg',19,'2024-01-26 12:52:49'),(120,'Cena Romántica','https://ejemplo.com/foto46.jpg',16,'2024-01-26 12:52:49'),(121,'Cielo Estrellado en la Montaña','https://ejemplo.com/foto47.jpg',19,'2024-01-26 12:52:49'),(122,'Descanso en la Hamaca','https://ejemplo.com/foto48.jpg',24,'2024-01-26 12:52:49'),(123,'Viaje en Globo Aerostático','https://ejemplo.com/foto49.jpg',27,'2024-01-26 12:52:49'),(124,'Retrato Artístico en Blanco y Negro','https://ejemplo.com/foto50.jpg',30,'2024-01-26 12:52:49'),(125,'Festival de Cometas','https://ejemplo.com/foto51.jpg',35,'2024-01-26 12:52:49'),(126,'Aventura Subterránea','https://ejemplo.com/foto52.jpg',38,'2024-01-26 12:52:49'),(127,'Atardecer en la Playa Desierta','https://ejemplo.com/foto53.jpg',43,'2024-01-26 12:52:49'),(128,'Jornada de Picnic','https://ejemplo.com/foto54.jpg',46,'2024-01-26 12:52:49'),(129,'Explorando Ruinas Antiguas','https://ejemplo.com/foto55.jpg',49,'2024-01-26 12:52:49'),(130,'Festival de Colores','https://ejemplo.com/foto56.jpg',52,'2024-01-26 12:52:49'),(131,'Caminata en la Selva Tropical','https://ejemplo.com/foto57.jpg',55,'2024-01-26 12:52:49'),(132,'Instante de Serenidad','https://ejemplo.com/foto58.jpg',58,'2024-01-26 12:52:49'),(133,'Concierto Acústico','https://ejemplo.com/foto59.jpg',30,'2024-01-26 12:52:49'),(134,'Mirador en la Montaña','https://ejemplo.com/foto60.jpg',31,'2024-01-26 12:52:49'),(135,'Aventura en Kayak','https://ejemplo.com/foto61.jpg',11,'2024-01-26 12:54:08'),(136,'Rascacielos al Atardecer','https://ejemplo.com/foto62.jpg',45,'2024-01-26 12:54:08'),(137,'Fiesta en la Piscina','https://ejemplo.com/foto63.jpg',28,'2024-01-26 12:54:08'),(138,'Paseo en Globo al Amanecer','https://ejemplo.com/foto64.jpg',23,'2024-01-26 12:54:08'),(139,'Espectáculo de Luces en la Ciudad','https://ejemplo.com/foto65.jpg',26,'2024-01-26 12:54:08'),(140,'Esculturas de Hielo','https://ejemplo.com/foto66.jpg',29,'2024-01-26 12:54:08'),(141,'Senderismo en la Montaña','https://ejemplo.com/foto67.jpg',33,'2024-01-26 12:54:08'),(142,'Vista Panorámica de la Ciudad','https://ejemplo.com/foto68.jpg',36,'2024-01-26 12:54:08'),(143,'Retrato con Explosión de Colores','https://ejemplo.com/foto69.jpg',39,'2024-01-26 12:54:08'),(144,'Festival de Globos Aerostáticos','https://ejemplo.com/foto70.jpg',42,'2024-01-26 12:54:08'),(145,'Cascada Congelada','https://ejemplo.com/foto71.jpg',45,'2024-01-26 12:54:08'),(146,'Cena en la Azotea','https://ejemplo.com/foto72.jpg',48,'2024-01-26 12:54:08'),(147,'Reflejos en el Lago','https://ejemplo.com/foto73.jpg',51,'2024-01-26 12:54:08'),(148,'Retrato con Sombras y Luces','https://ejemplo.com/foto74.jpg',54,'2024-01-26 12:54:08'),(149,'Aventura en Paracaidismo','https://ejemplo.com/foto75.jpg',57,'2024-01-26 12:54:08'),(150,'Amanecer en la Montaña','https://ejemplo.com/foto76.jpg',60,'2024-01-26 12:54:08'),(151,'Aventura en Parapente','https://ejemplo.com/foto77.jpg',19,'2024-01-26 12:55:13'),(152,'Caminata en el Desierto','https://ejemplo.com/foto78.jpg',16,'2024-01-26 12:55:13'),(153,'Rincón Histórico de la Ciudad','https://ejemplo.com/foto79.jpg',19,'2024-01-26 12:55:13'),(154,'Descanso en la Hamaca','https://ejemplo.com/foto80.jpg',24,'2024-01-26 12:55:13'),(155,'Senderismo al Amanecer','https://ejemplo.com/foto81.jpg',27,'2024-01-26 12:55:13'),(156,'Sesión de Fotos en Estudio','https://ejemplo.com/foto82.jpg',30,'2024-01-26 12:55:13'),(157,'Esculturas de Arena','https://ejemplo.com/foto83.jpg',35,'2024-01-26 12:55:13'),(158,'Vista Nocturna desde el Rascacielos','https://ejemplo.com/foto84.jpg',38,'2024-01-26 12:55:13'),(159,'Retrato Artístico en Sepia','https://ejemplo.com/foto85.jpg',43,'2024-01-26 12:55:13'),(160,'Festival de Colores en el Cielo','https://ejemplo.com/foto86.jpg',46,'2024-01-26 12:55:13'),(161,'Exploración en Cuevas','https://ejemplo.com/foto87.jpg',49,'2024-01-26 12:55:13'),(162,'Picnic en el Jardín Botánico','https://ejemplo.com/foto88.jpg',52,'2024-01-26 12:55:13'),(163,'Reflejos en el Estanque','https://ejemplo.com/foto89.jpg',55,'2024-01-26 12:55:13'),(164,'Retrato con Efecto Bokeh','https://ejemplo.com/foto90.jpg',58,'2024-01-26 12:55:13'),(165,'Concierto de Jazz al Aire Libre','https://ejemplo.com/foto91.jpg',4,'2024-01-26 12:55:13'),(166,'Mirador al Anochecer','https://ejemplo.com/foto92.jpg',11,'2024-01-26 12:55:13'),(167,'Festival de Faroles','https://ejemplo.com/foto93.jpg',12,'2024-01-26 12:55:13'),(168,'Cena Romántica en la Playa','https://ejemplo.com/foto94.jpg',13,'2024-01-26 12:55:13'),(169,'Cosecha de Uvas en la Viña','https://ejemplo.com/foto95.jpg',16,'2024-01-26 12:55:13'),(170,'Retrato con Máscara de Carnaval','https://ejemplo.com/foto96.jpg',19,'2024-01-26 12:55:13'),(171,'Paseo en Barco al Atardecer','https://ejemplo.com/foto97.jpg',21,'2024-01-26 12:55:13'),(172,'Escena Invernal','https://ejemplo.com/foto98.jpg',24,'2024-01-26 12:55:13'),(173,'Retrato en la Feria','https://ejemplo.com/foto99.jpg',27,'2024-01-26 12:55:13'),(174,'Celebración de Cumpleaños','https://ejemplo.com/foto100.jpg',30,'2024-01-26 12:55:13');
/*!40000 ALTER TABLE `fotos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mensajes`
--

DROP TABLE IF EXISTS `mensajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mensajes` (
  `idMensaje` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuarioOrigen` int(11) NOT NULL,
  `idUsuarioDestino` int(11) NOT NULL,
  `mensaje` varchar(256) NOT NULL,
  `fechaCreacion` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`idMensaje`),
  KEY `fk_mensajes_usuariosDestino` (`idUsuarioDestino`),
  KEY `fk_mensajes_usuariosOrigen` (`idUsuarioOrigen`),
  CONSTRAINT `fk_mensajes_usuariosDestino` FOREIGN KEY (`idUsuarioDestino`) REFERENCES `usuarios` (`idUsuario`),
  CONSTRAINT `fk_mensajes_usuariosOrigen` FOREIGN KEY (`idUsuarioOrigen`) REFERENCES `usuarios` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensajes`
--

LOCK TABLES `mensajes` WRITE;
/*!40000 ALTER TABLE `mensajes` DISABLE KEYS */;
/*!40000 ALTER TABLE `mensajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reaccionesComentarios`
--

DROP TABLE IF EXISTS `reaccionesComentarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reaccionesComentarios` (
  `idComentario` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `idTipoReaccion` int(11) NOT NULL,
  PRIMARY KEY (`idComentario`,`idUsuario`),
  KEY `fk_reaccionesComentarios_usuarios` (`idUsuario`),
  KEY `fk_reaccionesComentarios_tiposReaccion` (`idTipoReaccion`),
  CONSTRAINT `fk_reaccionesComentarios_comentarios` FOREIGN KEY (`idComentario`) REFERENCES `comentarios` (`idComentario`),
  CONSTRAINT `fk_reaccionesComentarios_tiposReaccion` FOREIGN KEY (`idTipoReaccion`) REFERENCES `tiposReaccion` (`idTipoReaccion`),
  CONSTRAINT `fk_reaccionesComentarios_usuarios` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reaccionesComentarios`
--

LOCK TABLES `reaccionesComentarios` WRITE;
/*!40000 ALTER TABLE `reaccionesComentarios` DISABLE KEYS */;
INSERT INTO `reaccionesComentarios` VALUES (6,6,1),(7,6,2),(8,4,3),(9,4,4),(10,4,5);
/*!40000 ALTER TABLE `reaccionesComentarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reaccionesFotos`
--

DROP TABLE IF EXISTS `reaccionesFotos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reaccionesFotos` (
  `idFoto` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `idTipoReaccion` int(11) NOT NULL,
  PRIMARY KEY (`idFoto`,`idUsuario`),
  KEY `fk_reaccionesFotos_tiposReaccion` (`idTipoReaccion`),
  KEY `fk_reaccionesFotos_usuarios` (`idUsuario`),
  CONSTRAINT `fk_reaccionesFotos_fotos` FOREIGN KEY (`idFoto`) REFERENCES `fotos` (`idFoto`),
  CONSTRAINT `fk_reaccionesFotos_tiposReaccion` FOREIGN KEY (`idTipoReaccion`) REFERENCES `tiposReaccion` (`idTipoReaccion`),
  CONSTRAINT `fk_reaccionesFotos_usuarios` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reaccionesFotos`
--

LOCK TABLES `reaccionesFotos` WRITE;
/*!40000 ALTER TABLE `reaccionesFotos` DISABLE KEYS */;
INSERT INTO `reaccionesFotos` VALUES (6,4,1),(7,4,2),(8,6,3),(6,11,4),(7,11,5);
/*!40000 ALTER TABLE `reaccionesFotos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `idRol` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`idRol`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'Usuario'),(2,'Invitado'),(3,'Administrador');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiposReaccion`
--

DROP TABLE IF EXISTS `tiposReaccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tiposReaccion` (
  `idTipoReaccion` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) NOT NULL,
  `urlIcono` varchar(150) NOT NULL,
  PRIMARY KEY (`idTipoReaccion`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiposReaccion`
--

LOCK TABLES `tiposReaccion` WRITE;
/*!40000 ALTER TABLE `tiposReaccion` DISABLE KEYS */;
INSERT INTO `tiposReaccion` VALUES (1,'Me gusta','https://i.imgur.com/34567890.png'),(2,'Me encanta','https://i.imgur.com/1234567891.png'),(3,'Me divierte','https://i.imgur.com/9012345678.png'),(4,'Me sorprende','https://i.imgur.com/7890123456.png'),(5,'Me entristece','https://i.imgur.com/5678901234.png');
/*!40000 ALTER TABLE `tiposReaccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `presentacion` varchar(256) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `fechaAlta` timestamp NOT NULL DEFAULT current_timestamp(),
  `password` varchar(45) NOT NULL,
  `idRol` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fk_usuarios_roles` (`idRol`),
  CONSTRAINT `fk_usuarios_roles` FOREIGN KEY (`idRol`) REFERENCES `roles` (`idRol`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (4,'Juan Pérez','Soy un fotógrafo amateur que busca compartir mis mejores imágenes con el mundo.','juanperez@gmail.com','1990-10-04','2024-01-24 12:00:00','contraseña',1),(5,'María López','Me apasiona la moda y me gusta compartir mis looks con mis seguidores.','marialopez@hotmail.com','1992-08-12','2024-01-24 12:00:00','contraseña',2),(6,'Pedro González','Amante de los viajes y las aventuras. Comparto mis experiencias y fotos con todos ustedes.','pedrogonzalez@yahoo.com','1988-06-01','2024-01-24 15:00:00','contraseña',2),(10,'Carmen García','Soy una artista que utiliza Instagram para compartir mis obras con el mundo.','carmengarcia@live.com','1994-02-20','2024-01-24 12:00:00','contraseña',3),(11,'Luis Fernández','Me gusta la música y me encanta compartir mis canciones favoritas con mis seguidores.','luisfernandez@msn.com','1996-04-03','2024-01-24 12:00:00','contraseña',1),(12,'Ana Rodríguez','Soy una persona creativa que utiliza Instagram para compartir mis ideas con el mundo.','anarodriguez@outlook.com','1998-06-15','2024-01-24 12:00:00','contraseña',1),(13,'Usuario1','Presentación 1','usuario1@email.com','1990-01-01','2024-01-26 12:42:22','password1',1),(14,'Usuario2','Presentación 2','usuario2@email.com','1991-02-02','2024-01-26 12:42:22','password2',2),(15,'Usuario30','Presentación 30','usuario30@email.com','2000-12-30','2024-01-26 12:42:22','password30',3),(16,'Usuario4','Presentación 4','usuario4@email.com','1993-04-04','2024-01-26 12:42:22','password4',1),(17,'Usuario5','Presentación 5','usuario5@email.com','1994-05-05','2024-01-26 12:42:22','password5',2),(18,'Usuario28','Presentación 28','usuario28@email.com','2022-01-26','2024-01-26 12:42:22','password28',3),(19,'Usuario29','Presentación 29','usuario29@email.com','1999-11-29','2024-01-26 12:42:22','password29',1),(20,'Usuario30','Presentación 30','usuario30@email.com','2000-12-30','2024-01-26 12:42:22','password30',2),(21,'ArtistaCreativo1','¡Explorando el mundo a través de mis pinceles!','arte.creativo@email.com','1985-04-20','2024-01-26 12:43:34','creatividad123',1),(22,'AventureroDreamer','Descubriendo nuevos horizontes y contando historias','aventura.sueños@email.com','1990-08-15','2024-01-26 12:43:34','dreamer567',2),(23,'CreadorDeMelodias','Transformando emociones en notas musicales','musica.creator@email.com','1988-11-03','2024-01-26 12:43:34','melodia789',3),(24,'EscritorImaginativo','Tejiendo mundos con palabras e imaginación','escritor.imaginativo@email.com','1992-06-28','2024-01-26 12:43:34','imaginacion456',1),(25,'ViajeroGalactico','Explorando planetas lejanos y documentando el cosmos','cosmic.traveler@email.com','1986-02-10','2024-01-26 12:43:34','galaxy123',2),(26,'InventorDeSabores','Creando experiencias culinarias únicas','sabores.inventor@email.com','1995-09-17','2024-01-26 12:43:34','sabores456',3),(27,'ArquitectoDeSueños','Diseñando edificaciones que despiertan la fantasía','dream.architect@email.com','1984-07-22','2024-01-26 12:43:34','dreams789',1),(28,'InvestigadorDeMisterios','Desvelando secretos ocultos en las sombras','mystery.investigator@email.com','1991-12-07','2024-01-26 12:43:34','mystery123',2),(29,'FotografoDeEmociones','Capturando momentos que cuentan historias','photo.emotions@email.com','1987-03-14','2024-01-26 12:43:34','emotion456',3),(30,'AmanteDeLaNaturaleza','Conectando con la tierra y su belleza eterna','nature.lover@email.com','1993-05-25','2024-01-26 12:43:34','nature789',1),(31,'Maria Rodriguez','Apasionada por descubrir nuevos sabores en la cocina','maria.rodriguez@email.com','1988-05-12','2024-01-26 12:44:44','sabores123',1),(32,'Carlos Mendoza','Explorador de sueños y cuentacuentos en la vida real','carlos.mendoza@email.com','1995-11-23','2024-01-26 12:44:44','dreamer456',2),(33,'Laura Fernandez','Tejiendo historias mágicas con cada palabra escrita','laura.fernandez@email.com','1982-09-08','2024-01-26 12:44:44','magia789',3),(34,'Alejandro Gomez','Aventurero en busca de tesoros ocultos y experiencias únicas','alejandro.gomez@email.com','1984-07-31','2024-01-26 12:44:44','aventura123',1),(35,'Isabel Herrera','Melómana que encuentra la armonía en cada momento','isabel.herrera@email.com','1993-02-15','2024-01-26 12:44:44','melodia456',2),(36,'Javier Ramirez','Fotógrafo que captura la esencia y emoción en cada instantánea','javier.ramirez@email.com','1986-03-28','2024-01-26 12:44:44','emotion789',3),(37,'Ana Lopez','Apasionada por el arte y la arquitectura que cuenta historias','ana.lopez@email.com','1998-12-05','2024-01-26 12:44:44','stories123',1),(38,'Gabriel Torres','Investigador curioso de lo desconocido en la vida cotidiana','gabriel.torres@email.com','1980-10-18','2024-01-26 12:44:44','mystery456',2),(39,'Carmen Sanchez','Amante de la naturaleza que encuentra paz en el aire fresco','carmen.sanchez@email.com','1991-06-22','2024-01-26 12:44:44','nature789',3),(40,'Daniel Molina','Ingeniero de sabores que transforma ingredientes en experiencias','daniel.molina@email.com','1989-08-07','2024-01-26 12:44:44','sabores123',1),(41,'Julia Ramos','Exploradora de arte urbano y expresiones culturales','julia.ramos@email.com','1997-04-14','2024-01-26 12:45:23','urbanart123',2),(42,'Ricardo Vargas','Aventurero gastronómico en búsqueda de sabores únicos','ricardo.vargas@email.com','1983-08-30','2024-01-26 12:45:23','sabores456',3),(43,'Claudia Diaz','Narradora de cuentos que transporta a mundos imaginarios','claudia.diaz@email.com','1990-11-17','2024-01-26 12:45:23','imagination789',1),(44,'Juan Martinez','Melómano que encuentra el ritmo de la vida en cada canción','juan.martinez@email.com','1986-07-02','2024-01-26 12:45:23','music123',2),(45,'Sofia Castro','Fotógrafa de emociones, capturando momentos efímeros','sofia.castro@email.com','1992-02-28','2024-01-26 12:45:23','emotion456',3),(46,'Diego Ortega','Constructor de sueños arquitectónicos y realidades estéticas','diego.ortega@email.com','1984-05-19','2024-01-26 12:45:23','dreamarchitect789',1),(47,'Camila Navarro','Detective de misterios cotidianos y enigmas de la vida','camila.navarro@email.com','1996-10-07','2024-01-26 12:45:23','mysterysolver123',2),(48,'Andres Rodriguez','Amante de la naturaleza y observador de la vida silvestre','andres.rodriguez@email.com','1988-12-12','2024-01-26 12:45:23','naturelover456',3),(49,'Valentina Paredes','Poeta culinaria, fusionando sabores en versos gastronómicos','valentina.paredes@email.com','1993-06-26','2024-01-26 12:45:23','poeticflavors789',1),(50,'Miguel Mora','Viajero cósmico explorando las maravillas del universo','miguel.mora@email.com','1981-03-15','2024-01-26 12:45:23','cosmictraveler123',2),(51,'Elena Gutierrez','Exploradora de la mente humana y sus laberintos','elena.gutierrez@email.com','1989-08-04','2024-01-26 12:46:07','mindexplorer123',3),(52,'Roberto Soto','Aventurero digital en busca de experiencias cibernéticas','roberto.soto@email.com','1995-02-20','2024-01-26 12:46:07','cyberadventures456',1),(53,'Ana Maria Vega','Contadora de historias que transforma la realidad en fantasía','ana.vega@email.com','1987-06-10','2024-01-26 12:46:07','fantasytales789',2),(54,'Adrian Silva','Melómano nocturno que encuentra la magia en la música oscura','adrian.silva@email.com','1980-11-27','2024-01-26 12:46:07','darkmusic123',3),(55,'Luisa Montes','Fotógrafa de la vida cotidiana, buscando belleza en lo común','luisa.montes@email.com','1991-03-15','2024-01-26 12:46:07','commonbeauty456',1),(56,'Francisco Herrera','Arquitecto de sueños utópicos y construcciones imaginarias','francisco.herrera@email.com','1983-09-28','2024-01-26 12:46:07','utopiandreams789',2),(57,'Marina Guzman','Investigadora de misterios culinarios y secretos de la cocina','marina.guzman@email.com','1996-05-07','2024-01-26 12:46:07','culinarymysteries123',3),(58,'Jorge Ramos','Amante de la naturaleza que colecciona sonrisas de animales','jorge.ramos@email.com','1982-12-22','2024-01-26 12:46:07','animallover456',1),(59,'Gabriela Paredes','Poeta gastronómica que transforma ingredientes en versos deliciosos','gabriela.paredes@email.com','1994-01-18','2024-01-26 12:46:07','poeticflavors789',2),(60,'Sebastian Molina','Viajero en el tiempo buscando historias olvidadas','sebastian.molina@email.com','1988-07-09','2024-01-26 12:46:07','timetraveler123',3);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-26 13:58:49
