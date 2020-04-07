
CREATE TABLE Musicians (
ssn CHAR(10),
name CHAR(30),
PRIMARY KEY (ssn) );

CREATE TABLE Instruments (
instrld CHAR(10),
dname CHAR(30),
notes CHAR(5),
PRIMARY KEY (instrld) );

 CREATE TABLE Places (address CHAR(30) PRIMARY KEY);

 CREATE TABLE Plays (
ssn CHAR(10),
instrld CHAR(10),
PRIMARY KEY (ssn, instrld),
FOREIGN KEY (ssn) REFERENCES Musicians(ssn),
FOREIGN KEY (instrld) REFERENCES Instruments(instrld) );

 CREATE TABLE Telephone_Home (
num CHAR(11),
address CHAR(30) UNIQUE,
PRIMARY KEY (num),
FOREIGN KEY (address) REFERENCES Places(address));

CREATE TABLE Lives (
ssn CHAR(10),
num CHAR(11),
address CHAR(30),
PRIMARY KEY (ssn, address),
FOREIGN KEY (num) REFERENCES Telephone_Home(num),
FOREIGN KEY (ssn) REFERENCES Musicians(ssn),
FOREIGN KEY (address) REFERENCES Places(address) );

CREATE TABLE Album_Producer (
albumId INTEGER,
ssn CHAR(10),
copyright DATE,
speed INTEGER,
title CHAR(30),
PRIMARY KEY (albumId),
FOREIGN KEY (ssn) REFERENCES Musicians(ssn) );

CREATE TABLE Songs_Appears (
songId INTEGER,
author CHAR(30),
title CHAR(30),
albumId INTEGER NOT NULL,
PRIMARY KEY (songId),
FOREIGN KEY (albumId) REFERENCES Album_Producer(albumId) );

CREATE TABLE Perform (
songId INTEGER,
ssn CHAR(10),
PRIMARY KEY (ssn, songId),
FOREIGN KEY (songId) REFERENCES Songs_Appears(songId),
FOREIGN KEY (ssn) REFERENCES Musicians(ssn) );

INSERT INTO Musicians VALUES ('1008546582', 'Bert Odling');
INSERT INTO Musicians VALUES ('1084346531', 'Bernice Mcleod');
INSERT INTO Musicians VALUES ('1800548452', 'Jago Thatcher');
INSERT INTO Musicians VALUES ('1008549381', 'Diesel Nolan');
INSERT INTO Musicians VALUES ('1075542987', 'Meera Magana');


INSERT INTO Instruments VALUES ('1000000001', 'Guitar', 'C');
INSERT INTO Instruments VALUES ('1000000002', 'Piano', 'Eflat');
INSERT INTO Instruments VALUES ('1000000003', 'Violin', 'F');
INSERT INTO Instruments VALUES ('1000000004', 'Saxaphone', 'G');
INSERT INTO Instruments VALUES ('1000000005', 'Tabla', 'A');
INSERT INTO Instruments VALUES ('1000000006', 'Tuba', 'F');


INSERT INTO Plays VALUES ('1008546582', '1000000001');
INSERT INTO Plays VALUES ('1084346531', '1000000002');
INSERT INTO Plays VALUES ('1800548452', '1000000003');
INSERT INTO Plays VALUES ('1008549381', '1000000004');
INSERT INTO Plays VALUES ('1075542987', '1000000005');
INSERT INTO Plays VALUES ('1800548452', '1000000006');
INSERT INTO Plays VALUES ('1008549381', '1000000001');
INSERT INTO Plays VALUES ('1075542987', '1000000002');


INSERT INTO Album_Producer VALUES ('1111111111', '1800548452',DATE '2019-02-19',1,'Pink Floyd');
INSERT INTO Album_Producer VALUES ('1111111112', '1084346531',DATE '1234-01-10',6,'Random Django');
INSERT INTO Album_Producer VALUES ('1111111113', '1075542987',DATE '1445-06-16',4,'Red Almond');
INSERT INTO Album_Producer VALUES ('1111111114', '1008549381',DATE '1212-07-18',8,'Samajavaragamana');



INSERT INTO Places VALUES ('915 Vermont Street');
INSERT INTO Places VALUES ('497 Nicolls Street');
INSERT INTO Places VALUES ('449 Border Lane');
INSERT INTO Places VALUES ('233 Lake View St.');
INSERT INTO Places VALUES ('740 E. Penn St.');


INSERT INTO Telephone_Home VALUES ('5568196283', '233 Lake View St.');
INSERT INTO Telephone_Home VALUES ('8764031954', '449 Border Lane');
INSERT INTO Telephone_Home VALUES ('5578070855', '497 Nicolls Street');
INSERT INTO Telephone_Home VALUES ('4474303618', '740 E. Penn St.');
INSERT INTO Telephone_Home VALUES ('2084830739', '915 Vermont Street');


INSERT INTO Lives VALUES ('1008546582', '5568196283', '233 Lake View St.');
INSERT INTO Lives VALUES ('1084346531', '8764031954', '449 Border Lane');
INSERT INTO Lives VALUES ('1800548452', '5578070855', '497 Nicolls Street');
INSERT INTO Lives VALUES ('1008549381', '4474303618', '740 E. Penn St.');
INSERT INTO Lives VALUES ('1075542987', '2084830739', '915 Vermont Street');


INSERT INTO Songs_Appears VALUES (1,'Bill Hue', 'I can see you', '1111111111');
INSERT INTO Songs_Appears VALUES (2,'Jack Lai', 'Behind the red door', '1111111112');
INSERT INTO Songs_Appears VALUES (3,'Robin', 'Masquerade', '1111111112');
INSERT INTO Songs_Appears VALUES (4,'Amar', 'Black Water', '1111111113');
INSERT INTO Songs_Appears VALUES (5,'Robert', 'Money man', '1111111114');
INSERT INTO Songs_Appears VALUES (6,'Harry', 'Rogue', '1111111113');
INSERT INTO Songs_Appears VALUES (7,'Ron', 'Romeo', '1111111111');

INSERT INTO Perform VALUES (1, '1800548452');
INSERT INTO Perform VALUES (4, '1008549381');
INSERT INTO Perform VALUES (6, '1075542987');
INSERT INTO Perform VALUES (5, '1008549381');
INSERT INTO Perform VALUES (7, '1075542987');
INSERT INTO Perform VALUES (5, '1008546582');
INSERT INTO Perform VALUES (2, '1084346531');



