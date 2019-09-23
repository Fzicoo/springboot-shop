package com.vip.webuser.domain.entity;

import lombok.Data;

/**
* @author LFZicoo
* @date 2019/9/20 16:07
*/
@Data
public class User {
    private Integer uid;

    private Integer oid;

    private String username;

    private String password;

    private Integer goodsId;

    private Integer shopCarId;

    private Integer status;

    private Integer rid;
}