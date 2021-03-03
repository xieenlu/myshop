package com.shop.login.model;

/**
 * .
 *
 * @date: 2021-02-23
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
public class Teacher extends People {
    private String name;
    @Override
    public String getName() {
        this.name = "teacher";
        super.name = "people";
        System.out.println(this.name);
        System.out.println(super.name);
        return "xiaozhang";
    }
}
