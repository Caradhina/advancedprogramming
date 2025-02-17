BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "details2" (
	"id"	INTEGER PRIMARY KEY AUTOINCREMENT,
	"age"	INTEGER,
	"country"	TEXT,
	"superheroes_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "superheroes" (
	"id"	INTEGER PRIMARY KEY AUTOINCREMENT,
	"name"	TEXT,
	"power"	INTEGER,
	"gender"	TEXT
);
INSERT INTO "details2" VALUES (1,45,'USA',1);
INSERT INTO "details2" VALUES (2,54,'Mongolia',2);
INSERT INTO "details2" VALUES (3,23,'Korea',3);
INSERT INTO "details2" VALUES (4,54,'USA',4);
INSERT INTO "details2" VALUES (5,80,'Japan',5);
INSERT INTO "details2" VALUES (6,23,'USA',6);
INSERT INTO "details2" VALUES (7,20,'Mongolia',7);
INSERT INTO "details2" VALUES (8,77,'China',8);
INSERT INTO "details2" VALUES (9,54,'Korea',9);
INSERT INTO "details2" VALUES (10,44,'USA',10);
INSERT INTO "details2" VALUES (11,75,'China',11);
INSERT INTO "superheroes" VALUES (1,'Superman',100,'M');
INSERT INTO "superheroes" VALUES (2,'Spiderman',85,'M');
INSERT INTO "superheroes" VALUES (3,'Wonderwoman',90,'F');
INSERT INTO "superheroes" VALUES (4,'Thor',95,'M');
INSERT INTO "superheroes" VALUES (5,'Black Panther',80,'M');
INSERT INTO "superheroes" VALUES (6,'Batman',92,'M');
INSERT INTO "superheroes" VALUES (7,'Catwoman',75,'F');
INSERT INTO "superheroes" VALUES (8,'Inv.Woman',92,'F');
INSERT INTO "superheroes" VALUES (9,'Iron Man',97,'M');
INSERT INTO "superheroes" VALUES (10,'Hulk',85,'M');
INSERT INTO "superheroes" VALUES (11,'Aquaman',75,'M');
COMMIT;
