package com.cb.legou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient//这个对注册中心来说也是客户端
@EnableZuulProxy//这个就是来启动路由的。
public class ZuulAPP {
    public static void main(String[] args) {
        SpringApplication.run(ZuulAPP.class );
    }
}
