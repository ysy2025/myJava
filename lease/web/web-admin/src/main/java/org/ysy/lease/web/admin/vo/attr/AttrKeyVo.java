package org.ysy.lease.web.admin.vo.attr;

import org.ysy.lease.model.entity.AttrKey;
import org.ysy.lease.model.entity.AttrValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;


@Data
public class AttrKeyVo extends AttrKey {
/*
AttrKey子类,但是又包含了一个AttrValue list,可以看到是1:n的list集合
 */
    @Schema(description = "属性value列表")
    private List<AttrValue> attrValueList;
}
