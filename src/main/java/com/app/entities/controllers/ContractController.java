package com.app.entities.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {
  @PostMapping("/contracts")
  public String createContract() { return ""; }

  @PostMapping("/contracts/request")
  public String requestContract() { return ""; }

  @PostMapping("/contracts/confirm")
  public String confirmContract() { return ""; }

  @PostMapping("/contracts/cancel")
  public String cancelContract() { return ""; }
}
