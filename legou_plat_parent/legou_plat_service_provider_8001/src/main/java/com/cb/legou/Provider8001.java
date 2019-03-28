package com.cb.legou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient//这个对于注册中心来说，就是客户端，我这个类是用来发布服务的，就是提供服务的
//@EnableHystrix//打一个这个注解，就是为了用熔断，这个ribbon是在服务的提供端做的
@MapperScan("com.cb.legou.mapper")
public class Provider8001 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001.class);
    }

}
