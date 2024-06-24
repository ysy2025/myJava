package org.ysy.lease.web.admin.service;

import org.ysy.lease.model.entity.AttrKey;
import com.baomidou.mybatisplus.extension.service.IService;
import org.ysy.lease.web.admin.vo.attr.AttrKeyVo;

import java.util.List;

/**
* @author ysy
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Service
* @createDate 2024-06-20 15:48:00
*/
public interface AttrKeyService extends IService<AttrKey> {

    List<AttrKeyVo> listAttrInfo();
}
