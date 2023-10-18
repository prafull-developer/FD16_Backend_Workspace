package com.delta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.delta.proxy")
public class CmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmApplication.class, args);
		
		
		
	}

}
