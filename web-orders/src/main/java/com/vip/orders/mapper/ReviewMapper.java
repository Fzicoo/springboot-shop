package com.vip.orders.mapper;

import com.vip.orders.domain.entity.Review;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author LFZicoo
* @date 2019/9/19 20:51
*/
public interface ReviewMapper {
    /**根据用户id查询评价详情*/
    List<Review> reByUid(@Param("uid") int uid);
}