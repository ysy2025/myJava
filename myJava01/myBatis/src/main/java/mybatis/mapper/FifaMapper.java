package mybatis.mapper;

import com.glodon.mybatis.pojo.Fifa;

import java.util.List;

public interface FifaMapper {

    /**
     * mybatis面向接口编程的两个一致性
     * 1,映射文件的namespace要和mapper接口的全类名保持一致
     * 2,映射文件中,sql语句的id要和mapper接口中的方法名一致
     * 表-实体类-mapper接口-映射文件
     */

    /**
     * 添加用户信息
     */
    int insertFifa();

    /**
     * 修改用户信息
     */
    void updateFifa();

    /**
     * 根据id查询用户信息
     */
    Fifa getFifaById();

    /**
     * 查询所有用户信息
     */
    List<Fifa> getAllFifa();
}
