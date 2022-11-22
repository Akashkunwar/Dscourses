-- DDL (Data Definition Language)
-- Use to create structure the table by this we can create, alter structure, drop table or rename columns

-- Creating employees table in database
-- (For some error you have to select default schema)

create table employees(
emp_id int not null,
first_name varchar(20),
last_name varchar(20),
salary int,
primary key(emp_id)
);



-- To see the table which is created 

SELECT * from employees;


-- To see the structure and type of data to be stored in table

DESCRIBE employees;


-- Alter table which is already being created

-- Creating a new column contact
ALTER TABLE employees add column contact int;

-- Renaming contact column to job_code
ALTER TABLE employees rename column contact to job_code;


-- Remove the records stored in the table

TRUNCATE TABLE employees;


-- Delete table completely 

DROP TABLE employees;



-- DML (Data Manupulation Language)
-- In this we can Insert, Update or Delete data in the table created in DDL

INSERT INTO employees(emp_id, first_name, last_name, salary) values (101, 'Kunwar', 'Akash', 60000);
INSERT INTO employees(emp_id, first_name, last_name, salary) values (102, 'Akash', 'Kumar', 23000);
INSERT INTO employees(emp_id, first_name, last_name, salary) values (103, 'Harsh', 'Vardhan', 45000);
INSERT INTO employees(emp_id, first_name, last_name, salary) values (104, 'Abhikeet', 'Kumar', 23000);
INSERT INTO employees(emp_id, first_name, last_name, salary) values (105, 'Abhishek', 'Kumar', 45300);
INSERT INTO employees(emp_id, first_name, last_name, salary) values (106, 'Stalin', 'Joe', 54600);


-- To update any element in an row or column

update employees set first_name='Abhijeet' where emp_id=104;

-- Delete an element or row of a teble

delete from employees where emp_id=106;
-- For multiple detail at a time
delete from employees where emp_id in (104,105);


-- DCL (Data Control Language)
-- It is used for security purpuses and to give access or revoke access to fetch data as per client

-- Give access to user

GRANT <'privilage list name of column'> on <'Relation name name of column'> to <'USER'>

-- Revoke access to user

revoke <'privilage list name of column'> on <'Relation name name of column'> to <'USER'>


-- TCL (Transaction Control Language)
-- It normaly used to handle data related to transaction which can commit, revoke or savepoints of the transaction


-- SQL Operators 
-- Filter

-- WHERE Clause (Get result by filtering data)
SELECT * from employees WHERE emp_id=101; -- By employee ID
SELECT * from employees WHERE salary>30000; -- By Salary greater than

-- Logical Operator (AND, OR and NOT)

-- AND (Both statement should be true)
SELECT * from employees WHERE first_name='Akash' AND last_name='kumar';

-- OR (One statement should be true)
SELECT * from employees WHERE first_name='Akash' OR last_name='kumar';

-- NOT (!=)(None of statement should be true)
SELECT * from employees WHERE first_name!='Akash' AND last_name='kumar';


-- Comparision Operators (>,<,>=,<=,<> or !=)

SELECT * from employees WHERE salary<=40000; -- Less than equal to

SELECT * from employees WHERE last_name='kumar' AND salary<40000; -- Equal to with less than operator among AND operator

SELECT * from employees WHERE salary<=40000 and last_name != 'kumar'; -- Use of less than equal to, AND and not equal to comparision operator together


-- Special Operator (BETWEEN, LIKE, IS NULL, IN and DISTINCT)

SELECT * from employees WHERE salary between 30000 and 40000; -- Between

SELECT * from employees WHERE salary IS NULL; -- All null value in salary

SELECT * from employees WHERE salary IN (20000,30000,40000); -- Salary with these values

SELECT DISTINCT first_name FROM employee; -- ALl unique first_name

SELECT * from employees WHERE first_name like 'A%'; -- Match first name start with A


-- Aggregate function (Avg(), Count(), Max(), Min() and Sum())

SELECT Avg(salary) FROM employees; -- Average of salary
SELECT Count(*) FROM employees; -- Total no. of count from record
SELECT Max(salary) FROM employees; -- Maximum value of salary
SELECT Min(salary) FROM employees; -- Minimum value of salary
SELECT Sum(salary) FROM employees; -- Sum of all the salary


-- Adding department column to perform groupby operations in that
ALTER TABLE employees add column dep varchar(20);
-- Adding values in that
UPDATE employees set dep='sales' WHERE id=101;
UPDATE employees set dep='sales' WHERE emp_id=101;
UPDATE employees set dep='tech' WHERE emp_id=102;
UPDATE employees set dep='support' WHERE emp_id=103;
UPDATE employees set dep='sales' WHERE emp_id=104;
UPDATE employees set dep='marketing' WHERE emp_id=105;


-- Group by clause
SELECT first_name, max(salary), dep from employees GROUP BY dep;

-- Having clause
-- To use aggrigate function with group by clause we use having clause
SELECT Avg(salary), dep FROM employees GROUP BY dep HAVING count(dep)>=2; -- Avg. salary of employee where min 2 people are in that department
SELECT first_name, Max(salary), dep FROM employees GROUP BY dep HAVING count(dep)>=2;  -- Max salary of employee where min 2 people are in that department
SELECT first_name, Avg(salary), dep FROM employees GROUP BY dep HAVING count(dep)>=1;  -- Avg. salary of employy where min 1 people are in that department

-- Order by clause
SELECT * from employees ORDER BY salary DESC; -- Ordering a table of a database

-- First creating 2 table
CREATE TABLE product1(
category_id int,
product_name VARCHAR(20)
);

CREATE TABLE product2(
category_id int,
product_name VARCHAR(20)
);


-- Inserting values
INSERT INTO product1 VALUES(1,'nokia');
INSERT INTO product1 VALUES(2,'samsung');
INSERT INTO product1 VALUES(3,'hp');
INSERT INTO product1 VALUES(6,'nikon');

INSERT INTO product2 VALUES(1,'samsung');
INSERT INTO product2 VALUES(2,'lg');
INSERT INTO product2 VALUES(3,'hp');
INSERT INTO product2 VALUES(5,'dell');
INSERT INTO product2 VALUES(6,'apple');
INSERT INTO product2 VALUES(10,'playstation');


-- UNION Funcion
SELECT product_name FROM product1 
UNION 
SELECT product_name from product2;

-- UNION ALL Function (It provide duplicate value whether union remove duplicate values)
SELECT product_name FROM product1 
UNION ALL
SELECT product_name from product2;

-- INRTERSECT functuon (Provide common element between two element)
SELECT product_name FROM product1 
INTERSECT
SELECT product_name from product2;

