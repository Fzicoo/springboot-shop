package com.vip.webuser.service;

import com.vip.webuser.domain.entity.User;
import com.vip.webuser.util.Result;

/**
 * @author LFZicoo
 * @date 2019/9/20 16:05
 */
public interface UserService {

    /**注册*/
    Result regist(String username,String password);

    /**登录*/
    Result login(String username, String password);

}
