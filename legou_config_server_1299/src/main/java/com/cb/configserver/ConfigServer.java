package com.cb.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//对注册中心来说是客户端
@EnableConfigServer//这个配置的服务端

public class ConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class );
    }
}
