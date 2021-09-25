package com.swisscom.opentelemetry.dto;

public class RequestDto {
  
  private String message;

  RequestDto(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
