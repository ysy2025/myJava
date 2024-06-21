package org.ysy.lease.web.admin.service.impl;

import org.ysy.lease.model.entity.LeaseTerm;
import org.ysy.lease.web.admin.mapper.LeaseTermMapper;
import org.ysy.lease.web.admin.service.LeaseTermService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author ysy
* @description 针对表【lease_term(租期)】的数据库操作Service实现
* @createDate 2024-06-20 15:48:00
*/
@Service
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm>
    implements LeaseTermService{

}




