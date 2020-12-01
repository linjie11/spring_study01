package com.atguigu.controller;

import com.atguigu.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ModelAttributeTestController {
    @RequestMapping("/updateBook")
    public String updateBook(@ModelAttribute("haha") Book book){
        System.out.println("页面提交过来的图书信息为："+book);
        return "success";
    }
    @ModelAttribute
    public void hahaMyModelAttribute(Map<String,Object> map){
        Book book = new Book();
        book.setId(100);
        book.setBookName("西游记");
        book.setAuthor("吴承恩");
        book.setPrice(123.1);
        book.setSales(12);
        book.setStock(1232);
        System.out.println("数据库中查到的图书信息为："+book);
        map.put("haha",book);
        System.out.println("modelAttribute方法...查询了数据并保存起来");
    }
}
