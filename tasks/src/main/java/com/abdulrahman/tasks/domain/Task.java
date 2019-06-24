package com.abdulrahman.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


//@Entity(name="task")
@Entity
@Table(name = "task")
@Data
@AllArgsConstructor
public class Task {

    @Id
    private Long id;
    private String name;
    private boolean completed;
    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate  dueDate;

    public Task(){

    }



//    public Task(Long id, String name, boolean completed, LocalDate dueDate) {
//        this.id = id;
//        this.name = name;
//        this.completed = completed;
//        this.dueDate = dueDate;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public boolean isCompleted() {
//        return completed;
//    }
//
//    public void setCompleted(boolean completed) {
//        this.completed = completed;
//    }
//
//    public LocalDate getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(LocalDate dueDate) {
//        this.dueDate = dueDate;
//    }
}
