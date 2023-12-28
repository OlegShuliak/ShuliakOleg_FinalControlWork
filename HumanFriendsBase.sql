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
    kind_of_animal VARCHAR(45) NOT NULL,
    FOREIGN KEY (type_of_animal_id) REFERENCES human_friend (id) ON DELETE CASCADE ON UPDATE CASCADE);

CREATE TABLE pack_animal(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    type_of_animal_id INT NOT NULL,
    kind_of_animal VARCHAR(45) NOT NULL,
    FOREIGN KEY (type_of_animal_id) REFERENCES human_friend (id) ON DELETE CASCADE ON UPDATE CASCADE);
    
CREATE TABLE hamster(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    kind_of_animal_id INT NOT NULL,
    animal_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL,
    FOREIGN KEY (kind_of_animal_id) REFERENCES pet(id) ON DELETE CASCADE ON UPDATE CASCADE);
    
CREATE TABLE dog(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    kind_of_animal_id INT NOT NULL,
    animal_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL,
    FOREIGN KEY (kind_of_animal_id) REFERENCES pet(id) ON DELETE CASCADE ON UPDATE CASCADE);
    
CREATE TABLE cat(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    kind_of_animal_id INT NOT NULL,
    animal_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL,
    FOREIGN KEY (kind_of_animal_id) REFERENCES pet(id) ON DELETE CASCADE ON UPDATE CASCADE);
    
CREATE TABLE horse(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    kind_of_animal_id INT NOT NULL,
    animal_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL,
    FOREIGN KEY (kind_of_animal_id) REFERENCES pack_animal(id) ON DELETE CASCADE ON UPDATE CASCADE);
    
CREATE TABLE donkey(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    kind_of_animal_id INT NOT NULL,
    animal_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL,
    FOREIGN KEY (kind_of_animal_id) REFERENCES pack_animal(id) ON DELETE CASCADE ON UPDATE CASCADE);
    
CREATE TABLE camel(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    kind_of_animal_id INT NOT NULL,
    animal_name VARCHAR(45) NOT NULL,
    skill VARCHAR(45) NOT NULL,
    date_of_birth DATE NOT NULL,
    FOREIGN KEY (kind_of_animal_id) REFERENCES pack_animal(id) ON DELETE CASCADE ON UPDATE CASCADE);
    
-- Задание 9
    INSERT INTO human_friend (type_of_animal)
VALUES
('Домашний питомец'),
('Вьючное животное');   
    
   INSERT INTO pet (type_of_animal_id, kind_of_animal)
VALUES
(1, 'Хомяк'),
(1, 'Собака'), 
(1, 'Кот');
  
  INSERT INTO pack_animal (type_of_animal_id, kind_of_animal)
VALUES
(2, 'Лошадь'),
(2, 'Осел'), 
(2, 'Верблюд');
  
   INSERT INTO hamster (kind_of_animal_id, animal_name, skill, date_of_birth)
VALUES
(1, 'Хома', 'Стоять', '2022-08-15'),
(1, 'Рон', 'Перевернуться', '2023-02-01');

  INSERT INTO dog (kind_of_animal_id, animal_name, skill, date_of_birth)
VALUES
(2, 'Жучка', 'Сидеть', '2020-05-19'),
(2, 'Рэкс', 'Лежать', '2018-12-25');
  
  INSERT INTO cat (kind_of_animal_id, animal_name, skill, date_of_birth)
VALUES
(3, 'Бэтмэн', 'Лежать', '2019-02-09'),
(3, 'Сноу', 'Стоять', '2022-07-14');
  
  INSERT INTO horse (kind_of_animal_id, animal_name, skill, date_of_birth)
VALUES
(1, 'Апполон', 'Шагом', '2023-05-18'),
(1, 'Гамлет', 'Рысь', '2019-01-26');
  
  INSERT INTO donkey (kind_of_animal_id, animal_name, skill, date_of_birth)
VALUES
(2, 'Пуля', 'Шагом', '2018-12-05'),
(2, 'Руди', 'Шагом', '2021-04-04');
  
  INSERT INTO camel (kind_of_animal_id, animal_name, skill, date_of_birth)
VALUES
(3, 'Миша', 'Шагом', '2019-7-29'),
(3, 'Артур', 'Рысь', '2018-03-05');
    
-- Задание 10
SELECT * FROM camel;
TRUNCATE TABLE camel; -- удаляем верблюдов
SELECT * FROM camel;

SELECT * FROM horse
UNION SELECT * FROM donkey; -- объединяем таблицы лошадей и ослов
    


	

    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    