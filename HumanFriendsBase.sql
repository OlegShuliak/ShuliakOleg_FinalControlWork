-- Задание 7
DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends; 
USE human_friends; 

-- Задание 8
CREATE TABLE human_friend(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal VARCHAR(45) NOT NULL);
    
CREATE TABLE pet(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pet VARCHAR(45) NOT NULL);

CREATE TABLE pack_animal(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pack_animal VARCHAR(45) NOT NULL);
    
CREATE TABLE hamster(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pet_id VARCHAR(45) NOT NULL,
    pet_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL);
    
    CREATE TABLE dog(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pet_id VARCHAR(45) NOT NULL,
    pet_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL);
    
    CREATE TABLE cat(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pet_id VARCHAR(45) NOT NULL,
    pet_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL);
    
    CREATE TABLE horse(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pack_animal_id VARCHAR(45) NOT NULL,
    pet_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL);
    
    CREATE TABLE donkey(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pack_animal_id VARCHAR(45) NOT NULL,
    pet_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL);
    
    CREATE TABLE camel(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pack_animal_id VARCHAR(45) NOT NULL,
    pet_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL);
    
    
    
    
    
    
    
    