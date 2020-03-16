package com.djn.cn.op.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OPCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OPCloudEurekaServerApplication.class, args);
	}
}
