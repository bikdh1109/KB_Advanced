use tabledb;

drop table if exists usertbl;
drop table if exists buytbl;

create table usertbl
(
    userID    char(8)     not null primary key,
    name      varchar(10) not null,
    birthyear int         not null
);

create table buytbl
(
    num      int primary key not null AUTO_INCREMENT,
    userID   char(8)         not null,
    prodName char(6)         not null,

    foreign key (userID) references usertbl (userID)
);

drop table if exists buytbl;
drop table if exists usertbl;

create table usertbl
(
    userID    char(8)     not null primary key,
    name      varchar(10) not null,
    birthyear int         not null,
    email     char(30) unique
);

drop table if exists usertbl;
create table usertbl
(
    userID    char(8)     not null primary key,
    name      varchar(10) not null,
    birthyear int         not null check ( birthyear between 1900 and 2023),
    mobile    char(3)     not null
);

drop table if exists usertbl;
create table usertbl
(
    userID    char(8)     not null primary key,
    name      varchar(10) not null,
    birthyear int         not null default -1,
    addr      char(2)     not null default '서울',
    mobile1   char(3),
    mobile2   char(8),
    height    smallint             default 170,
    mDate     date
);

ALTER table usertbl
    drop column mobile1;

ALTER table usertbl
    CHANGE column name uName varchar(10) not null;

ALTER table usertbl
    drop primary key;

