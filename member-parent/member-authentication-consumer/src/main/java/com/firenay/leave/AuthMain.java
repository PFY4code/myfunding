package com.firenay.leave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class AuthMain {

//	http://127.0.0.1:4000/
	public static void main(String[] args) {
		SpringApplication.run(AuthMain.class, args);
	}
}
