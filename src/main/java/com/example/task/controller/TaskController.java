package com.example.task.controller;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.example.task.model.Task;
import com.example.task.service.TaskService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder.Default;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE, value = "v1/tasks")
@RequestScope
@AllArgsConstructor
public class TaskController {

  private final TaskService service;

  @GetMapping
  public List<Task> getAll() {
    return service.findAll();
  }

  @PostMapping
  public void create(@Validated({Default.class}) @ModelAttribute Task dto){
    service.save(dto);
  }

}
