package com.shop.login.controller;

import com.shop.login.model.Teacher;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 *
 * @date: 2021-02-19
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@RestController
@RequestMapping("/login")
//@Scope(value = "prototype") 将类设置成多例
public class LoginContoller {

    Integer flag  = 1;
    @RequestMapping("/login")
    public String login(){
        ++flag;
        System.out.println(new Teacher().getName());
        return "nihao" +flag;
    }
}
