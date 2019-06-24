import { Component, OnInit } from '@angular/core';
import {Task} from '../task.model';
import {TaskService} from "../task.service";

// import {Task} from 'app/tasks/task.model';

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {
    tasks : Task[] = [];
    constructor(private taskService : TaskService) { }

    ngOnInit() {
        return this.taskService.getTasks()
            .subscribe(
            (tasks: any[]) => {
                   this.tasks = tasks;
                   console.log(tasks);
                 },
            (error) => console.log(error)
            );
    }

    onTaskChange(event, task : Task){
        console.log(' checkbox has changed !!')
    }

    getDueDateLabel(task:Task){
        return task.completed ? 'badge-primary' : 'badge-primary';
    }
}
