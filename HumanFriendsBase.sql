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
    pack_animal_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL);
    
CREATE TABLE donkey(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pack_animal_id VARCHAR(45) NOT NULL,
    pack_animal_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL);
    
CREATE TABLE camel(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    type_of_pack_animal_id VARCHAR(45) NOT NULL,
    pack_animal_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL);
    
-- Задание 9
    INSERT INTO human_friend (type_of_animal)
VALUES
('Домашний питомец'),
('Вьючное животное');   
    
   INSERT INTO pet (type_of_animal_id, type_of_pet)
VALUES
(1, 'Хомяк'),
(2, 'Собака'), 
(3, 'Кот');
  
  INSERT INTO pack_animal (type_of_animal_id, type_of_pack_animal)
VALUES
(1, 'Лошадь'),
(2, 'Осел'), 
(3, 'Верблюд');
  
   INSERT INTO hamster (type_of_animal_id, type_of_pet_id, pet_name, skill, date_of_birth)
VALUES
(1, 1, 'Хома', 'Стоять', '2022-08-15'),
(1, 1, 'Рон', 'Перевернуться', '2023-02-01');

  INSERT INTO dog (type_of_animal_id, type_of_pet_id, pet_name, skill, date_of_birth)
VALUES
(1, 2, 'Жучка', 'Сидеть', '2020-05-19'),
(1, 2, 'Рэкс', 'Лежать', '2018-12-25');
  
  INSERT INTO cat (type_of_animal_id, type_of_pet_id, pet_name, skill, date_of_birth)
VALUES
(1, 3, 'Бэтмэн', 'Лежать', '2019-02-09'),
(1, 3, 'Сноу', 'Стоять', '2022-07-14');
  
  INSERT INTO horse (type_of_animal_id, type_of_pack_animal_id, pack_animal_name, skill, date_of_birth)
VALUES
(2, 1, 'Апполон', 'Шагом', '2023-05-18'),
(2, 1, 'Гамлет', 'Рысь', '2019-01-26');
  
  INSERT INTO donkey (type_of_animal_id, type_of_pack_animal_id, pack_animal_name, skill, date_of_birth)
VALUES
(2, 2, 'Пуля', 'Шагом', '2018-12-05'),
(2, 2, 'Руди', 'Шагом', '2021-04-04');
  
  INSERT INTO camel (type_of_animal_id, type_of_pack_animal_id, pack_animal_name, skill, date_of_birth)
VALUES
(2, 3, 'Миша', 'Шагом', '2019-7-29'),
(2, 3, 'Артур', 'Рысь', '2018-03-05');
  
  
    
    
    
    
    
    
    
    