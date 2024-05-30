package com.first.demo.controller;

import com.first.demo.pojo.Emp;
import com.first.demo.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    private EmpService empService;
    @PostMapping("/login")
    public String login(@RequestBody Emp emp){
        log.info("用户{}登录",emp);
        Emp e = empService.login(emp);

        if(e != null){
            System.out.println("登录成功");
        return "登录成功";}

        else{
            System.out.println("登录失败");
        return "登录失败";}
    }

}
