package br.com.softmon.cinnamonconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CinnamonConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinnamonConfigServerApplication.class, args);
	}
}
