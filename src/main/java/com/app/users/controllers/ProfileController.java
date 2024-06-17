package com.app.users.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
  @GetMapping("/profiles")
  public String getProfiles() { return ""; }

  @PostMapping("/profiles/enable/{userId}")
  public String enableProfile(String userId) {
    return "";
  }

  @GetMapping("/profiles/me")
  public String getCurrentProfile() {
    return "";
  }

  @PostMapping("/profiles/block")
  public String blockProfile() { return ""; }
}
