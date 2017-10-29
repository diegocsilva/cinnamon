package com.cinnamon.jokenpo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JokenpoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokenpoConfigServerApplication.class, args);
	}
}
