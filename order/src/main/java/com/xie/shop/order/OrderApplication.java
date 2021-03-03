package com.xie.shop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单启动类.
 *
 * @date: 2021-02-25
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@RestController
@SpringBootApplication
public class OrderApplication {

    public static void main(String[]  args){
        SpringApplication.run(OrderApplication.class);
    }
//    @Bean
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
