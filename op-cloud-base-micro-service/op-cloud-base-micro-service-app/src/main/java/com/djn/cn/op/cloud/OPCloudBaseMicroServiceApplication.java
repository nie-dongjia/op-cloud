package com.djn.cn.op.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableEurekaClient   // 开启 EurekaClient 
@EnableHystrix        // 
@EnableFeignClients   // 开启EnableFeignClients  
@SpringBootApplication
@EnableTransactionManagement // 开启事务
public class OPCloudBaseMicroServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OPCloudBaseMicroServiceApplication.class, args);
	}
}
