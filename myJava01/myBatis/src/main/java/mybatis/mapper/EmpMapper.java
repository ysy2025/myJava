package mybatis.mapper;

import com.glodon.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {

    /**
     * 查询所有员工返回值
     */
    List<Emp> getAllEmp();

}
