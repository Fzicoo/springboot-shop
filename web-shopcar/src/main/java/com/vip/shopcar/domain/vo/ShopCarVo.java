package com.vip.shopcar.domain.vo;

import com.vip.shopcar.domain.entity.Goods;
import com.vip.shopcar.domain.entity.ShopCar;
import lombok.Data;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 23:22
 */
@Data
public class ShopCarVo extends ShopCar {
    List<Goods> goodsList;
}
