DROP
DATABASE IF EXISTS projekt3_gruppe_1_db;
CREATE
DATABASE projekt3_gruppe_1_db;
use
projekt3_gruppe_1_db;

CREATE TABLE car
(

    vehicleNo   int AUTO_INCREMENT PRIMARY KEY,
    vin         INTEGER UNIQUE,
    brand       VARCHAR(50),
    model       VARCHAR(50),
    color       VARCHAR(50),
    steelPrice  FLOAT,
    registryFee FLOAT,
    co2Emission FLOAT,
    available   BOOL

);

CREATE TABLE user
(

    userId   INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    role     VARCHAR(50)

);

CREATE TABLE client
(

    clientId  INT AUTO_INCREMENT PRIMARY KEY,
    mail      VARCHAR(100) NOT NULL,
    firstName VARCHAR(50)  NOT NULL,
    lastName  VARCHAR(50)  NOT NULL,
    adress    VARCHAR(150) NOT NULL,
    phoneNo   VARCHAR(50)  NOT NULL,
    cprNo     VARCHAR(50)  NOT NULL

);

CREATE TABLE conditionRep
(

    repId     INT AUTO_INCREMENT PRIMARY KEY,
    clientId  INT NOT NULL,
    userId    INT NOT NULL,
    vehicleNo INT NOT NULL,
    vin       INT NOT NULL,

    CONSTRAINT fk_clientId
        FOREIGN KEY (clientId)
            REFERENCES client (clientId),

    CONSTRAINT fk_userId
        FOREIGN KEY (userId)
            REFERENCES user (userId),

    CONSTRAINT fk_vehicleNo
        FOREIGN KEY (vehicleNo)
            REFERENCES car (vehicleNo),

    CONSTRAINT fk_vin
        FOREIGN KEY (vin)
            REFERENCES car (vin)

);

CREATE TABLE invoice
(

    invoiceId       INT AUTO_INCREMENT PRIMARY KEY,
    clientId        INT  NOT NULL,
    vehicleNo       INT  NOT NULL,
    vin             INT  NOT NULL,
    loanPeriodStart date NOT NULL,
    loanPeriodEnd   date NOT NULL,
    mileage         FLOAT,
    sum             FLOAT,
    isPaid          BOOL,

    CONSTRAINT fk_clientId2
        FOREIGN KEY (clientId)
            REFERENCES client (clientId),

    CONSTRAINT fk_vehicleNo2
        FOREIGN KEY (vehicleNo)
            REFERENCES car (vehicleNo),

    CONSTRAINT fk_vin2
        FOREIGN KEY (vin)
            REFERENCES car (vin)

);

CREATE TABLE damage
(

    damageId INT AUTO_INCREMENT PRIMARY KEY,
    price    FLOAT

);

CREATE TABLE carDamage
(

    damageId  INT,
    vehicleNo INT,

    CONSTRAINT fk_damageId
        FOREIGN KEY (damageId)
            REFERENCES damage (damageId),

    CONSTRAINT fk_vehicleNo3
        FOREIGN KEY (vehicleNo)
            REFERENCES car (vehicleNo)

);


INSERT INTO car (vin, brand, model, color, steelPrice, registryFee, co2Emission, available)
VALUES (001, 'lightning mcqueen', 'pit cup racer', 'red', 100000, 500, 12000, TRUE);

INSERT INTO car (vin, brand, model, color, steelPrice, registryFee, co2Emission, available)
VALUES (002, 'Ronny ræs', 'pit cup racer', 'green', 90000, 450, 21000, TRUE);

INSERT INTO user (username, password, role)
VALUES ('admin', '1234', 'admin');

INSERT INTO client (mail, firstName, lastName, adress, phoneNo, cprNo)
VALUES ('saul.emma@gmail.com', 'Emma', 'Saul', 'byen 2', '123456789', '00000001');
