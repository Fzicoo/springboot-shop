package com.vip.shopcar.controller;

import com.vip.shopcar.domain.entity.ShopCar;
import com.vip.shopcar.service.ShopCarService;
import com.vip.shopcar.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/9/19 23:47
 */
@RestController
@RequestMapping("/api")
public class ShopCarController {
    @Resource
    ShopCarService shopCarService;

    /**查看我的购物车*/
    @RequestMapping("/shopCar")
    public Result<List<ShopCar>> findByUid(int uid){
        try {
            List<ShopCar> shopCars = shopCarService.findByUid(uid);
            return Result.success(shopCars);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**添加商品到购物车*/
    @RequestMapping("/addCar")
    public Result addShopCar(int uid,int goodsId,int num){
        try {
            int count = shopCarService.addShopCar(uid, goodsId, num);
            return Result.success(count);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**修改购物车信息*/
    @RequestMapping("/updateNum")
    public Result updateNum(int goodsId,int op){
        try {
            int i = shopCarService.updateNum(goodsId, op);
            return Result.success(i);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**删除购物车信息*/
    @RequestMapping("/delete")
    public Result deleteShopCar(int goodsId){
        try {
            int i = shopCarService.deleteShopCar(goodsId);
            return Result.success(i);
        } catch (Exception e) {
            return Result.error();
        }
    }

}
