package com.blackPh.controller.provinces;

import com.blackPh.bean.Result;
import com.blackPh.bean.dto.TArea;
import com.blackPh.bean.vo.ProvincesVo;
import com.blackPh.mapper.Provinces.ProvinceMapper;
import com.blackPh.service.provinces.ProvinceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *  省市区相关
 *  @author  wang.hao
 *  @create 2018-08-25 11:04
 **/
@Controller
@Api(description = "省市区相关")
public class ProvincesController {

    @Autowired
    private ProvinceService provinceService;

    @ApiOperation(value = "查询所有省份", httpMethod = "PUT")
    @RequestMapping("/getProvinceAll")
    @ResponseBody
    public Result<List<ProvincesVo>> getProvinceAll() {
        List<TArea> tArea = provinceService.getAllProvinces();



        return Result.success();
    }


}
