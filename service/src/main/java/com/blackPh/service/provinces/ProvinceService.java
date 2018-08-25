package com.blackPh.service.provinces;

import com.blackPh.bean.dto.TArea;
import com.blackPh.bean.vo.ProvincesVo;

import java.util.List;

/**
 *  省市区相关接口
 *  @author  wang.hao
 *  @create 2018-08-25 11:14
 **/
public interface ProvinceService {

    List<ProvincesVo> getAllProvinces();

}
