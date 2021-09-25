package com.swisscom.opentelemetry.dto;

public class ResponseDto {
  private String message;

  public ResponseDto(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
