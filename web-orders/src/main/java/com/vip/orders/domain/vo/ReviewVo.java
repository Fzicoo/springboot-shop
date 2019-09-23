package com.vip.orders.domain.vo;

import com.vip.orders.domain.entity.Goods;
import com.vip.orders.domain.entity.Review;
import lombok.Data;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 21:06
 */
@Data
public class ReviewVo extends Review {
    List<Goods> goodsList;
}
