package com.example.msgPublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class MsgPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgPublisherApplication.class, args);
	}

}
