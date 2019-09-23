package com.vip.orders.domain.entity;

import java.util.Date;
import lombok.Data;

/**
* @author LFZicoo
* @date 2019/9/19 20:51
*/
@Data
public class Review {
    private Integer rid;

    private Integer uid;

    private Integer goodsId;

    private Integer shopCarId;

    private String rwDetail;

    private String rwImg;

    private Date rwTime;

    private Integer rwStatus;
}