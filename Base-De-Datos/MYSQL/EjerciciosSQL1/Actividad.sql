-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: colegio
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `N_matricula` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) DEFAULT NULL,
  `FechaNacimiento` date DEFAULT NULL,
  `Telefono` int DEFAULT NULL,
  PRIMARY KEY (`N_matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES (1,'Natalio Perez','1989-12-31',4231284),(2,'Martin Abad','1990-02-22',4514789),(3,'Esteban Juncal','1986-07-15',4664779),(4,'Mirta Otto','1988-04-16',4644379),(5,'Mario Tulio','1989-04-03',4123457),(6,'Monica Tuvez','1990-11-24',4393455),(7,'Mauricio Vasquez','1991-10-31',4553755),(8,'Max Nicco','1990-06-11',4542955),(9,'Natalia Mico','1988-07-20',4512922),(10,'Pamela Ver','1992-09-14',4577832),(11,'Jose Rodriguez','1991-10-16',4213362),(12,'Lara Martinez','1987-02-26',4244002),(13,'Luis Almiron','1989-08-29',4780002),(14,'Ezequiel Roma','1990-01-01',4530332),(15,'Marcelo Amira','1988-03-12',4669132),(16,'Marcela Pavon','1991-05-15',4449102),(17,'Cecilia Coronado','1993-05-27',4119162),(18,'Ricardo Gimenez','1989-11-25',4132662),(19,'Roberto Torres','1993-10-20',4998662),(20,'Yesica Thompson','1991-06-23',4914862),(21,'Rodrigo Vera','1989-01-13',4334462),(22,'Estefania Miranda','1987-09-25',4544110),(23,'Laura Martinez','1986-03-29',4799117),(24,'Dario Estrada','1984-04-11',4520717),(25,'Guillermo Estevanez','1996-10-10',4784719),(26,'Fransisco Sisco','1999-03-27',4660719),(27,'Juan Eraldo','1998-12-26',4086119),(28,'Mauro Perca','1999-08-23',4333127),(29,'Patricio Olivares','1989-06-13',4317927),(30,'Patricia Carro','1991-05-25',4113327);
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumno_vs_asignatura`
--

DROP TABLE IF EXISTS `alumno_vs_asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno_vs_asignatura` (
  `id` int NOT NULL AUTO_INCREMENT,
  `N_Matricula1` int DEFAULT NULL,
  `Codigo_asignatura1` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `N_Matricula1` (`N_Matricula1`),
  KEY `Codigo_asignatura1` (`Codigo_asignatura1`),
  CONSTRAINT `alumno_vs_asignatura_ibfk_1` FOREIGN KEY (`N_Matricula1`) REFERENCES `alumno` (`N_matricula`),
  CONSTRAINT `alumno_vs_asignatura_ibfk_2` FOREIGN KEY (`Codigo_asignatura1`) REFERENCES `asignatura` (`Codigo_asignatura`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno_vs_asignatura`
--

LOCK TABLES `alumno_vs_asignatura` WRITE;
/*!40000 ALTER TABLE `alumno_vs_asignatura` DISABLE KEYS */;
INSERT INTO `alumno_vs_asignatura` VALUES (1,30,1),(2,29,2),(3,28,3),(4,27,4),(5,26,5),(6,25,4),(7,24,3),(8,23,6),(9,22,7),(10,21,7),(11,20,1),(12,19,2),(13,18,3),(14,17,4),(15,16,5),(16,15,4),(17,14,6),(18,13,7),(19,12,1),(20,11,2),(21,10,3),(22,9,4),(23,8,5),(24,7,6),(25,6,7),(26,5,1),(27,4,2),(28,3,3),(29,2,1),(30,1,2);
/*!40000 ALTER TABLE `alumno_vs_asignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignatura`
--

DROP TABLE IF EXISTS `asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignatura` (
  `Codigo_asignatura` int NOT NULL AUTO_INCREMENT,
  `id_P1` int DEFAULT NULL,
  `Nombre` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`Codigo_asignatura`),
  KEY `id_P1` (`id_P1`),
  CONSTRAINT `asignatura_ibfk_1` FOREIGN KEY (`id_P1`) REFERENCES `profesor` (`id_P`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignatura`
--

LOCK TABLES `asignatura` WRITE;
/*!40000 ALTER TABLE `asignatura` DISABLE KEYS */;
INSERT INTO `asignatura` VALUES (1,7,'Religion'),(2,2,'Matematica'),(3,3,'Fisica'),(4,6,'Historia'),(5,4,'Lengua y Literatura'),(6,5,'Computacion'),(7,1,'Biologia');
/*!40000 ALTER TABLE `asignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesor` (
  `id_P` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) DEFAULT NULL,
  `Especialidad` varchar(60) DEFAULT NULL,
  `Telefono` int DEFAULT NULL,
  PRIMARY KEY (`id_P`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
INSERT INTO `profesor` VALUES (1,'Julio Todesca','Biologia',4882220),(2,'Nazareno Veira','Matematica',4664100),(3,'Ramiro Calo','Fisica',4112010),(4,'Federico Castillo','Lengua y Literatura',4820147),(5,'Esmeralda alda','Computacion',4449140),(6,'Luis Patron','Historia',4223680),(7,'Teresa Miner','Religion',4779080);
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-13 11:34:00
