package com.csu.ed3d;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.csu.ed3d.persistence")
public class Ed3dApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ed3dApplication.class, args);
    }

}
