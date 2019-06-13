package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean isTaskExecuted;


    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
