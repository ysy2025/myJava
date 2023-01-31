package com.ysy4.spring.test;

/**
 * JDBC访问MySql异常
 *
 * Exception in thread "main" org.apache.ibatis.exceptions.PersistenceException:
 * ### Error querying database.  Cause: java.sql.SQLException: The server time zone value '?Ð¹???×¼Ê±?' is unrecognized or represents more than one time zone. You must configure either the server or JDBC driver (via the serverTimezone configuration property) to use a more specifc time zone value if you want to utilize time zone support.
 *
 * 原因分析：
 *
 * 数据库安装时默认为英语，0:00时区
 *
 * Windows系统中，XP的时区是GMT，而Win7的时区是UTC。
 *
 * mysql返回的时间会比实际时间要早8小时。
 *
 *
 * 解决方案，以下任选一种即可解决问题：
 *
 * 1、配置JDBC连接参数
 *
 * 在url连接字符串后面加上?serverTimezone=UTC
 *
 * 例如：
 * jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&serverTimezone=UTC
 *
 * jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF8&serverTimezone=UTC
 *
 * 学点新知识：
 *
 * UTC，世界均衡时间
 *
 * GMT，格林尼治时间
 *
 * 北京时间（东八区），GMT+8，url中表示为：&serverTimezone=GMT%2B8
 *
 * jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&serverTimezone=GMT%2B8
 *
 * 我们一般认为GMT和UTC是一样的，都与英国伦敦的本地时相同。
 *
 */

import com.ysy4.spring.pojo.Stock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

// 指定当前测试类在spring的测试环境中执行,此时就可以通过注入的方式直接获取ioc容器中的bean
@RunWith(SpringJUnit4ClassRunner.class)
// 设置spring测试环境的配置文件
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testSelect(){
        String sql = "select * from test.stock limit 1";
        Stock stock = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Stock>(Stock.class));

        System.out.println(stock);
    }

    @Test
    public void testSelect2(){
        String sql = "select * from test.stock limit 2";
        List<Stock> stock = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Stock>(Stock.class));

        System.out.println(stock);

    }

    @Test
    public void testGetCount(){
        String sql = "select count(1) from test.stock";

        Integer inte = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(inte);
    }
}
