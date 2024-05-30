package com.first.demo.service;

import com.first.demo.pojo.Emp;

public interface EmpService {
    Emp login(Emp emp);

    void add(Emp emp);
}
