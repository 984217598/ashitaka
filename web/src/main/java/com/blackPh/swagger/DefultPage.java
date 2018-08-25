package com.blackPh.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 初始页面指向Swagger
 *
 * @author wang.hao
 * @create 2018-07-12 下午6:32
 **/
@Controller
@ApiIgnore()
public class DefultPage {
    @RequestMapping("/api")
    public String showSwagger(HttpServletResponse response) {

        return "redirect:http://localhost:8010/swagger-ui.html#/";
    }

}
