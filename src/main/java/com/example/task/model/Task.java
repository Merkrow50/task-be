package com.example.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "en")
@AllArgsConstructor
public class Task {

  private String name;

  private String description;

  private TaskStatus status;

}
