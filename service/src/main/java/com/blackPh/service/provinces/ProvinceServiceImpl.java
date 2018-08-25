package com.blackPh.service.provinces;

import com.blackPh.bean.dto.TArea;
import com.blackPh.mapper.Provinces.ProvinceMapper;
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
    ProvinceMapper provinceMapper;

    @Override
    public List<TArea> getAllProvinces() {
        List<TArea> tArea = provinceMapper.searchAllProvince();

        return tArea;
    }
}
