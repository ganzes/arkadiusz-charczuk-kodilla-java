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

        //Then
        Assert.assertEquals("Buy a New PC", shoppingTask.getTaskName());
        Assert.assertEquals("Start with Graphic Card", shoppingTask.executeTask());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);

        //Then
        Assert.assertEquals("Paint a Kid Room", paintingTask.getTaskName());
        Assert.assertEquals("Start With Southeast Wall", paintingTask.executeTask());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);

        //Then
        Assert.assertEquals("Drive", drivingTask.getTaskName());
        Assert.assertEquals("To Home", drivingTask.executeTask());
        Assert.assertEquals(false, drivingTask.isTaskExecuted());
    }
}
