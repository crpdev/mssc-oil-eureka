package com.crpdev.mssc.oil.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsscOilEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscOilEurekaApplication.class, args);
	}

}
