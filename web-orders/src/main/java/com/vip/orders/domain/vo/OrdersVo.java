package com.vip.orders.domain.vo;

import com.vip.orders.domain.entity.Goods;
import com.vip.orders.domain.entity.Orders;
import lombok.Data;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 21:05
 */
@Data
public class OrdersVo extends Orders {
    List<Goods> goodsList;
}
