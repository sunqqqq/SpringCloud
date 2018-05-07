package com.sunqqqq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Ehl
 * @date 2018/5/4
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.sunqqqq.springcloud")
@ComponentScan("com.sunqqqq.springcloud")
public class DeptConsumerFeign91_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign91_App.class, args);
    }
}
