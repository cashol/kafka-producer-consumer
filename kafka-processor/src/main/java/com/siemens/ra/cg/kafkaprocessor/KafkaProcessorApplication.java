package com.siemens.ra.cg.kafkaprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.test.binder.TestSupportBinderAutoConfiguration;

@SpringBootApplication(exclude = TestSupportBinderAutoConfiguration.class)
public class KafkaProcessorApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaProcessorApplication.class, args);
	}
}
