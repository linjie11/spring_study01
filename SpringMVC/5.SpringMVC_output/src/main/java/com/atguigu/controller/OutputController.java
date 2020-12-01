package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import java.util.Map;

/**
 * SpringMVC除过在方法
 */
@SessionAttributes(value = "msg")
@Controller
public class OutputController {
    @RequestMapping("/handle01")
    public String handle01(Map<String,Object> map){
        map.put("msg","你好");
        System.out.println("Map:"+map.getClass());
        return "success";
    }
    @RequestMapping("/handle02")
    public String handle02(Model model){
        model.addAttribute("msg","你好坏");
        System.out.println("Model:"+model.getClass());
        return "success";
    }
    @RequestMapping("/handle03")
    public String handle02(ModelMap modelMap){
        modelMap.addAttribute("msg","你好棒");
        System.out.println("ModelMap:"+modelMap.getClass());
        return "success";
    }
    @RequestMapping("/handle04")
    public ModelAndView handle04(){
        ModelAndView mv = new ModelAndView("success");
        mv.addObject("msg","你好呀");
//        System.out.println("ModelMap:"+modelMap.getClass());
        return mv;
    }
}
