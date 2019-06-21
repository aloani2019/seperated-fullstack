package com.abdulrahman.tasks.repository;

import com.abdulrahman.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends CrudRepository<Task,Long>{
}
