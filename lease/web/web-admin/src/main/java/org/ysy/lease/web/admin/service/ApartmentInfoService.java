package org.ysy.lease.web.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.ysy.lease.model.entity.ApartmentInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.ysy.lease.web.admin.vo.apartment.ApartmentItemVo;
import org.ysy.lease.web.admin.vo.apartment.ApartmentQueryVo;
import org.ysy.lease.web.admin.vo.apartment.ApartmentSubmitVo;

/**
* @author liubo
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface ApartmentInfoService extends IService<ApartmentInfo> {

    void saveOrUpdateApartment(ApartmentSubmitVo apartmentSubmitVo);

    Page<ApartmentItemVo> pageItem(Page<ApartmentItemVo> page, ApartmentQueryVo queryVo);
}
