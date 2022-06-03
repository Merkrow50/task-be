package com.example.task;

import com.example.task.model.Task;
import com.example.task.model.TaskStatus;
import com.example.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskApplication implements CommandLineRunner {

	@Autowired
	private TaskService taskService;

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Task task = new Task("Lavar Roupa", "colocar a roupa na lava roupa", TaskStatus.NOT_STARTED);
		this.taskService.save(task);
	}
}
