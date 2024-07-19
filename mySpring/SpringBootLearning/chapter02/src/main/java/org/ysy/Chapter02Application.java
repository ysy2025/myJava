package org.ysy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ConfigurableApplicationContext;
import org.ysy.entity.DataSource;
import org.ysy.entity.FooProperties;
import org.ysy.entity.PostInfo;

import java.util.List;

/*
在application.properties中 添加的参数 在controller注入到springboot中才能读取
正常好像读取不了

 */
@SpringBootApplication
public class Chapter02Application {

    public static void main(String[] args) {
//        SpringApplication.run(Chapter02Application.class, args);

        ConfigurableApplicationContext context = SpringApplication.run(Chapter02Application.class, args);

        Binder binder = Binder.get(context.getEnvironment());

//        FooProperties foo = binder.bind("com.ysy",
//                Bindable.of(FooProperties.class)).get();
//
//        System.out.println(foo.getFoo());
//
//        // 绑定List配置
//        List<String> post = binder.bind("com.didispace.post", Bindable.listOf(String.class)).get();
//        System.out.println(post);

//        List<PostInfo> posts = binder.bind("com.didispace.posts", Bindable.listOf(PostInfo.class)).get();
//        System.out.println(posts);


//        // 绑定datasource
//        DataSource pwd = binder.bind("datasource.password",
        DataSource pwd = binder.bind("datasource",
                Bindable.of(DataSource.class)).get();

//        System.out.println(pwd.getWord());
        System.out.println(pwd.getPassword());
    }

}