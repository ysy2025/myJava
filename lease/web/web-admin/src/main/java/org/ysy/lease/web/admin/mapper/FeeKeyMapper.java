package org.ysy.lease.web.admin.mapper;

import org.ysy.lease.model.entity.FeeKey;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.ysy.lease.web.admin.vo.attr.AttrKeyVo;
import org.ysy.lease.web.admin.vo.fee.FeeKeyVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity org.ysy.lease.model.FeeKey
*/
public interface FeeKeyMapper extends BaseMapper<FeeKey> {

    List<FeeKeyVo> listFeeInfo();
}




