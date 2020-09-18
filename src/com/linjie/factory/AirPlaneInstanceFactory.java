package com.linjie.factory;

import com.linjie.bean.AirPlane;

public class AirPlaneInstanceFactory {
    public AirPlane getAirPlane(String jzname){
        System.out.println("AirPlaneInstanceFactory....正在造飞机");
        AirPlane airPlane = new AirPlane();
        airPlane.setFdj("太行");
        airPlane.setFjsName("吴亦凡");
        airPlane.setJzName(jzname);
        airPlane.setPersonNum(300);
        airPlane.setYc("198.55cm");
        return airPlane;
    }
}
