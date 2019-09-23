package com.vip.orders.service;

import com.vip.orders.domain.entity.Review;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 21:33
 */
public interface ReviewService {
    /**根据用户id来查询我的评价详情*/
    List<Review> rwByUid(int uid);
}
