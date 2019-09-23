package com.vip.orders.controller;

import com.vip.orders.domain.entity.Orders;
import com.vip.orders.service.OrdersService;
import com.vip.orders.util.Result;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 21:39
 */
@RestController
@RequestMapping("/api")
public class OrdersController {
    @Resource
    OrdersService ordersService;

    @RequestMapping("/orders")
    public Result<List<Order>> findByUid(int uid){
        try {
            List<Orders> orders = ordersService.findByUid(uid);
            return Result.success(orders);
        } catch (Exception e) {
            return Result.error();
        }
    }
}
