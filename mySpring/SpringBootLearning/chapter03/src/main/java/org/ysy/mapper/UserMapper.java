package org.ysy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.ysy.entity.User;

@Mapper
public interface UserMapper {

    public User findAll(@Param("name") String name);
}
