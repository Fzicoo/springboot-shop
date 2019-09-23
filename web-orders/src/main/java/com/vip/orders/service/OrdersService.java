package com.vip.orders.service;

import com.vip.orders.domain.entity.Orders;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 21:31
 */
public interface OrdersService {
    /**通过用户id来查询订单详情*/
    List<Orders> findByUid(int uid);
}
