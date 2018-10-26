package com.siemens.ra.cg.kafkasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.test.binder.TestSupportBinderAutoConfiguration;

@SpringBootApplication(exclude = TestSupportBinderAutoConfiguration.class)
public class KafkaSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSourceApplication.class, args);
	}
}
