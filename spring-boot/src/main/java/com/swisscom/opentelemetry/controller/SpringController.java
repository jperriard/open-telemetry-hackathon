package com.swisscom.opentelemetry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.swisscom.opentelemetry.dto.ResponseDto;


@RestController
@CrossOrigin
@RequestMapping(value = "/spring/api")
public class SpringController {

  @RequestMapping(value = "/success", method = RequestMethod.POST)
  public ResponseDto success() {
    return new ResponseDto("Success");
  }

  @RequestMapping(value = "/error", method = RequestMethod.GET)
  public ResponseEntity<HttpStatus> error() {
    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
  }
} 
