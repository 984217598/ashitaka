package com.blackPh.controller.xingdi;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  
 *  @author  wang.hao
 *  @create 2019-04-12 21:49
 **/
@Controller
@Api
public class XingDiAction {
    final static Logger LOGGER = LoggerFactory.getLogger(XingDiAction.class);
    @RequestMapping(value = "/xingdi", method = RequestMethod.GET)
    public String xingdi(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("aaaaaa");
        LOGGER.info("aaaaaaaaaaaaaaaaaaa");
        return "xingdi";
    }

}
