package org.ysy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.ysy.lease.model.enums.ItemType;

@Schema(description = "图片信息表")
@TableName(value = "graph_info")
@Data
public class GraphInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Schema(description = "图片名称")
    @TableField(value = "name")
    private String name;

    @Schema(description = "图片所属对象类型")
    @TableField(value = "item_type")
    private ItemType itemType;

    @Schema(description = "图片所有对象id")
    @TableField(value = "item_id")
    private Long itemId;

    @Schema(description = "图片地址")
    @TableField(value = "url")
    private String url;

}