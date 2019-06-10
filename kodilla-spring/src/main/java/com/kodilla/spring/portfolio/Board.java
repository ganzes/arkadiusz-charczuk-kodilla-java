package com.kodilla.spring.portfolio;

public final class Board {
    final TaskList taskList;

     public Board(TaskList taskList) {
        this.taskList = taskList;
    }

    public void toDoList(){
        System.out.println("To do list: " + taskList.getTasks());
    }

    public void inProgressList(){
        System.out.println("In progress list: " + taskList.getTasks());
    }

    public void doneList(){
        System.out.println("Done list: " + taskList.getTasks());
    }
}
