package com.linjie.neo4j_project.controller;

import com.linjie.neo4j_project.service.QueryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class QueryController {
    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public Map query(@RequestParam(value = "input") String input){
        return QueryService.query(input);
    }
//    @RequestMapping(path = "/")
//    public String hello(){
//        return "hello world";
//    }
}
