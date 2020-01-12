package com.sunhao.multimediaaccountshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sunhao.multimediaaccountshop")
public class MultimediaAccountShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultimediaAccountShopApplication.class, args);
    }

}
