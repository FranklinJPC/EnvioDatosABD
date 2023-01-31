-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bd_datos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bd_datos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_datos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `bd_datos` ;

-- -----------------------------------------------------
-- Table `bd_datos`.`datos_principales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_datos`.`datos_principales` (
  `Cod_DP` VARCHAR(5) NOT NULL,
  `Nombre_DP` VARCHAR(45) NOT NULL,
  `Apellido_DP` VARCHAR(30) NOT NULL,
  `Celular_DP` VARCHAR(10) NULL DEFAULT NULL,
  `Correo_DP` VARCHAR(25) NULL DEFAULT NULL,
  `Edad_DP` DECIMAL(2,0) NULL DEFAULT NULL,
  PRIMARY KEY (`Cod_DP`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
