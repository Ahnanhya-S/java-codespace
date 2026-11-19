create database studentdb;

use studentdb;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    dept VARCHAR(30)
);

INSERT INTO student VALUES
(1, 'Ahnan', 'BCA'),
(2, 'Amirtha', 'BCA'),
(3, 'Elakkiya', 'BCA');

select * from student;
