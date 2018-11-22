package com.blackPh.service.provinces;

import com.blackPh.bean.Enum.CityLevelEnum;
import com.blackPh.bean.dto.TArea;
import com.blackPh.bean.vo.ProvincesVo;
import com.blackPh.mapper.Provinces.ProvinceMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *  省市区相关接口实现类
 *  @author  wang.hao
 *  @create 2018-08-25 11:15
 **/
@Service
public class ProvinceServiceImpl implements ProvinceService{

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<ProvincesVo> getAllProvinces() {
        List<ProvincesVo> provincesVo = Lists.newArrayList();
        List<TArea> tAreas = provinceMapper.searchAll();
        Map<Integer, TArea> provinces = Maps.newHashMap();
        Map<Integer, TArea> citys = Maps.newHashMap();
        Map<Integer, TArea> districts = Maps.newHashMap();
        Map<Integer, TArea> streets = Maps.newHashMap();
        tAreas.forEach(
                tArea -> {
                    if (CityLevelEnum.ONE.getLevel().equals(tArea.getLevel())) {
                        provinces.put(tArea.getAreaId(), tArea);
                    }
                }
        );


        spellParam(tAreas);

        return provincesVo;
    }

    private void spellParam(List<TArea> tAreas) {

    }


}
