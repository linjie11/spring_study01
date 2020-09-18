package com.linjie.test;

import com.linjie.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    public void test01(){

        Person myperson = (Person) applicationContext.getBean("myperson");
        System.out.println(myperson);
    }

    @Test
    public void test02(){
//        Person beans = applicationContext.getBean(Person.class);
//        System.out.println(beans);

        Person myperson1 = applicationContext.getBean("myperson1",Person.class);
        System.out.println(myperson1);
    }

    @Test
    public void test03(){


        Object myperson3 = applicationContext.getBean("myperson2");
        System.out.println(myperson3);
    }
}