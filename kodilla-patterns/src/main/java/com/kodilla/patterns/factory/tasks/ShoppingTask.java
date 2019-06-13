package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    private boolean isTaskExecuted;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
