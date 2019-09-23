package com.vip.shopcar.service.impl;

import com.vip.shopcar.domain.entity.ShopCar;
import com.vip.shopcar.mapper.ShopCarMapper;
import com.vip.shopcar.service.ShopCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 23:43
 */
@Service
public class ShopCarServiceImpl implements ShopCarService {
    @Resource
    ShopCarMapper shopCarMapper;

    /**通过用户id查询购物车信息*/
    @Override
    public List<ShopCar> findByUid(int uid) {
        List<ShopCar> shopCars = shopCarMapper.findByUid(uid);
        return shopCars;
    }

    /**浏览商品添加到购物车*/
    @Override
    public int addShopCar(int uid, int goodsId, int num) {
        ShopCar shopCar = shopCarMapper.findByGid(uid,goodsId);
        int count = 0;
        if (shopCar != null){
            count = shopCarMapper.updateShopCar(uid,goodsId, num);
        }else {
            count = shopCarMapper.addShopCar(uid, goodsId, num);
        }
        return count;
    }

    /**修改购物车数量*/
    @Override
    public int updateNum(int goodsId, int op) {
        int i = shopCarMapper.updateNum(goodsId, op);
        return i;
    }

    /**删除商品信息*/
    @Override
    public int deleteShopCar(int goodsId) {
        int i = shopCarMapper.deleteShopCar(goodsId);
        return i;
    }


}
