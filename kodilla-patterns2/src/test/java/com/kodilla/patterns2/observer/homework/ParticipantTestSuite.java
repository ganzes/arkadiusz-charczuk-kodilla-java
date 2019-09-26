package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParticipantTestSuite {
    @Test
    public void testUpdateTasksToCheckByMentors(){
        //Given
        ParticipantTasks moduleOne = new ModuleOne();
        ParticipantTasks moduleTwo = new ModuleTwo();
        Participant mentor01 = new Participant("mentorOne");
        Participant mentor02 = new Participant("mentorTwo");
        moduleOne.registerMentor(mentor01);
        moduleTwo.registerMentor(mentor02);
        //When
        moduleOne.addTask("task01");
        moduleOne.addTask("task02");
        moduleTwo.addTask("task01");
        moduleOne.addTask("task03");
        moduleTwo.addTask("task02");
        //Then
        assertEquals(3, mentor01.getUpdateCount());
        assertEquals(2, mentor02.getUpdateCount());
    }
}