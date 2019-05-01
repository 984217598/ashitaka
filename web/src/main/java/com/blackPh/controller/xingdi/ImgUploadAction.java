package com.blackPh.controller.xingdi;

import com.alibaba.fastjson.JSONObject;
import com.blackPh.service.imgupload.ImgUploadService;
import com.google.common.collect.Maps;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 *  图片上传接口
 *  @author  wang.hao
 *  @create 2019-04-14 10:02
 **/

@Controller
public class ImgUploadAction {
    final static Logger LOGGER = LoggerFactory.getLogger(ImgUploadAction.class);

    @Autowired
    private ImgUploadService imgUploadService;

    @RequestMapping(value = "/headImgUpload", produces = "text/html;charset=UTF-8")
    @ResponseBody
    @ApiOperation(value = "headImgUpload", httpMethod = "POST")
    public String headImgUpload(HttpServletRequest request, MultipartFile file) {
        Map<String, Object> value = Maps.newHashMap();
        try {
////            String url = imgUploadService.updateHead(file);
//            LOGGER.info("图片路径{}",url);
//            value.put("data", url);
//            value.put("code", 0);
//            value.put("msg", "图片上传成功");
        } catch (Exception e) {
            e.printStackTrace();
            value.put("code", 2000);
            value.put("msg", "图片上传成功");
        }
        return JSONObject.toJSONString(value);
    }


}
