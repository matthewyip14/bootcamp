create database bootcamp_2504p_task;

use bootcamp_2504p_task;

create table regions (
	region_id int primary key,
    region_name varchar(25) not null unique
);
create table countries (
	country_id char(2) primary key,
    country_name varchar(40) not null unique,
    region_id int not null unique,
    foreign key (region_id) references regions(region_id)
);
create table locations (
	location_id int primary key,
    street_address varchar(25) not null,
    postal_code varchar(12),
    city varchar(30) not null,
    state_province varchar(12) not null,
	country_id char(2) not null,
    foreign key (country_id) references countries(country_id)
);
create table departments (
	department_id int primary key,
    department_name varchar(30) not null unique,
	manager_id int not null unique,
    location_id int not null,
    foreign key (location_id) references locations(location_id)
);
create table jobs (
	job_id varchar(10) primary key,
    job_title varchar(35) not null,
    min_salary int not null,
    max_salary int not null
);
create table employees (
	employee_id int primary key,
    first_name varchar(20) not null,
    last_name varchar(25) not null,
    email varchar(25) not null unique,
    phone_number varchar(20) not null unique,
    hire_date date not null,
    job_id varchar(10) not null,
    salary int not null,
    commission_pct int not null,
    manager_id int not null,
    department_id int not null,
    foreign key (job_id) references jobs(job_id),
    foreign key (manager_id) references departments(manager_id)
);
create table job_historys (
	employee_id int not null,
    start_date date not null,
    end_date date not null,
    job_id varchar(20) not null,
    department_id int not null,
    primary key(employee_id, start_date),
    foreign key (employee_id) references employees(employee_id),
    foreign key (job_id) references jobs(job_id),
    foreign key (department_id) references departments(department_id)
);
create table job_grades (
	grade_level varchar(2) not null,
    lowest_salary int not null,
    highest_salary int not null
);
