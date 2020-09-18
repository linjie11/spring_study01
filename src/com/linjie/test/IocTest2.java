package com.linjie.test;

import com.linjie.bean.Car;
import com.linjie.bean.Person;
import com.linjie.bean.Person1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class IocTest2 {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.XML");
    @Test
    public void test01(){

        Person1 myperson = (Person1) ioc.getBean("myperson");
        Person1 myperson2 = (Person1) ioc.getBean("myperson02");
        Map maps = (Map) ioc.getBean("myMap");
        System.out.println(myperson.getCar());
        System.out.println("=============");
        System.out.println(myperson.getBooks());
        System.out.println("==============");
        System.out.println(myperson.getMaps());
        System.out.println("==============");
        System.out.println(myperson.getProperties());
        System.out.println("==============");
        System.out.println(maps.getClass());
        System.out.println("==============");
        Car car = myperson.getCar();
        Object bean2 = ioc.getBean("car01");
        System.out.println(bean2==car);

        System.out.println("myperson02:"+myperson2);

//        Object bean = ioc.getBean("airplane01");
//        System.out.println(bean);
    }

}
