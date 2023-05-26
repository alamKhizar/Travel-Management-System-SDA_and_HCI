create database travel;
use travel;

create table account (username varchar(20), name varchar(20),  password varchar(50), question varchar(50), answer varchar(50));

show tables;

select * from account;
delete from account;

create table customer (username varchar(20), id varchar(20), number varchar(20), gender varchar(20), country varchar(20), address varchar(50), mobileNumber varchar(20), email varchar(20));
select * from customer;


create table book (username varchar(20), package varchar(20), peoples varchar(20), LID varchar(20), country varchar(20), price varchar(50));
select * from book;

create table flights (username varchar(20), Flight varchar(20), people varchar(20), LID varchar(20), country varchar(20), price varchar(50));
select * from flights;

