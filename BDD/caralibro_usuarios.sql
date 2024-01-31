-- MySQL dump 10.13  Distrib 8.0.32, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: caralibro
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuarios` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `sexo` varchar(1) NOT NULL,
  `activo` tinyint DEFAULT '1',
  `ciudad` varchar(45) DEFAULT NULL,
  `bloqueado` tinyint NOT NULL DEFAULT '0',
  `password` varchar(32) NOT NULL,
  `idRol` int NOT NULL,
  PRIMARY KEY (`idusuarios`),
  UNIQUE KEY `idusuarios_UNIQUE` (`idusuarios`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `idRol` (`idRol`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`idRol`) REFERENCES `Roles` (`idRoles`),
  CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`idRol`) REFERENCES `Roles` (`idRoles`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'user1@example.com','1990-01-01','John','Doe','M',1,'City1',0,'password1',0),(2,'user2@example.com','1995-05-15','Jane','Smith','F',1,'City2',0,'password2',0),(3,'user3@example.com','1988-12-10','Robert','Johnson','M',1,'City3',0,'password3',0),(4,'user4@example.com','1992-08-20','Alice','Williams','F',1,'City4',0,'password4',0),(10,'vayne@example.com','1992-08-20','Vayne','DIFF','F',1,'City4',0,'password4',2),(11,'user5@example.com','1993-04-25','Michael','Brown','M',1,'City5',0,'password5',0),(12,'user6@example.com','1991-07-12','Emily','Jones','F',1,'City6',0,'password6',0),(13,'user7@example.com','1987-09-08','Daniel','Miller','M',1,'City7',0,'password7',0),(14,'user8@example.com','1994-02-18','Olivia','Davis','F',1,'City8',0,'password8',0),(15,'user9@example.com','1985-11-30','Andrew','Garcia','M',1,'City9',0,'password9',0),(16,'user10@example.com','1996-06-03','Sophia','Martinez','F',1,'City10',0,'password10',0),(17,'user11@example.com','1990-03-14','Ethan','Anderson','M',1,'City11',0,'password11',0),(18,'user12@example.com','1989-10-22','Isabella','Wilson','F',1,'City12',0,'password12',0),(19,'user13@example.com','1997-01-07','Matthew','Taylor','M',1,'City13',0,'password13',0),(20,'user14@example.com','1986-08-11','Ava','Moore','F',1,'City14',0,'password14',0),(21,'user15@example.com','1998-04-29','Christopher','Thomas','M',1,'City15',0,'password15',0),(22,'user16@example.com','1992-09-16','Emma','Hernandez','F',1,'City16',0,'password16',0),(23,'user17@example.com','1984-12-04','Nicholas','Perez','M',1,'City17',0,'password17',0),(24,'user18@example.com','1993-05-20','Mia','Jackson','F',1,'City18',0,'password18',0),(25,'user19@example.com','1991-02-10','Alexander','White','M',1,'City19',0,'password19',0),(26,'user20@example.com','1988-07-01','Grace','Martin','F',1,'City20',0,'password20',0),(27,'user21@example.com','1994-10-12','Ryan','Allen','M',1,'City21',0,'password21',0),(28,'user22@example.com','1989-03-25','Lily','Young','F',1,'City22',0,'password22',0),(29,'user23@example.com','1996-08-08','James','Wright','M',1,'City23',0,'password23',0),(30,'user24@example.com','1986-01-15','Chloe','Lee','F',1,'City24',0,'password24',0);
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

-- Dump completed on 2024-01-24 18:27:17
