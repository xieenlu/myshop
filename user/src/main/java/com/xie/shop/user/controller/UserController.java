package com.xie.shop.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 *
 * @date: 2021-02-25
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUserInfo")
    public String getUserInfo(@RequestParam Long id){
        System.out.println("loading............");
        return "zhang : " + id;
    }
}
