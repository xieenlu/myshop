package com.xie.shop.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * .
 *
 * @date: 2021-02-25
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@SpringBootApplication
@EnableFeignClients
public class ProductApplication {
    public static void main(String[] args){
        SpringApplication.run(ProductApplication.class);
    }

}
