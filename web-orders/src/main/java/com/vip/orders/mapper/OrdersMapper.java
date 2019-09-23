package com.vip.orders.mapper;

import com.vip.orders.domain.entity.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author LFZicoo
* @date 2019/9/19 20:44
*/
public interface OrdersMapper {
    /**根据用户id来查询订单详情*/
    List<Orders> findByUid(@Param("uid") int uid);
}