package com.glodon.mybatis.test;

import com.glodon.mybatis.mapper.EmpMapper;
import com.glodon.mybatis.pojo.Emp;
import com.glodon.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class myBatisTest5 {
    @Test
    public void testGetAllEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> select = mapper.getAllEmp();
        for (int i = 0; i < select.size(); i++) {
            System.out.println(select.get(i));
        }
    }
}
