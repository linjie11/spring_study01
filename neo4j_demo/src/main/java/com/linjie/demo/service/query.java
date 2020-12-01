package com.linjie.demo.service;

import org.neo4j.driver.*;

public class query {
    public static void main(String[] args) {
        String input = "1#系统低压";
        Driver driver = GraphDatabase.driver("bolt://192.168.5.120:7687", AuthTokens.none());
        Session session = driver.session();
        Result result = session.run("match (r:故障原因)-[:引发]->(g:故障模式) where substring(g.ATACode,0,2)='29' and g.name='"+input+"' return g.name,g.ATACode,r.reason");
        System.out.println(result);

    }
}
