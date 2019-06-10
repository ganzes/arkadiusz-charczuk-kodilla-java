package com.kodilla.spring.portfolio;


public final class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    /*    public void toDoList(){
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

    }*/
}
