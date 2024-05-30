package com.first.demo.controller;


import com.first.demo.pojo.Emp;
import com.first.demo.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users/car")
public class EmpController {

    @Autowired
    public EmpService empService;

    @PostMapping("/add")
    public String add(@RequestBody Emp emp) {
        log.info("新建用户{}",emp);
        empService.add(emp);
        return "成功";
    }

}
