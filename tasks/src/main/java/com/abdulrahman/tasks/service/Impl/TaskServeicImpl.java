package com.abdulrahman.tasks.service.Impl;

import com.abdulrahman.tasks.domain.Task;
import com.abdulrahman.tasks.repository.TaskRepository;
import com.abdulrahman.tasks.service.TaskService;
import org.springframework.stereotype.Service;


@Service
public class TaskServeicImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServeicImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() { return this.taskRepository.findAll(); }

    @Override
    public Task save(Task task) { return this.taskRepository.save(task); }


}
