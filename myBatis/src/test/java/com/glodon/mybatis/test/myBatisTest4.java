package com.glodon.mybatis.test;

import com.glodon.mybatis.mapper.SQLMapper;
import com.glodon.mybatis.pojo.Fifa;
import com.glodon.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class myBatisTest4 {
    @Test
    public void testGetFifaByLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<Fifa> select = mapper.getFifaByLike("Tour");
        System.out.println(select);
    }

    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int select = mapper.deleteMore("1,2,3");
        System.out.println(select);
    }

    @Test
    public void testGetUserByTableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<Fifa> select = mapper.getUserByTableName("fifa");
        System.out.println(select);
    }
}
