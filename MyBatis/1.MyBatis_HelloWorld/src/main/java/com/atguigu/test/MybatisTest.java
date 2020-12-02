package com.atguigu.test;

import com.atguigu.bean.Employee;
import com.atguigu.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        Employee employee;
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeDao employeeDao = openSession.getMapper(EmployeeDao.class);

            employee = employeeDao.getEmpById(1);
        }finally {
            openSession.close();
        }

        System.out.println(employee);
    }

}
