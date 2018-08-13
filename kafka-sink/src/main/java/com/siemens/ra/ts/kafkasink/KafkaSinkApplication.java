package com.siemens.ra.ts.kafkasink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.test.binder.TestSupportBinderAutoConfiguration;

@SpringBootApplication(exclude = TestSupportBinderAutoConfiguration.class)
public class KafkaSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSinkApplication.class, args);
	}
}
