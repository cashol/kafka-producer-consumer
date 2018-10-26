package com.siemens.ra.cg.kafkaprocessor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

import com.siemens.ra.cg.kafkamessage.model.ChatMessage;

import reactor.core.publisher.Flux;

@EnableBinding(Processor.class)
public class MessageFilter {
  @StreamListener(Processor.INPUT)
  @Output(Processor.OUTPUT)
  public Flux<ChatMessage> transform(Flux<ChatMessage> chatMessage) {
    return chatMessage.map(i -> new ChatMessage(i.getContents().toUpperCase() + "!!", i.getTime()));
  }
  
  /*
  @StreamListener(Processor.INPUT)
  @SendTo(Processor.OUTPUT)
  public ChatMessage transform(final ChatMessage chatmessage) {
    final String contents = chatmessage.getContents().toUpperCase() + "!";
    return new ChatMessage(contents, chatmessage.getTime());
  }
  */
}
