package com.blackPh.mapper.Provinces;

import com.blackPh.bean.dto.TArea;

import java.util.List;

/**
 *  
 *  @author  wang.hao
 *  @create 2018-08-25 11:25
 **/
public interface ProvinceMapper {
    List<TArea> searchAllProvince();

    List<TArea> searchAll();

}
