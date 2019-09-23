package com.vip.webuser.mapper;

import com.vip.webuser.domain.entity.User;
import org.apache.ibatis.annotations.Param;

/**
* @author LFZicoo
* @date 2019/9/20 16:07
*/
public interface UserMapper {

    /**注册*/
    int regist(@Param("username") String username,@Param("password") String password);

    /**登录*/
    User login(@Param("name") String username);

}