package com.blackPh.service.imgupload;

import com.blackPh.exceptionbean.ImgException;
import com.blackPh.utils.OSSClientUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *  
 *  @author  wang.hao
 *  @create 2019-04-14 10:05
 **/
@Service
public class ImgUploadServiceImpl implements ImgUploadService {
    @Override
    public String updateHead(MultipartFile file) throws ImgException {
        if (file == null || file.getSize() <= 0) {

        }
        OSSClientUtils ossClient=new OSSClientUtils();
        String name = ossClient.uploadImg2Oss(file);
        String imgUrl = ossClient.getImgUrl(name);
        String[] split = imgUrl.split("\\?");
        return split[0];
    }
}
