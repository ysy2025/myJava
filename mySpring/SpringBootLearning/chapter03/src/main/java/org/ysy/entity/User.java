package org.ysy.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户实体")
public class User {

    @ApiModelProperty(value = "主键")
    private Long id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "年纪")
    private Integer age;

    @ApiModelProperty(value = "地址")
    private String address;

}
