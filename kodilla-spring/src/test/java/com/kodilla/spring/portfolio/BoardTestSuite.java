package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = context.getBean(Board.class);
        board.getToDoList().addTasks("Task 1");
        board.getInProgressList().addTasks("Task 1");
        board.getInProgressList().addTasks("Task 2");
        board.getDoneList().addTasks("Task 1");
        board.getDoneList().addTasks("Task 2");
        board.getDoneList().addTasks("Task 3");
        board.getDoneList().addTasks("Task 4");

        //Then
        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertEquals(2, board.getInProgressList().getTasks().size());
        Assert.assertEquals(4, board.getDoneList().getTasks().size());
    }
}
