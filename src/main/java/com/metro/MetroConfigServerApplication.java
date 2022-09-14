package com.metro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MetroConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetroConfigServerApplication.class, args);
	}
}