package com.siemens.ra.ts.kafkamessage.model;

public class ChatMessage {
  private String contents;
  private long time;

  public ChatMessage() {

  }

  public ChatMessage(String contents, long time) {
    this.contents = contents;
    this.time = time;
  }

  public long getTime() {
    return time;
  }

  public String getContents() {
    return contents;
  }
}
