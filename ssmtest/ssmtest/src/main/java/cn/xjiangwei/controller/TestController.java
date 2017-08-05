package cn.xjiangwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("View/success.jsp");
        modelAndView.addObject("user","jiangwei");


        return modelAndView;

    }





}
