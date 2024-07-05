annotation
Annotation 其实就是代码里的特殊标记, 这些标记可以在编译, 类加载, 运行时被读取, 并执行相应的处理.通过使用 Annotation,
程序员可以在不改变原有逻辑的情况下, 在源文件中嵌入一些补充信息. 代码分析工具、开发工具和部署工具可以通过这些补充信息进行验证或者进行部署

自定义 annotation
定义新的 Annotation 类型使用 @interface 关键字
自定义注解自动继承了java.lang.annotation.Annotation接口
参照 @SuppressWarnings 来写


元注解
JDK 的元 Annotation 用于修饰其他 Annotation 定义
JDK5.0提供了4个标准的meta-annotation类型
Retention
Target
Documented
Inherited

元数据:对数据进行修饰的数据,比如String name = "zhangsan",String 和 name都可以看做是元数据

@Retention: 只能用于修饰一个 Annotation 定义, 用于指定该 Annotation 的生命周期,
@Rentention 包含一个 RetentionPolicy 类型的成员变量, 使用@Rentention 时必须为该 value 成员变量指定值:
RetentionPolicy.SOURCE:在源文件中有效(即源文件保留) , 编译器直接丢弃这种策略的注释
RetentionPolicy.CLASS:在class文件中有效(即class保留) , 当运行 Java 程序时, JVM不会保留注解. 这是默认值
RetentionPolicy.RUNTIME:在运行时有效(即运行时保留) , 当运行 Java 程序时, JVM 会保留注释.程序可以通过反射获取该注释.


@Target: 用于修饰 Annotation 定义, 用于指定被修饰的 Annotation 能用于修饰哪些程序元素. @Target 也包含一个名为 value 的成员变量;没有指定就默认都可以使用


@Documented: 用于指定被该元 Annotation 修饰的 Annotation 类将被javadoc 工具提取成文档. 默认情况下, javadoc是不包括注解的
定义为Documented的注解必须设置Retention值为RUNTIME

@Inherited: 被它修饰的 Annotation 将具有继承性.如果某个类使用了被@Inherited 修饰的 Annotation, 则其子类将自动具有该注解


JDK8中注解的新特性
可重复注解,以及,可用于类型的注解;此外反射也得到加强,可以得到方法参数的名称;简化标注在方法参数上的注解

以前的重复注解
@MyAnnotations({@MyAnnotation(value = "zhangsan"), @MyAnnotation(value = "zhangsan")})

JDK1.8之后,关于元注解@Target的参数类型ElementType枚举值多了两个:TYPE_PARAMETER,TYPE_USE
在Java 8之前, 注解只能是在声明的地方所使用, Java8开始, 注解可以应用在任何地方
ElementType.TYPE_PARAMETER 表示该注解能写在类型变量的声明语句中(如: 泛型声明).
ElementType.TYPE_USE 表示该注解能写在使用类型的任何语句中。