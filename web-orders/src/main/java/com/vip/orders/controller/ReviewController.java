package com.vip.orders.controller;

import com.vip.orders.domain.entity.Review;
import com.vip.orders.service.ReviewService;
import com.vip.orders.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 21:39
 */
@RequestMapping("/api")
@RestController
public class ReviewController {
    @Resource
    ReviewService reviewService;

    @RequestMapping("/reviews")
    public Result<List<Review>> findReviewByUid(int uid){
        try {
            List<Review> reviews = reviewService.rwByUid(uid);
            return Result.success(reviews);
        } catch (Exception e) {
            return Result.error();
        }
    }
}
