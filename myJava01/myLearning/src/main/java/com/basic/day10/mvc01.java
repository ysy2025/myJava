package com.basic.day10;

/*
mvc 设计模式

程序分为三个层次:视图模型-控制器-数据模型

这种将程序输入输出,数据处理,以及数据展示,分离的设计模式,使得程序结构灵活清晰,同时也描述了程序各个对象之间的通信方式,降低了程序的耦合性

模型层
数据对象封装:model.bean
数据库操作类:model.dao=Data Access Object
数据库:model.db

控制层 controller 处理业务逻辑
应用界面相关:controller.activity
存放fragment:controller.fragment
显示列表的适配器:controller.adapter
服务相关的:controller.service
抽取的基类:controller.base

视图层
相关工具类:view.utils
自定义view:view.ui

import 关键字
import导入
1,在源文件中,显式使用import结构导入指定包下的类和接口
2,声明在包和类之间
3,如果需要引入多个结构,并列写即可
4,使用*表示全部导入指定包下的指定结构
5,核心包,比如System,String,属于java.lang,不用import
6,本包下定义的类或者接口,不用import
7,同名的类,一个可以import,一个需要使用全路径的名称.
8,使用 xxx.*方法,表明可以使用xxx包下的所有结构;但是如果使用的xxx子包下面的结构,依然需要显示标注->也就是,导入的时候只能选择平级的结构.
9,import static,表示引入的是指定类或者接口中的静态结构.


 */
public class mvc01 {


}
