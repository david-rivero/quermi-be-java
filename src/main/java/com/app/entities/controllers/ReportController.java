package com.app.entities.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {
  @PostMapping("/reports")
  public String createReport() { return ""; }

  @GetMapping("/reports/{userId}")
  public String getReports(String userId) { return ""; }
}
