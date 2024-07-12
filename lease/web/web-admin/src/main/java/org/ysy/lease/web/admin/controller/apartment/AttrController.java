package org.ysy.lease.web.admin.controller.apartment;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.ysy.lease.common.result.Result;
import org.ysy.lease.model.entity.AttrKey;
import org.ysy.lease.model.entity.AttrValue;
import org.ysy.lease.web.admin.service.AttrKeyService;
import org.ysy.lease.web.admin.service.AttrValueService;
import org.ysy.lease.web.admin.vo.attr.AttrKeyVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "房间属性管理")
@RestController
@RequestMapping("/admin/attr")
public class AttrController {

    @Autowired
    private AttrKeyService attrKeyService;

    @Autowired
    private AttrValueService attrValueService;

    @Operation(summary = "新增或更新属性名称")
    @PostMapping("key/saveOrUpdate")
    public Result saveOrUpdateAttrKey(@RequestBody AttrKey attrKey) {
        attrKeyService.saveOrUpdate(attrKey);
        return Result.ok();
    }

    @Operation(summary = "新增或更新属性值")
    @PostMapping("value/saveOrUpdate")
    public Result saveOrUpdateAttrValue(@RequestBody AttrValue attrValue) {
        attrValueService.saveOrUpdate(attrValue);
        return Result.ok();
    }


    @Operation(summary = "查询全部属性名称和属性值列表")
    @GetMapping("list")
    public Result<List<AttrKeyVo>> listAttrInfo() {
        /*
        这里和上面的区别在于,属性名称和属性值列表,是两个表,因此对应两个实体;
        返回的AttrKeyVo,是AttrKey:AttrValue 1:n 的结果

        mybatis plus 使用的 通用的service 不提供多表关联查询
        想实现 只能自己编写sql查询
        过程:
            1,service 定义方法
            2,service 实现类中实现
            3,mapper 接口中声明查询方法
            4,mapper xml 文件中编写sql
         */

        List<AttrKeyVo> list = attrKeyService.listAttrInfo();
        return Result.ok(list);
    }

    @Operation(summary = "根据id删除属性名称")
    @DeleteMapping("key/deleteById")
    public Result removeAttrKeyById(@RequestParam Long attrKeyId) {
        /*
        属性id 删除
        根据属性id, 查到属性值,然后删除
         */

        // 属性id删除
        attrKeyService.removeById(attrKeyId);

        QueryWrapper<AttrValue> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("attr_value.attr_key_id", attrKeyId);

        attrValueService.remove(queryWrapper);

        return Result.ok();
    }

    @Operation(summary = "根据id删除属性值")
    @DeleteMapping("value/deleteById")
    public Result removeAttrValueById(@RequestParam Long id) {
        /*
        这个就简单了,直接删除属性值的id
         */
        attrValueService.removeById(id);
        return Result.ok();
    }

}
