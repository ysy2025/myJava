package org.ysy.lease.web.admin.controller.apartment;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import kotlin.jvm.internal.Lambda;
import org.springframework.beans.factory.annotation.Autowired;
import org.ysy.lease.common.result.Result;
import org.ysy.lease.model.entity.PaymentType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import org.ysy.lease.web.admin.service.PaymentTypeService;

import java.util.List;


@Tag(name = "支付方式管理")
@RequestMapping("/admin/payment")
@RestController
public class PaymentTypeController {

    @Autowired
    private PaymentTypeService service;

    @Operation(summary = "查询全部支付方式列表")
    @GetMapping("list")
    public Result<List<PaymentType>> listPaymentType() {
//        QueryWrapper<PaymentType> wrapper = new QueryWrapper<>();
//
//        wrapper.eq("isDeleted", 0);
//
//        List<PaymentType> list = service.list(wrapper);

        List<PaymentType> list = service.list();

//        list.forEach(System.out::println);
//        LambdaQueryWrapper<PaymentType> lqw = new LambdaQueryWrapper<>();
//        lqw.eq(PaymentType::getName, "zhangsan");

        return Result.ok(list);
    }

    @Operation(summary = "保存或更新支付方式")
    @PostMapping("saveOrUpdate")
    public Result saveOrUpdatePaymentType(@RequestBody PaymentType paymentType) {
        service.saveOrUpdate(paymentType);
        return Result.ok();
    }

    @Operation(summary = "根据ID删除支付方式")
    @DeleteMapping("deleteById")
    public Result deletePaymentById(@RequestParam Long id) {
        service.removeById(id);
        return Result.ok();
    }

}















