package com.glodon.mybatis.test;

import com.glodon.mybatis.mapper.ParameterMapper;
import com.glodon.mybatis.pojo.Fifa;
import com.glodon.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class myBatisTest2 {

    /**
     * mybatis获取参数值的两种方式 ${}, #{}
     * ${}本质上是字符串拼接:sql注入;单引号手动拼接;
     * #{}本质上是占位符赋值:
     * 赋值的类型,有map,list等;需要针对性进行处理
     */
    @Test
    public void testSelectAllFifa(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<Fifa> allFifa = mapper.getAllFifa();
        for (int i = 0; i < allFifa.size(); i++) {
            System.out.println(allFifa.get(i));
        }
    }


    @Test
    public void testJDBC() throws Exception {
        // 占位符赋值
        String name = "zhangsan";
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        PreparedStatement ps1 = connection.prepareStatement("select * from fifa where Name = '" + name + "'");// 麻烦+sql注入风险
        //mybatis 参数赋予
        PreparedStatement ps2 = connection.prepareStatement("select * from fifa where Name = ?");
        ps2.setString(1, name);//参数赋值,自动加单引号;避免sql注入问题;字符串拼接很方便
    }

    @Test
    public void testgetFifaByName(){
        /**
         * mybatis获取各种参数值的情况:
         * 1,mapper接口方法的参数为单个的字面量类型
         * #{},大括号里面的名字不重要,位置最重要;当然建议见名知意
         */
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Fifa fifa = mapper.getFifaByName("zhangsan");
        System.out.println(fifa);
    }

    @Test
    public void testCheckLogin(){
        /**2,mapper接口方法的参数为多个参数时,如何?
         * 会放到map中;map中如何存储数据?1,arg0,arg1为键,参数为值;2,param1,param2为键,参数为值
         * 可不可以手动将参数放到map中,然后将map集合作为mapper接口的参数传入?自定义map
         *
         *
         */
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Fifa fifa = mapper.checkLogin("zhangsan", 31);
        System.out.println(fifa);
    }

    @Test
    public void testCheckLoginByMap(){
        /**
         * 如果mapper的接口方法参数有多个,可以手动将参数放在一个map中存储;
         */
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("id", 11);
        map.put("season", 1);
        Fifa fifa = mapper.checkLoginByMap(map);
        System.out.println(fifa);
    }

    @Test
    public void test1(){
        /**4.mapper接口的参数是一个实体类类型的参数的时候,以属性名来访问
         * 只需要通过#{}和${}以属性的方式访问属性值即可但是需要注意${}的单引号问题
         */
    }

    @Test
    public void test2(){
        /**
         * 5注解 命名参数;
         * 使用@Param注解来命名参数 两种方式存储
         * 以@Param为注解的值为键;参数为值
         * 以param1,param2为键,参数为值
         * 因此只需要通过#{}和${}以键的方式访问即可;但是需要注意${}的单引号问题
         *
         */
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Fifa fifa = mapper.checkLoginByParam("zhangsan", 31);
        System.out.println(fifa);
    }
}
