package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhangz1 on 2022/5/10 13:01
 *
 * @author zhang
 */
@MapperScan("com.demo.mapper")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
    }
}