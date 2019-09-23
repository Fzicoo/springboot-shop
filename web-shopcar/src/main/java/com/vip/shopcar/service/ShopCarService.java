package com.vip.shopcar.service;

import com.vip.shopcar.domain.entity.ShopCar;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 23:43
 */
public interface ShopCarService {
    /**根据用户id查询购物车信息*/
    List<ShopCar> findByUid(int uid);

    /**浏览商品添加到购物车*/
    int addShopCar(int uid,int goodsId,int num);

    /**修改购物车数量*/
    int updateNum(int goodsId,int op);

    /**删除商品信息*/
    int deleteShopCar(int goodsId);
}
