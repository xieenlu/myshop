package com.xie.shop.product.controller;

import com.netflix.discovery.converters.Auto;
import com.xie.shop.common.model.ProductVo;
import com.xie.shop.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 *
 * @date: 2021-02-25
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private UserService userService;
    @RequestMapping("getProInfo")
    public ProductVo getProInfo(Long id){
        ProductVo productVo = new ProductVo();
        productVo.setName("投影仪");
        System.out.println(userService.getUserInfo(id));
        return productVo;
    }
}
