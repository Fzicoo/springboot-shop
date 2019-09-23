package com.vip.shopcar.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
* @author LFZicoo
* @date 2019/9/19 22:14
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