package org.ysy.lease.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AppolintmentStatus implements BaseEnum{

    WAITING(1, "待看房"),

    CANCELED(2, "已取消"),

    VIEWED(3, "已看房");

    @EnumValue
    @JsonValue
    private Integer code;
    private String name;

    AppolintmentStatus(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
