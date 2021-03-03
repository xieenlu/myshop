package com.xie.shop.order.controller;

import com.xie.shop.common.model.ProductVo;
import com.xie.shop.order.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单.
 *
 * @date: 2021-02-25
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@RestController
@RequestMapping("/order")
public class OrderController {
//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private FeignService feignService;
    @RequestMapping("/getProductInfo")
    public String getProductInfo(long proId){
        //ProductVo proInfo = this.feignService.getProInfo(proId);
        return "查询上拼1" + proId + ":" + "ceshi";
    }
}
