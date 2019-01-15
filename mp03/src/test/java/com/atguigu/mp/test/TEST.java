package com.atguigu.mp.test;

import com.atguigu.mp.beans.Employee;
import com.atguigu.mp.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class TEST {
    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    public  void   getId() {
        Employee employee = employeeServiceImpl.selectById(5);
        
    }
}
