package com.atguigu.dao;

import com.atguigu.bean.Employee;

public interface EmployeeDao {
    //按照员工id查询员工
    public Employee getEmpById(Integer id);
}
