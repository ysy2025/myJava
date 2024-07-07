package mybatis.mapper;

import com.glodon.mybatis.pojo.Fifa;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {
    /**
     * 根据用户名模糊查询
     */
    List<Fifa> getFifaByLike(@Param("username") String username);

    /**
     * 批量删除
     */
    int deleteMore(@Param("ids") String ids);

    /**
     * 查询指定表中的数据
     */
    List<Fifa> getUserByTableName(@Param("tablename") String tablename);
}
