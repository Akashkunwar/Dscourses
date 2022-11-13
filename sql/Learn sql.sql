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

