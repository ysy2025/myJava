package mybatis.mapper;

import com.glodon.mybatis.pojo.Fifa;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    /**
     * 查询所有fifa信息
     */

    List<Fifa> getAllFifa();

    /**
     * 根据用户名查询用户信息
     */
    Fifa getFifaByName(String name);

    /**
     * 验证登录
     */
    Fifa checkLogin(String name, int age);

    Fifa checkLoginByMap(Map<Object, Object> map);

    /**
     * 查看信息
     */
    Fifa selectDetail(Fifa fifa);

    /**
     * 验证登录(使用@Param为注解)
     */
    Fifa checkLoginByParam(@Param("name") String name, @Param("age") int age);
}
