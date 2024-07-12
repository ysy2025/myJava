package org.ysy.lease.web.admin.controller.apartment;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.ysy.lease.common.result.Result;
import org.ysy.lease.model.entity.CityInfo;
import org.ysy.lease.model.entity.DistrictInfo;
import org.ysy.lease.model.entity.ProvinceInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.ysy.lease.web.admin.service.CityInfoService;
import org.ysy.lease.web.admin.service.DistrictInfoService;
import org.ysy.lease.web.admin.service.ProvinceInfoService;

import java.util.List;

@Tag(name = "地区信息管理")
@RestController
@RequestMapping("/admin/region")
public class RegionInfoController {

    @Autowired
    ProvinceInfoService provinceInfoService;

    @Autowired
    CityInfoService cityInfoService;

    @Autowired
    DistrictInfoService districtInfoService;

    @Operation(summary = "查询省份信息列表")
    @GetMapping("province/list")
    public Result<List<ProvinceInfo>> listProvince() {
        List<ProvinceInfo> list = provinceInfoService.list();
        return Result.ok(list);
    }

    @Operation(summary = "根据省份id查询城市信息列表")
    @GetMapping("city/listByProvinceId")
    public Result<List<CityInfo>> listCityInfoByProvinceId(@RequestParam Long id) {
        QueryWrapper<CityInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("city_info.province_id", id);
        List<CityInfo> list = cityInfoService.list(queryWrapper);
        return Result.ok(list);
    }

    @GetMapping("district/listByCityId")
    @Operation(summary = "根据城市id查询区县信息")
    public Result<List<DistrictInfo>> listDistrictInfoByCityId(@RequestParam Long id) {

        QueryWrapper<DistrictInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("district_info.city_id", id);
        List<DistrictInfo> list = districtInfoService.list(queryWrapper);
        return Result.ok(list);
    }

}
