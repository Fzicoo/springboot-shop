package com.vip.orders.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
* @author LFZicoo
* @date 2019/9/19 20:50
*/
@Data
public class Goods {
    private Integer goodsId;

    private Integer uid;

    private Integer oid;

    private Integer shopCarId;

    private String goodsImg;

    private Integer rid;

    private String goodsName;

    private String goodsType;

    private BigDecimal goodsPrice;

    private String goodsDetail;

    private Integer goodsStatus;
}