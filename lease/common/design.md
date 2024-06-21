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



#!/bin/bash

if [ $# -lt 1 ]
then
echo "No Args Input..."
exit ;
fi
case $1 in
"start")
echo " =================== 启动 minio 集群 ==================="
echo " --------------- 启动 hadoop101 ---------------"
# nohup启动服务 指定文件存放路径 /opt/minio/data 还有设置日志文件路径 /opt/minio/logs
# 目前最新版本已经区分了Console和API两个服务的端口，需要指定端口号，否则每次Minio会随即生成端口号。
nohup /usr/local/bin/minio server --address :9002 --console-address :9001 /data > /data/minio.log 2>&1 &

;;
"stop")
echo " =================== 关闭 minio 集群 ==================="
echo " --------------- 关闭 hadoop101 ---------------"


;;
"status")
echo " =================== 状态 minio 集群 ==================="
echo " --------------- 状态 hadoop101 ---------------"


;;

*)
echo "Input Args Error..."
;;
esac



#!/bin/bash

if [ $# -lt 1 ]
then
echo "No Args Input..."
exit ;
fi
case $1 in
"start")
echo " =================== 启动 kafka 集群 ==================="
echo " --------------- 启动 hadoop101 ---------------"
ssh hadoop101 "/opt/module/redis/bin/redis-server /opt/module/redis/bin/redis.conf"

;;
"stop")
echo " =================== 关闭 kafka 集群 ==================="
echo " --------------- 关闭 hadoop101 ---------------"
ssh hadoop101 "/opt/module/redis/bin/redis-cli shutdown"

;;
"status")
echo " =================== 状态 kafka 集群 ==================="
echo " --------------- 状态 hadoop101 ---------------"
ssh hadoop101 "/opt/module/redis/bin/redis-cli info"

;;
"cli")
echo " =================== 状态 kafka 集群 ==================="
echo " --------------- 状态 hadoop101 ---------------"
/opt/module/redis/bin/redis-cli

;;
*)
echo "Input Args Error..."
;;
esac



问题描述
在将MyBatis-plus整合进Springboot项目时，启动后发生 MyBatis-plus ： Property ‘sqlSessionFactory‘ or ‘sqlSessionTemplate‘ are required错误。

解决方法
这种一般是版本问题，一开始想去官网上查，但发现官网登不上去，之后在gitee上的MyBatis-plus主页查找到了最新的版本，将依赖的版本改一下就行：
————————————————

                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。

原文链接：https://blog.csdn.net/weixin_49884065/article/details/130697672