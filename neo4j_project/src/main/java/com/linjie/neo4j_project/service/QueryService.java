package com.linjie.neo4j_project.service;

import org.neo4j.driver.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class QueryService {
    public static Map query(String input){
        //数据库驱动
        Driver driver = GraphDatabase.driver( "bolt://192.168.5.120:7687", AuthTokens.none());
        Session session = driver.session();
        Result result = session.run("match (r:故障原因)-[:引发]->(g:故障模式) where substring(g.ATACode,0,2)='29' and g.name= '"+input+"' return g.name,g.ATACode,r.reason,g.fault_no");
        List list = new ArrayList();
        String ata = null;
        String name = null;
        String faultNo = null;
        while (result.hasNext()){
            Record record = result.next();
            name = record.get(0).asString();
            ata = record.get(1).asString();
            list.add(record.get(2).asString());
            faultNo = record.get(3).asString();
        }
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("fault_mode",name);
        map.put("LRU",ata);
        map.put("fault_no",faultNo);
        map.put("fault_reasonRU",list);
        System.out.println(map);
        session.close();
        driver.close();
        return map;
    }
}
