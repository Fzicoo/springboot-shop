package com.vip.shopcar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.vip.shopcar.mapper")
public class ShopcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopcarApplication.class, args);
    }

}
