package com.vip.orders.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* @author LFZicoo
* @date 2019/9/19 20:44
*/
@Data
public class Orders {
    private Integer oid;

    private Integer goodsId;

    private String orderNum;

    private Integer goodsNum;

    private Integer uid;

    private Integer shopCarId;

    private Date createTime;

    private BigDecimal orderFee;

    private Integer orderStatus;

    private Integer dealStatus;
}