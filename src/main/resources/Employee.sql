CREATE TABLE EMPLOYEE
(
ID          INT PRIMARY KEY AUTO_INCREMENT,
FIRSTNAME   VARCHAR(30),
LASTNAME    VARCHAR(30),
TELEPHONE   VARCHAR(15),
EMAIL       VARCHAR(30),
CREATED     TIMESTAMP DEFAULT NOW()
);