package com.example.curdmicro.update;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class UpdateServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UpdateServiceApplication.class, args);
    }
}
