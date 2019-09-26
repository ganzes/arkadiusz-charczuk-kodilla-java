package com.kodilla.patterns2.observer.homework;

public interface ObservableMentors {
    void registerMentor(ObserverMU observerMU);
    void notifyMentor();
    void removeMentor(ObserverMU observerMU);
}
