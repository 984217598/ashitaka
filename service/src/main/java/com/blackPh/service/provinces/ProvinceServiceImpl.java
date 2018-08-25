package com.blackPh.service.provinces;

import com.blackPh.bean.dto.TArea;
import com.blackPh.bean.vo.ProvincesVo;
import com.blackPh.mapper.Provinces.ProvinceMapper;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        for (TArea tArea : tAreas) {
            Integer parentId = tArea.getParentId();
        }




        return provincesVo;
    }
}
