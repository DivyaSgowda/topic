create schema topic;

use topic;
drop table topic;

create table topic(
id INT primary key,
name varchar(50),
description varchar(150));


Insert into topic values(1,'Spring Framework', 'description of containers and xml configuration');
Insert into topic values(2,'Spring boot', 'description of advance spring concepts');
Insert into topic values(3,'Spring jpa', 'creation and use of table scripts');
Insert into topic values(4,'Spring MVC', 'MVC controller');
Insert into topic values(5,'Spring REST', 'REST controller');