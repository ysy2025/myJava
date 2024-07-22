package org.ysy.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "用户信息实体")
public class User {

    @Schema(description = "用户id")
    private Integer id;

    @Schema(description = "用户姓名")
    private String name;

    @Schema(description = "用户年龄")
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
