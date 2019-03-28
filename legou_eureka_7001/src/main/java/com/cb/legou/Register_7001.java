package com.cb.legou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//这个是我的注册中心，是服务端。
public class Register_7001 {
    public static void main(String[] args) {
        SpringApplication.run(Register_7001.class);
    }
}
