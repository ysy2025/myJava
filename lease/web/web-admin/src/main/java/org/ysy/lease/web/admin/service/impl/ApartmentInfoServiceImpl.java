package org.ysy.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.ysy.lease.model.entity.*;
import org.ysy.lease.model.enums.ItemType;
import org.ysy.lease.web.admin.mapper.ApartmentInfoMapper;
import org.ysy.lease.web.admin.service.*;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.ysy.lease.web.admin.vo.apartment.ApartmentItemVo;
import org.ysy.lease.web.admin.vo.apartment.ApartmentQueryVo;
import org.ysy.lease.web.admin.vo.apartment.ApartmentSubmitVo;
import org.ysy.lease.web.admin.vo.graph.GraphVo;
import org.ysy.lease.model.entity.ApartmentFacility;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liubo
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service实现
 * @createDate 2023-07-24 15:48:00
 */
@Service
public class ApartmentInfoServiceImpl extends ServiceImpl<ApartmentInfoMapper, ApartmentInfo>
        implements ApartmentInfoService {

    @Autowired
    private GraphInfoService graphInfoService;

    @Autowired
    private ApartmentFacilityService apartmentFacilityService;

    @Autowired
    private ApartmentLabelService apartmentLabelService;

    @Autowired
    private ApartmentFeeValueService apartmentFeeValueService;

    @Override
    public void saveOrUpdateApartment(ApartmentSubmitVo apartmentSubmitVo) {

        // 判断是不是新增
        boolean isUpdate = apartmentSubmitVo.getId() != null;

        // 公寓信息的处理,比较简单 直接调用父类 ApartmentInfoService 处理即可 部分属性
        super.saveOrUpdate(apartmentSubmitVo);

        if(isUpdate) {
            // 更新数据
            // 删除图片列表
            QueryWrapper<GraphInfo> graphInfoQueryWrapper = new QueryWrapper<>();
            graphInfoQueryWrapper.eq("graph_info.item_type", ItemType.APARTMENT);
            graphInfoQueryWrapper.eq("graph_info.item_id", apartmentSubmitVo.getId());
            graphInfoService.remove(graphInfoQueryWrapper);

            // 删除配套列表
            QueryWrapper<ApartmentFacility> apartmentFacilityQueryWrapper = new QueryWrapper<>();
            apartmentFacilityQueryWrapper.eq("apartment_facility.apartment_id", apartmentSubmitVo.getId());
            apartmentFacilityService.remove(apartmentFacilityQueryWrapper);

            // 删除标签列表
            QueryWrapper<ApartmentLabel> apartmentLabelQueryWrapper = new QueryWrapper<>();
            apartmentLabelQueryWrapper.eq("apartment_label.apartment_id", apartmentSubmitVo.getId());
            apartmentLabelService.remove(apartmentLabelQueryWrapper);

            // 删除杂费列表
            QueryWrapper<ApartmentFeeValue> apartmentFeeValueQueryWrapper = new QueryWrapper<>();
            apartmentFeeValueQueryWrapper.eq("apartment_fee_value.apartment_id", apartmentSubmitVo.getId());
            apartmentFeeValueService.remove(apartmentFeeValueQueryWrapper);
        }

        // 插入图片列表
        List<GraphVo> graphVoList = apartmentSubmitVo.getGraphVoList();
        if(! CollectionUtils.isEmpty(graphVoList)){ // 插入图片列表非空
            // graphvo 和 graphinfo 字段不同 需要处理 类型处理
            ArrayList<GraphInfo> graphInfoList = new ArrayList<>();
            for(GraphVo graphVo:graphVoList){
                GraphInfo graphInfo = new GraphInfo();
                graphInfo.setItemType(ItemType.APARTMENT);
                graphInfo.setItemId(apartmentSubmitVo.getId());
                // set name + url
                graphInfo.setName(graphVo.getName());
                graphInfo.setUrl(graphVo.getUrl());

                graphInfoList.add(graphInfo);
            }
            // 插入
            graphInfoService.saveBatch(graphInfoList);

        }

        // 插入配套列表
        // 拿到配套列表
        List<Long> facilityInfoIdList = apartmentSubmitVo.getFacilityInfoIds();
        if (!CollectionUtils.isEmpty(facilityInfoIdList)){
            ArrayList<ApartmentFacility> facilityList = new ArrayList<>();
            for (Long facilityId : facilityInfoIdList) {
                ApartmentFacility apartmentFacility = new ApartmentFacility();
                apartmentFacility.setApartmentId(apartmentSubmitVo.getId());
                apartmentFacility.setFacilityId(facilityId);
                facilityList.add(apartmentFacility);
            }
            apartmentFacilityService.saveBatch(facilityList);
        }


        //3.插入标签列表
        List<Long> labelIds = apartmentSubmitVo.getLabelIds();
        if (!CollectionUtils.isEmpty(labelIds)) {
            List<ApartmentLabel> apartmentLabelList = new ArrayList<>();
            for (Long labelId : labelIds) {
                ApartmentLabel apartmentLabel = new ApartmentLabel();
                apartmentLabel.setApartmentId(apartmentSubmitVo.getId());
                apartmentLabel.setLabelId(labelId);
                apartmentLabelList.add(apartmentLabel);
            }
            apartmentLabelService.saveBatch(apartmentLabelList);
        }


        //4.插入杂费列表
        List<Long> feeValueIds = apartmentSubmitVo.getFeeValueIds();
        if (!CollectionUtils.isEmpty(feeValueIds)) {
            ArrayList<ApartmentFeeValue> apartmentFeeValueList = new ArrayList<>();
            for (Long feeValueId : feeValueIds) {
                ApartmentFeeValue apartmentFeeValue = new ApartmentFeeValue();
                apartmentFeeValue.setApartmentId(apartmentSubmitVo.getId());
                apartmentFeeValue.setFeeValueId(feeValueId);
                apartmentFeeValueList.add(apartmentFeeValue);
            }
            apartmentFeeValueService.saveBatch(apartmentFeeValueList);
        }

    }

    @Override
    public Page<ApartmentItemVo> pageItem(Page<ApartmentItemVo> page, ApartmentQueryVo queryVo) {
        return null;
    }
}




