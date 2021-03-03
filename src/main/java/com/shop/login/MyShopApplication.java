package com.shop.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * .
 *
 * @date: 2021-02-19
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@RestController
@SpringBootApplication
public class MyShopApplication {

    public static void main(String[]  args){
        SpringApplication.run(MyShopApplication.class);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
