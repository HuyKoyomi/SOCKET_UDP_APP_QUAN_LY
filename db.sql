create database udpdb;
use udpdb;
create table tbluser (
    id int NOT NULL AUTO_INCREMENT,
    code varchar(255) NOT NULL,
     fullname varchar(255) NOT NULL,
     username varchar(255) NOT NULL,
password varchar(255) NOT NULL,
    PRIMARY KEY (id)
);
create table tbltype(
    id int NOT NULL AUTO_INCREMENT,
     typecode varchar(255) NOT NULL,
     typename varchar(255) NOT NULL,
     description varchar(255),
     PRIMARY KEY (id)
);
create table tblsupplies(
    id int NOT NULL AUTO_INCREMENT,
     suppliescode varchar(255) NOT NULL,
     suppliesname varchar(255) NOT NULL,
     image varchar(255),
     ages int not null,
     price int not null,
     typeid int,
     PRIMARY KEY (id), 
     FOREIGN Key (typeid) references tbltype(id)
);

INSERT INTO  tbltype (typecode,typename,description)
values ("sach","Sach", "sach");
INSERT INTO  tbltype 
values ("vo","Vo", "Vo");
INSERT INTO  tbltype 
values ("but","But", "But");
