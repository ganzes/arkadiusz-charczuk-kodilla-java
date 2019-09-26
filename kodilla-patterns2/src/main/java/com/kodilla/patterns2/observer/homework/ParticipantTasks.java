package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ParticipantTasks implements ObservableMentors{
    private final List<ObserverMU> observersMentors;
    private final List<String> tasks;
    private final String module;
    private final String userCourseName;

    public ParticipantTasks(String module, String userCourseName) {
        observersMentors = new ArrayList<>();
        tasks = new ArrayList<>();
        this.module = module;
        this.userCourseName = userCourseName;
    }

    public void addTask(String task){
        tasks.add(task);
        notifyMentor();
    }

    @Override
    public void registerMentor(ObserverMU observer){
        observersMentors.add(observer);
    }

    @Override
    public void notifyMentor(){
        for(ObserverMU observerMU : observersMentors){
            observerMU.update(this);
        }
    }

    @Override
    public void removeMentor(ObserverMU observerMU){
        observersMentors.remove(observerMU);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getModule() {
        return module;
    }

    public String getUserCourseName() {
        return userCourseName;
    }
}
