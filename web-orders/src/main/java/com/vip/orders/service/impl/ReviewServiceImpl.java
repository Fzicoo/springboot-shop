package com.vip.orders.service.impl;

import com.vip.orders.domain.entity.Review;
import com.vip.orders.mapper.ReviewMapper;
import com.vip.orders.service.ReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 21:37
 */
@Service
public class ReviewServiceImpl implements ReviewService {
    @Resource
    ReviewMapper reviewMapper;

    @Override
    public List<Review> rwByUid(int uid) {
        List<Review> reviews = reviewMapper.reByUid(uid);
        return reviews;
    }
}
