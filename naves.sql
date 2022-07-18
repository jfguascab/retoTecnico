-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: naves
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `agencia`
--

DROP TABLE IF EXISTS `agencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agencia` (
  `idAgencia` int NOT NULL AUTO_INCREMENT,
  `agencia` varchar(45) NOT NULL,
  PRIMARY KEY (`idAgencia`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agencia`
--

LOCK TABLES `agencia` WRITE;
/*!40000 ALTER TABLE `agencia` DISABLE KEYS */;
INSERT INTO `agencia` VALUES (1,'NASA_UEA'),(2,'ESA_Europea'),(3,'JAXA_JApon'),(4,'FKA_Rusia'),(5,'CSA_ASC_CAnada'),(6,'ASI_Italia'),(7,'CNES_Francia');
/*!40000 ALTER TABLE `agencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcion`
--

DROP TABLE IF EXISTS `funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcion` (
  `idFuncion` int NOT NULL AUTO_INCREMENT,
  `funcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idFuncion`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcion`
--

LOCK TABLES `funcion` WRITE;
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
INSERT INTO `funcion` VALUES (1,'Lanzar carga util'),(2,'Estudiar Cuerpos Celestes'),(3,'Investigacion'),(4,'Reparacion, Mantenimiento'),(5,'Comunicacion'),(6,'Observacion'),(7,'Navegacion'),(8,'Armas Espaciales');
/*!40000 ALTER TABLE `funcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nave`
--

DROP TABLE IF EXISTS `nave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nave` (
  `idNave` int NOT NULL AUTO_INCREMENT,
  `clave` varchar(10) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `pesoTonelada` double NOT NULL,
  `combustible` varchar(45) NOT NULL,
  `velocidadKmHora` double DEFAULT NULL,
  `potenciaHp` double DEFAULT NULL,
  `propulsionTonelada` double DEFAULT NULL,
  `cantidadPersona` int DEFAULT NULL,
  `orbitaKm` double DEFAULT NULL,
  `transportaTonelada` double DEFAULT NULL,
  `idTipo` int NOT NULL,
  `idAgencia` int NOT NULL,
  PRIMARY KEY (`idNave`),
  KEY `idAgencia_fk_idx` (`idAgencia`),
  KEY `idTipo_fk_idx` (`idTipo`),
  CONSTRAINT `idAgencia_fk` FOREIGN KEY (`idAgencia`) REFERENCES `agencia` (`idAgencia`),
  CONSTRAINT `idTipo_fk` FOREIGN KEY (`idTipo`) REFERENCES `tipo` (`idTipo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nave`
--

LOCK TABLES `nave` WRITE;
/*!40000 ALTER TABLE `nave` DISABLE KEYS */;
INSERT INTO `nave` VALUES (12,'004','Voyager',100,'Amh',1000,0,20,0,0,0,20,1),(14,'008','Sputnik',0.089,'Hidraxina',600,0,0,0,36000,0,41,2),(15,'007','Prospero',2,'Hidraxina',1000,0,0,0,3600,0,43,6),(17,'001','Protom',3600,'Quimico Liquido',0,32000,2900,0,0,188,20,2),(18,'002','Saturno V',3500,'Quimico Solido',0,32000,23,0,0,188,10,1),(19,'003','Atlas V',352,'Hidraxina',0,32000,2900,0,0,188,10,1),(20,'006','Hope X',352,'Quimico ',400,0.2,0,3,0,0,31,4),(22,'009','Explorer',2,'h',1,0,0,0,600,0,41,1),(23,'010','Vostok',0.08,'Hidraxina',600,200,0,3,0,0,30,4),(24,'011','Hermes',0.08,'Hidraxina',650,200,0,3,0,0,31,2),(26,'012','MRO',100,'Amh',1500,0,20,0,0,0,20,1),(27,'013','Haxa',100,'Amh',999,0,1,0,0,0,20,3),(28,'005','Osumi',0.089,'Hidraxina',600,0,0,0,36000,0,41,3);
/*!40000 ALTER TABLE `nave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo`
--

DROP TABLE IF EXISTS `tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo` (
  `idTipo` int NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `idFuncion` int DEFAULT NULL,
  PRIMARY KEY (`idTipo`),
  KEY `idFuncion_fk_idx` (`idFuncion`),
  CONSTRAINT `idFuncion_fk` FOREIGN KEY (`idFuncion`) REFERENCES `funcion` (`idFuncion`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo`
--

LOCK TABLES `tipo` WRITE;
/*!40000 ALTER TABLE `tipo` DISABLE KEYS */;
INSERT INTO `tipo` VALUES (10,'Lanzadera',1),(20,'Sondas',2),(30,'Tripuladas',3),(31,'Tripuladas',4),(40,'Satelite Artificial',5),(41,'Satelite Artificial',6),(42,'Satelite Artificial',7),(43,'Satelite Artificial',8);
/*!40000 ALTER TABLE `tipo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-18 13:56:54
