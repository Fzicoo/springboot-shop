package com.vip.shopcar.mapper;

import com.vip.shopcar.domain.entity.ShopCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author LFZicoo
* @date 2019/9/19 20:40
*/
public interface ShopCarMapper {

    /**根据用户id查询购物车信息*/
    List<ShopCar> findByUid(@Param("uid") int uid);

    /**根据商品id查询购物车是否存在信息*/
    ShopCar findByGid(@Param("uid") int uid,@Param("gid") int goodsId);

    /**根据用户id和商品id创建新的购物车信息*/
    int addShopCar(@Param("uid") int uid,@Param("gid") int goodsId,@Param("num") int num);

    int updateShopCar(@Param("uid") int uid,@Param("gid") int goodsId,@Param("num") int num);

    /**传入用户id和op
     * op  1增  2减
     * */
    int updateNum(@Param("gid") int goodsId,@Param("op") int op);

    /**删除购物车信息*/
    int deleteShopCar(@Param("gid") int goodsId);

}