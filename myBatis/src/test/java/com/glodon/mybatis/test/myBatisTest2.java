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
import java.util.List;

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

}
