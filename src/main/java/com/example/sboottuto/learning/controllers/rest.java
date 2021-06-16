package com.example.sboottuto.learning.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest {
    
@RequestMapping("/hello")
  public String name() {
      return "Hello";
  }
}
