package com.cp.springbootshardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cp.springbootshardingsphere.mapper")
public class SpringbootShardingsphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardingsphereApplication.class, args);
    }

}
