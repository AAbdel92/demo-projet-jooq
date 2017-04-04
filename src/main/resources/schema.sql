-- MySQL Script generated by MySQL Workbench
-- Tue Apr  4 17:35:47 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema jooqdatabase
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `jooqdatabase` ;

-- -----------------------------------------------------
-- Schema jooqdatabase
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `jooqdatabase` DEFAULT CHARACTER SET utf8 ;
USE `jooqdatabase` ;

-- -----------------------------------------------------
-- Table `jooqdatabase`.`utilisateur`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `jooqdatabase`.`utilisateur` ;

CREATE TABLE IF NOT EXISTS `jooqdatabase`.`utilisateur` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `pseudo` VARCHAR(45) NULL,
  `mot_de_passe` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `derniere_maj` TIMESTAMP NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jooqdatabase`.`role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `jooqdatabase`.`role` ;

CREATE TABLE IF NOT EXISTS `jooqdatabase`.`role` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NULL,
  `derniere_maj` TIMESTAMP NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jooqdatabase`.`utilisateur_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `jooqdatabase`.`utilisateur_role` ;

CREATE TABLE IF NOT EXISTS `jooqdatabase`.`utilisateur_role` (
  `utilisateur_id` INT NOT NULL,
  `role_id` INT NOT NULL,
  PRIMARY KEY (`utilisateur_id`, `role_id`),
  INDEX `fk_utilisateur_has_role_role1_idx` (`role_id` ASC),
  INDEX `fk_utilisateur_has_role_utilisateur_idx` (`utilisateur_id` ASC),
  CONSTRAINT `fk_utilisateur_has_role_utilisateur`
    FOREIGN KEY (`utilisateur_id`)
    REFERENCES `jooqdatabase`.`utilisateur` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_utilisateur_has_role_role1`
    FOREIGN KEY (`role_id`)
    REFERENCES `jooqdatabase`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

alter table utilisateur auto_increment = 1;
alter table role auto_increment = 1;
