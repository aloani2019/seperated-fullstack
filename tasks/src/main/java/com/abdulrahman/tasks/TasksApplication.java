package com.abdulrahman.tasks;

import com.abdulrahman.tasks.domain.Task;
import com.abdulrahman.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService){
        return args -> {
            taskService.save(new Task( 1L,"name 1", false, LocalDate.now()));
            taskService.save(new Task( 2L,"name 1", false, LocalDate.now()));
            taskService.save(new Task( 3L,"name 1", true, LocalDate.now()));
            taskService.save(new Task( 4L,"name 1", false, LocalDate.now()));
            taskService.save(new Task( 5L,"name 1", true, LocalDate.now()));
        };
    }
}
