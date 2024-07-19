//package org.ysy;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.properties.bind.Binder;
//import org.springframework.context.ConfigurableApplicationContext;
//
//
///*
//@Controller：修饰class，用来创建处理http请求的对象
//@RestController：Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，默认返回json格式
//@RequestMapping：配置url映射。现在更多的也会直接用以Http Method直接关联的映射注解来定义，比如：GetMapping、PostMapping、DeleteMapping、PutMapping等
//
//
// */
//@SpringBootApplication
//public class Chapter03Application {
//
//    public static void main(String[] args) {
//
//        SpringApplication.run(Chapter03Application.class, args);
//
////        ConfigurableApplicationContext context = SpringApplication.run(Chapter03Application.class, args);
////
////        Binder binder = Binder.get(context.getEnvironment());
//
////        FooProperties foo = binder.bind("com.ysy",
////                Bindable.of(FooProperties.class)).get();
////
////        System.out.println(foo.getFoo());
////
//
//    }
//}
