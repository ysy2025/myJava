flink 中创建的表由3个部分构成,catalog名称,数据库名称+表名称
catalog是元数据管理中心,如果catalog或者数据库没有指明,就用默认值
flink默认 default_catalog, default_database
用户可以指定一个catalog和数据库