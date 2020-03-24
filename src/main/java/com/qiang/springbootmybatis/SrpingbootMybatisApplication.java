package com.qiang.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiang.springbootmybatis.dao.mapper")
public class SrpingbootMybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SrpingbootMybatisApplication.class, args);
    }

}
