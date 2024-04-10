create database ride;
use ride;

create table ride_detail(ride_no int primary key auto_increment,driver_name varchar(20),customer_name varchar(20), no_of_passengers int);
insert into ride_detail values(101,'driver1','nivedita',3);

select*from ride_detail;