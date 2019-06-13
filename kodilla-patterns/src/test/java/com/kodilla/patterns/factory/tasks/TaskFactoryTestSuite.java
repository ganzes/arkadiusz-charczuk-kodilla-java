package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();

        //Then
        Assert.assertEquals("Buy a New PC", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        //paintingTask.executeTask();

        //Then
        Assert.assertEquals("Paint a Kid Room", paintingTask.getTaskName());
        Assert.assertEquals(false, paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();

        //Then
        Assert.assertEquals("Drive", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
}
