package com.linjie.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.linjie.pojo.User;
import com.linjie.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/j1")
    @ResponseBody   //他就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("林杰",3,"男");
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<User> userList = new ArrayList<User>();
        User user1 = new User("林杰",3,"男");
        User user2 = new User("张三",5,"男");
        User user3 = new User("李四",20,"男");
        User user4 = new User("王五",18,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping("/j3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
        Date date = new Date();

        //ObjectMapper，时间解析后的默认格式为：Timestamp，时间戳
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/j4")
    @ResponseBody
    public String json4() {

        List<User> userList1 = new ArrayList<User>();
        User user1 = new User("林杰",3,"男");
        User user2 = new User("张三",5,"男");
        User user3 = new User("李四",20,"男");
        User user4 = new User("王五",18,"男");
        userList1.add(user1);
        userList1.add(user2);
        userList1.add(user3);
        userList1.add(user4);
        String string = JSON.toJSONString(userList1);
        return string;
    }
}
