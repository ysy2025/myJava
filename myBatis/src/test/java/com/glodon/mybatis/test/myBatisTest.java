package com.glodon.mybatis.test;

import com.glodon.mybatis.mapper.FifaMapper;
import com.glodon.mybatis.pojo.Fifa;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class myBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 获取sqlsessionfactorbuilder
        SqlSessionFactoryBuilder sqlSessionFactorybuilder = new SqlSessionFactoryBuilder();

        // 获取sqlsessionfactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactorybuilder.build(is);

        // 获取mybatis的sqlsession

        /**
         * sqlSession默认不自动提交事务;想自动提交事务,可以使用sqlSessionFactory.openSession(true)
         */
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取mapper接口对象
        FifaMapper mapper = sqlSession.getMapper(FifaMapper.class);


        int i = mapper.insertFifa();
        // 提交事务
//        sqlSession.commit();
        System.out.println(i);

    }

    @Test
    public void testMyBatisUpdate() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 获取sqlsessionfactorbuilder
        SqlSessionFactoryBuilder sqlSessionFactorybuilder = new SqlSessionFactoryBuilder();

        // 获取sqlsessionfactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactorybuilder.build(is);

        // 获取mybatis的sqlsession

        /**
         * sqlSession默认不自动提交事务;想自动提交事务,可以使用sqlSessionFactory.openSession(true)
         */
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取mapper接口对象
        FifaMapper mapper = sqlSession.getMapper(FifaMapper.class);


        mapper.updateFifa();
        // 提交事务
//        sqlSession.commit();
//        System.out.println(i);

    }

    @Test
    public void testMyBatisSelect() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        FifaMapper mapper = sqlSession.getMapper(FifaMapper.class);
//        mapper.updateFifa();
//        Fifa fifaById = mapper.getFifaById();
        List<Fifa> allFifa = mapper.getAllFifa();
        for (int i = 0; i < allFifa.size(); i++) {
            System.out.println(allFifa.get(i));
        }

    }
}
