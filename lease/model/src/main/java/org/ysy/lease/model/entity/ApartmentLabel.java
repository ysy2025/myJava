package org.ysy.lease.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Schema(description = "公寓标签关联表")
@TableName(value = "apartment_label")
@Data
@Builder
public class ApartmentLabel {

    private static final long serialVersionUID = 1L;

    @Schema(description = "公寓id")
    @TableField(value = "apartment_id")
    private Long apartmentId;

    @Schema(description = "标签id")
    @TableField(value = "label_id")
    private Long labelId;

}
