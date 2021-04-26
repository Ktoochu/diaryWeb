-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: spring5fs
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `LOGINID` varchar(50) NOT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(100) NOT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `PHONE` varchar(15) DEFAULT NULL,
  `ADDR` varchar(100) DEFAULT NULL,
  `REGDATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `LOGINID_UNIQUE` (`LOGINID`),
  UNIQUE KEY `EMAIL` (`EMAIL`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'madvirus','madvirus@madvirus.net','1111','cbk',NULL,NULL,'2020-05-16 00:53:42'),(2,'guest','guest@gmail.com','aaa','Mr.Lee',NULL,NULL,'2020-05-23 00:12:00'),(4,'test','test@skuniv.ac.kr','1234','test','010-5555-1111','서울시','2020-06-11 00:02:00'),(5,'Jeong','test','1234','정테스트','010-7584-2563','부산','2020-06-11 00:02:15'),(6,'Kim','test3@daum.net','7852','김테스트','010-2828-3636','강원','2020-06-11 00:05:07'),(7,'Lee','Lee@naver.com','7851','이테스트','02-5721-5365','경북','2020-06-12 15:00:00'),(8,'web','alswls@naver.com','1111','jin','010-5755-6666','seoul','2020-06-26 14:28:07'),(9,'jin','alswls4390@naver.com','1111','jin','010-1111-1111','seoul','2020-06-26 14:34:29'),(10,'test7','test7@naver.com','1234','test','010-5555-7777','addr','2020-06-26 14:41:33');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-26 23:54:40
