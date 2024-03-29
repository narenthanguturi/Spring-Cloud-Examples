package com.example.verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerbApplication.class, args);
	}

}
