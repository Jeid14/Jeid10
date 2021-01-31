CREATE SEQUENCE base START 1;
CREATE TABLE street(

id INTEGER PRIMARY KEY,
name VARCHAR NOT NULL
);


CREATE TABLE peoples(
id INTEGER,
firstName VARCHAR NOT NULL,
lastName VARCHAR NOT NULL,
age INTEGER NOT NULL,
id_street INTEGER REFERENCES street(id)
);

INSERT INTO street(id,name) VALUES
(nextval('base'),'1-street'),
(nextval('base'),'2-street'),
(nextval('base'),'3-street'),
(nextval('base'),'Правда'),
(nextval('base'),'Как-то'),
(nextval('base'),'Last');


INSERT INTO peoples(id,firstName,lastName,age,id_street) VALUES
(nextval('base'),'Evhenii','Osipuk',25,(SELECT id FROM street WHERE name = '1-street')),
(nextval('base'),'Anna','Chulkova',54,(SELECT id FROM street WHERE name = '1-street')),
(nextval('base'),'Ksu','Chulkova',11,(SELECT id FROM street WHERE name = '1-street')),
(nextval('base'),'Roma','Mazur',20,NULL),
(nextval('base'),'Aleks','Osipiuk',32,(SELECT id FROM street WHERE name = '1-street')),
(nextval('base'),'Sergii','Pust',19,(SELECT id FROM street WHERE name = 'Правда')),
(nextval('base'),'Karina','Pust',11,(SELECT id FROM street WHERE name = 'Правда')),
(nextval('base'),'Oleg','Pust',33,(SELECT id FROM street WHERE name = 'Правда')),
(nextval('base'),'Ira','Yoga',18,(SELECT id FROM street WHERE name = 'Правда')),
(nextval('base'),'Sasha','Mazur',16,(SELECT id FROM street WHERE name = 'Last')),
(nextval('base'),'Ivan','Karlov',12,NULL);

--1
SELECT COUNT(*)
FROM peoples;
--2
SELECT AVG(age)
FROM peoples;

--3
SELECT DISTINCT lastName
FROM peoples
ORDER BY lastName;
--4
SELECT DISTINCT lastName, COUNT(lastName)
FROM peoples
GROUP BY lastName;

--5
SELECT lastName
FROM peoples
WHERE SUBSTRING(lastName,2,LENGTH(lastName)-1) LIKE '%б%';


--6
SELECT lastName
FROM peoples
WHERE id_street IS  NULL;

--7
SELECT lastName,age
FROM peoples p
    INNER JOIN street s ON s.id = p.id_street
    WHERE age <18 AND s.name = 'Правда';

--8
SELECT s.name,COUNT(firstName)
FROM street s
INNER JOIN peoples p ON s.id = p.id_street
GROUP BY s.name
ORDER BY s.name;
--9
SELECT name
FROM street
WHERE LENGTH(name) = 6;
--10
SELECT name
FROM street s
 INNER JOIN peoples p ON s.id = p.id_street
GROUP BY name
HAVING COUNT(firstName) <3;