package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    private boolean isTaskExecuted;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isTaskExecuted = false;
    }

    @Override
    public void executeTask() {
        isTaskExecuted = true;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        return isTaskExecuted;
    }
}
