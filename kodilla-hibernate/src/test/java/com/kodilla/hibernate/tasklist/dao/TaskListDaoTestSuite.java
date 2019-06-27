package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("All Bundy","Married With Children");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readListName = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, readListName.size());
        System.out.println(readListName);
        //CleanUp
        int id = readListName.get(0).getId();
        taskListDao.deleteById(id);
    }
}
