package com.glodon.mybatis.mapper;

import com.glodon.mybatis.pojo.Fifa;

import java.util.List;

public interface ParameterMapper {

    /**
     * 查询所有fifa信息
     */

    List<Fifa> getAllFifa();

    /**
     * 根据用户名查询用户信息
     */
    Fifa getFifaByName(String name);
}
