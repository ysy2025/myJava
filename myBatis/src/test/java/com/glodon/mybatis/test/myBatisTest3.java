package com.glodon.mybatis.test;

import com.glodon.mybatis.mapper.UseMapper;
import com.glodon.mybatis.pojo.Fifa;
import com.glodon.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class myBatisTest3 {

    @Test
    public void testGetUserById(){
        /**
         * 1,查询出的数据只有1条,则可以通过实体类对象或者接收
         * 2,若果查询出来的数据有多条,一定不能通过实体类对象接收,此时会抛出异常 TooManyResultsException;只能以集合进行接收
         * 3,多条,可以通过list集合进行接收;
         */
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UseMapper mapper = sqlSession.getMapper(UseMapper.class);
        List<Fifa> select = mapper.select();
        System.out.println(select);
    }
}
