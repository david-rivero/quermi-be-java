package com.app.users.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @PostMapping("/login")
  public String login() {
    return "";
  }

  @PostMapping("/register")
  public String register() {
    return "";
  }
}
