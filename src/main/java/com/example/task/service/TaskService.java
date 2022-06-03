package com.example.task.service;

import com.example.task.model.Task;
import com.example.task.repository.TaskRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

  @Autowired
  private TaskRepository taskRepository;

  public void save(Task task){
    this.taskRepository.insert(task);
  }

  public List<Task> findAll() {
    return this.taskRepository.findAll();
  }
}
