-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.28-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para massalud
CREATE DATABASE IF NOT EXISTS `massalud` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `massalud`;

-- Volcando estructura para tabla massalud.afiliados
CREATE TABLE IF NOT EXISTS `afiliados` (
  `idAfiliado` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(50) NOT NULL DEFAULT '0',
  `nombre` varchar(50) NOT NULL DEFAULT '0',
  `dni` varchar(10) NOT NULL DEFAULT '0',
  `domicilio` varchar(150) NOT NULL DEFAULT '0',
  `telefono` varchar(30) NOT NULL DEFAULT '0',
  `activo` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idAfiliado`),
  UNIQUE KEY `dni` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla massalud.afiliados: ~0 rows (aproximadamente)

-- Volcando estructura para tabla massalud.especialidades
CREATE TABLE IF NOT EXISTS `especialidades` (
  `idCodigo` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idCodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla massalud.especialidades: ~0 rows (aproximadamente)

-- Volcando estructura para tabla massalud.ordenes
CREATE TABLE IF NOT EXISTS `ordenes` (
  `idOrden` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(5) NOT NULL DEFAULT '0',
  `id_afiliado` int(11) NOT NULL DEFAULT 0,
  `id_prestador` int(11) NOT NULL DEFAULT 0,
  `fecha` date NOT NULL,
  `formaPago` varchar(30) NOT NULL DEFAULT '0',
  `importe` double(8,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`idOrden`),
  UNIQUE KEY `codigo` (`codigo`),
  KEY `FK__afiliados` (`id_afiliado`),
  KEY `FK_ordenes_prestadores` (`id_prestador`),
  CONSTRAINT `FK__afiliados` FOREIGN KEY (`id_afiliado`) REFERENCES `afiliados` (`idAfiliado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_ordenes_prestadores` FOREIGN KEY (`id_prestador`) REFERENCES `prestadores` (`idPrestador`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla massalud.ordenes: ~0 rows (aproximadamente)

-- Volcando estructura para tabla massalud.prestadores
CREATE TABLE IF NOT EXISTS `prestadores` (
  `idPrestador` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(50) NOT NULL DEFAULT '0',
  `nombre` varchar(50) NOT NULL DEFAULT '0',
  `dni` varchar(10) NOT NULL DEFAULT '0',
  `domicilio` varchar(150) NOT NULL DEFAULT '0',
  `telefono` varchar(30) NOT NULL DEFAULT '0',
  `id_especialidad` int(11) NOT NULL DEFAULT 0,
  `activo` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idPrestador`),
  KEY `FK_prestadores_especialidades` (`id_especialidad`),
  CONSTRAINT `FK_prestadores_especialidades` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidades` (`idCodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla massalud.prestadores: ~0 rows (aproximadamente)

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
