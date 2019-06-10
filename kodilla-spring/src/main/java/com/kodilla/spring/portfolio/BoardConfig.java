package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("listToDoList")
    TaskList taskList;

    @Bean
    public Board getBoard(){
        return new Board(taskList);
    }

    @Bean(name = "listToDoList")
    @Scope("prototype")
    public TaskList getToDoList(){
        //return new Board(new TaskList(new ArrayList<>()));
       return new TaskList(new ArrayList<>());
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList(){
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList(){
        return new TaskList(new ArrayList<>());
    }



}
