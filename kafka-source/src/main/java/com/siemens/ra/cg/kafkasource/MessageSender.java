package com.siemens.ra.cg.kafkasource;

import java.io.IOException;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.messaging.support.GenericMessage;

import com.siemens.ra.cg.kafkamessage.model.ChatMessage;

@EnableBinding(Source.class)
public class MessageSender {
  @InboundChannelAdapter(value = Source.OUTPUT,
                         poller = @Poller(fixedDelay = "${fixedDelay}", maxMessagesPerPoll = "${maxMessagesPerPoll}"))
  public GenericMessage<ChatMessage> chatMessageSource() throws IOException {
    return new GenericMessage<ChatMessage>(new ChatMessage("hello world", System.currentTimeMillis()));
  }
}
