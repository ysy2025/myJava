# 注解

什么是注解

@interface 自定义注解 自动继承Annotation接口
声明:@interface,格式
```java
public @interface Name{
    
}
```
其中每一个方法实际上是声明了一个配置参数
方法的名称就是参数的名称
返回值类型就是参数的类型,返回值只能是基本类型 Class String enum
可以通过default声明参数默认值
如果只有一个参数成员,一般参数名为value
注解元素必须要有值,我们定义注解元素的时候经常使用空字符串,默认0


哪些类型可以有class对象
class:外部类,成员,局部内部类,匿名内部类
interface:接口
[] 数组
enum 枚举
annotation 注解
primitive type 基本数据类型
void