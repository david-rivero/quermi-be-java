package com.app.entities.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleCareServiceController {
  @PostMapping("/care-services/schedule")
  public String scheduleNewCareService() { return ""; }

  @GetMapping("/care-services/schedule/{userId}")
  public String getScheduledCareServices(String userId) { return ""; }
}
