package com.app.entities.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TODOTaskController {
  @PostMapping("/todo-tasks")
  public String createTODOTask() { return ""; }

  @GetMapping("/todo-tasks/{userId}")
  public String getTODOTasks(String userId) { return ""; }

  @PutMapping("/todo-tasks/{taskId}")
  public String updateTODOTask(String taskId) { return ""; }
}
