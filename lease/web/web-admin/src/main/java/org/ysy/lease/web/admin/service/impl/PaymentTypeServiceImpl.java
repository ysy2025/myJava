package org.ysy.lease.web.admin.service.impl;

import org.ysy.lease.model.entity.PaymentType;
import org.ysy.lease.web.admin.mapper.PaymentTypeMapper;
import org.ysy.lease.web.admin.service.PaymentTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author ysy
* @description 针对表【payment_type(支付方式表)】的数据库操作Service实现
* @createDate 2024-06-20 15:48:00
*/
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType>
    implements PaymentTypeService{

}




