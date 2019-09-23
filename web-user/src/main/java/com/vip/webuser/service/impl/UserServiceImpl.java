package com.vip.webuser.service.impl;

import com.vip.webuser.domain.entity.User;
import com.vip.webuser.mapper.UserMapper;
import com.vip.webuser.service.UserService;
import com.vip.webuser.util.MD5Utils;
import com.vip.webuser.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LFZicoo
 * @date 2019/9/20 16:30
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public Result regist(String username, String password) {
        Result result = new Result();
        User user = userMapper.login(username);
        if (user != null){
            //0.表示用户已存在
            result.setData(user);
            result.setStatus(0);
        }else {
            int i = userMapper.regist(username, MD5Utils.md5(password));
            if (i == 1){
                //1.表示注册成功
                result.setStatus(i);
            }else {
                //2.表示注册失败
                result.setStatus(2);
            }
        }
        return result;
    }


    @Override
    public Result login(String username, String password) {
        Result result = new Result();

        String passwd = MD5Utils.md5(password);
        User user = userMapper.login(username);

        if (user != null){
            if (user.getPassword().equals(passwd)){
                //1.表示登录成功
                result.setStatus(1);
                result.setData(user);
            }else {
                //2.表示密码错误
                result.setStatus(2);
            }
        }else {
            //0.表示用户名不存在
            result.setStatus(0);
        }
        return result;
    }

}
