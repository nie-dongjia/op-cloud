package com.djn.cn.op.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OPCloudGatewayServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OPCloudGatewayServiceApplication.class, args);
	}
}
