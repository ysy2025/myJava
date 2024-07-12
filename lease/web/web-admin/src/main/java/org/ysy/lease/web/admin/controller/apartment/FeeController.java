package org.ysy.lease.web.admin.controller.apartment;


import org.springframework.beans.factory.annotation.Autowired;
import org.ysy.lease.common.result.Result;
import org.ysy.lease.model.entity.FeeKey;
import org.ysy.lease.model.entity.FeeValue;
import org.ysy.lease.web.admin.service.FeeKeyService;
import org.ysy.lease.web.admin.service.FeeValueService;
import org.ysy.lease.web.admin.vo.attr.AttrKeyVo;
import org.ysy.lease.web.admin.vo.fee.FeeKeyVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "房间杂费管理")
@RestController
@RequestMapping("/admin/fee")
public class FeeController {

    @Autowired
    private FeeKeyService feeKeyService;

    @Autowired
    private FeeValueService feeValueService;

    @Operation(summary = "保存或更新杂费名称")
    @PostMapping("key/saveOrUpdate")
    public Result saveOrUpdateFeeKey(@RequestBody FeeKey feeKey) {
        feeKeyService.saveOrUpdate(feeKey);
        return Result.ok();
    }

    @Operation(summary = "保存或更新杂费值")
    @PostMapping("value/saveOrUpdate")
    public Result saveOrUpdateFeeValue(@RequestBody FeeValue feeValue) {
        feeValueService.saveOrUpdate(feeValue);
        return Result.ok();
    }


    @Operation(summary = "查询全部杂费名称和杂费值列表")
    @GetMapping("list")
    public Result<List<FeeKeyVo>> feeInfoList() {
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

        List<FeeKeyVo> list = feeKeyService.listFeeInfo();
        return Result.ok(list);

    }

    @Operation(summary = "根据id删除杂费名称")
    @DeleteMapping("key/deleteById")
    public Result deleteFeeKeyById(@RequestParam Long feeKeyId) {
        feeKeyService.removeById(feeKeyId);
        return Result.ok();
    }

    @Operation(summary = "根据id删除杂费值")
    @DeleteMapping("value/deleteById")
    public Result deleteFeeValueById(@RequestParam Long id) {
        feeValueService.removeById(id);
        return Result.ok();
    }
}
