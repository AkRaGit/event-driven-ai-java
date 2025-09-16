package com.example.kafkaesque;

import org.springframework.boot.SpringApplication;

public class TestKafkaesqueApplication {

	public static void main(String[] args) {
		SpringApplication.from(KafkaesqueApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
