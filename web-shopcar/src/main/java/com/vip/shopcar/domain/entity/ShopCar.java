package com.vip.shopcar.domain.entity;

import java.util.Date;
import lombok.Data;

/**
* @author LFZicoo
* @date 2019/9/19 20:40
*/
@Data
public class ShopCar {
    private Integer shopCarId;

    private Integer uid;

    private Integer goodsId;

    private Integer num;

    private Integer status;

    private Date creatTime;

    private Date updateTime;
}