create database hello_mp character set utf8mb4 COLLATE utf8mb4_general_ci;

use hello_mp;

drop table if exists user;

create table user
(
    id bigint(20) not null auto_increment comment '主键id',
    name varchar(30) null default null comment '姓名',
    age int(11) null default null comment '年龄',
    email varchar(50) null default null comment '邮箱',
    primary key (id)
);


INSERT INTO user（id,name,age,email)
VALUES
(1, Jone,18，test1@baomidou.com）,
(2,Jack,,20,test2@baomidou.com),
(3,Tom, 28,test3@baomidou.com),
(4,Sandy,，21，,test4@baomidou.com),
(5,Billie,24,test5@baomidou.com);


create database lease character set utf8mb4 COLLATE utf8mb4_general_ci;