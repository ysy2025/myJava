package com.ysy;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class batisTest {
    @Test
    public void testName() throws Exception {
        //加载核心配置文件
        String resource = "SqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);

        //sessionFactory类
        SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(in);

        //sqlSession
        SqlSession sqlSession = sessionFactory.openSession();

        //执行sql语句
        Fifa fifa = sqlSession.selectOne("test.fifa", 1);

        System.out.println(fifa.toString());

        sqlSession.close();
    }
}
