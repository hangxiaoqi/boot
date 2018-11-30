package com.ctalix.wl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: 弓成龙 <br>
 * email : gcx909109@sina.cn <br>
 * create: 2018-11-30 10:03 <br>
 * description： 用户 控制层 <br>
 **/
@RestController
public class UserController  {

    @GetMapping("/hello")
    public String hello(){
    return  "hello";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }
}
