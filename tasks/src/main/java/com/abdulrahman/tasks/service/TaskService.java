package com.abdulrahman.tasks.service;


import com.abdulrahman.tasks.domain.Task;
import org.springframework.stereotype.Service;

public interface TaskService {

    Iterable<Task> list();
    Task save(Task task);
}
