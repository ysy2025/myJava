package com.ysytest;

import com.ysy.controller.UserController;
import com.ysy.dao.UserDao;
import com.ysy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    /**
     * 四个注解
     * @Component 标记为普通组件
     * @Controller 标记为控制层组件
     * @Service 标记为业务层组件
     * @Repository 标记为持久层组件
     * @Controller、@Service、@Repository这三个注解只是在@Component注解的基础上起了三个新的名字。
     * 对于Spring使用IOC容器管理这些组件来说没有区别。所以@Controller、@Service、@Repository这三个注解只是给开发人员看的，让我们能够便于分辨组件的作用。
     * 虽然它们本质上一样，但是为了代码的可读性，为了程序结构严谨我们肯定不能随便胡乱标记。
     *
     * 通过注解+扫描所配置的bean的id,默认值是类的小驼峰,即类名的首字母小写
     */

    @Test
    public void test1() {
        ApplicationContext cac = new ClassPathXmlApplicationContext("spring-annotation.xml");

        UserController userController = cac.getBean(UserController.class);
        System.out.println(userController);

        UserService userService = cac.getBean(UserService.class);
        System.out.println(userService);

        UserDao userDao = cac.getBean(UserDao.class);
        System.out.println(userDao);
    }


    @Test
    public void test2() {
        ApplicationContext cac = new ClassPathXmlApplicationContext("spring-annotation.xml");

//        UserController userController = cac.getBean("userController", UserController.class);
        UserController userController = cac.getBean("controller", UserController.class);
        System.out.println(userController);

        UserService userService = cac.getBean("userServiceImpl", UserService.class);
        System.out.println(userService);

        UserDao userDao = cac.getBean("userDaoImpl", UserDao.class);
        System.out.println(userDao);
    }


    @Test
    public void test3(){
        ApplicationContext cac = new ClassPathXmlApplicationContext("spring-annotation.xml");

        UserController uc = cac.getBean("controller", UserController.class);

        uc.saveUser();
    }
}
