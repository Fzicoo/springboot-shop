package com.vip.orders.service.impl;

import com.vip.orders.domain.entity.Orders;
import com.vip.orders.mapper.OrdersMapper;
import com.vip.orders.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 21:35
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    OrdersMapper ordersMapper;

    @Override
    public List<Orders> findByUid(int uid) {
        List<Orders> ordersList = ordersMapper.findByUid(uid);
        return ordersList;
    }
}
