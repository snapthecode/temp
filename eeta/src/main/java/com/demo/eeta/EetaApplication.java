package com.demo.eeta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.demo.eeta")
public class EetaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EetaApplication.class, args);
        System.out.println("=================   서버 정상 작동    ==================");
    }

}
