package com.siemens.ra.ts.kafkamessage.config;

import org.springframework.cloud.stream.schema.avro.AvroSchemaMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.util.MimeType;

@Configuration
public class ChatMessageStreamerConfiguration {
  @Bean
  public MessageConverter chatMessageMessageConverter() {
    AvroSchemaMessageConverter converter = new AvroSchemaMessageConverter(MimeType.valueOf("avro/bytes"));
    converter.setSchemaLocation(new ClassPathResource("schemas/ChatMessage.avsc"));
    return converter;
  }
}
