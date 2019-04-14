package com.blackPh.service.imgupload;

import com.blackPh.exceptionbean.ImgException;
import org.springframework.web.multipart.MultipartFile;

/**
 *  
 *  @author  wang.hao
 *  @create 2019-04-14 10:05
 **/
public interface ImgUploadService {
    String updateHead(MultipartFile file) throws ImgException;
}
