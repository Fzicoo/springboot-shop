package com.vip.webuser.controller;

import com.vip.webuser.service.UserService;
import com.vip.webuser.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LFZicoo
 * @date 2019/9/20 16:35
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Resource
    UserService userService;

    /**用户注册*/
    @RequestMapping("/regist")
    public Result regist(String username,String password) {
//        try {
//            Result ret = userService.regist(username, password);
//            return Result.success(ret);
//        } catch (Exception e) {
//            return Result.error();
//        }
        try {
            Result result = userService.regist(username, password);
            return result;
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**用户登录*/
    @RequestMapping("/login")
    public Result login(String username,String password){
//        try {
//            Result log = userService.login(username, password);
//            return Result.success(log);
//        } catch (Exception e) {
//            return Result.error();
//        }
        try {
            Result result = userService.login(username, password);
            return result;
        } catch (Exception e) {
            return Result.error();
        }
    }

}
