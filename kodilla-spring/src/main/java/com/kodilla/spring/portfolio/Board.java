package com.kodilla.spring.portfolio;

public final class Board {
    final TaskList taskList;

     public Board(TaskList taskList) {
        this.taskList = taskList;
    }

    public void toDoList(){
        taskList.getTasks().add("Task 1");
        System.out.println("To do list: " + taskList.getTasks());

    }

    public void inProgressList(){
        taskList.getTasks().add("Task 2");

         System.out.println("In progress list: " + taskList.getTasks());

    }

    public void doneList(){
        taskList.getTasks().add("Task 3");

        System.out.println("Done list: " + taskList.getTasks());

    }
}
