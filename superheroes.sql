BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "superheroes" (
	"id"	INTEGER PRIMARY KEY AUTOINCREMENT,
	"name"	TEXT,
	"power"	INTEGER,
	"gender"	TEXT
);
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
