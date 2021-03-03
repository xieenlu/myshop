package com.xie.shop.product.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * .
 *
 * @date: 2021-02-25
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@FeignClient("shop-user")
public interface UserService {
    @RequestMapping("/user/getUserInfo")
    public String getUserInfo( @RequestParam Long id);
}
