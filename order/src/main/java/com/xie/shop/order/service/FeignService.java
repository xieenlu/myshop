package com.xie.shop.order.service;

import com.xie.shop.common.model.ProductVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * .
 *
 * @date: 2021-02-25
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
@FeignClient("shop-product")
public interface FeignService {
    @RequestMapping("/product/getProInfo")
    public ProductVo getProInfo(Long id);
}
