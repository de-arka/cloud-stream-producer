package com.cloud.stream.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

/**
 * Spring Boot Producer Application using Spring MessageBuilder and places to topic using Message Channel
 */
@SpringBootApplication
@EnableBinding(Source.class)
public class CloudStreamProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamProducerApplication.class, args);
	}

}
