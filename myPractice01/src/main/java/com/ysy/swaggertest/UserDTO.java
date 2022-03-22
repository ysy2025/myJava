package com.ysy.swaggertest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 用户
 *
 * @author JourWon
 * @date 2020/6/1
 */
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@ApiModel(value = "用户", description = "查询用户")
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 78806598597025327L;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "用户名")
    private String username;

}
