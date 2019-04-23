package com.chixing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//相当于在dao层加入Mapper
/*@MapperScan(value = "com.chixing.dao")*/
public class Springboot1DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1DemoApplication.class, args);
    }

}
