package com.kodilla.good.patterns.challenges.Example;

public class MailService implements InformationService {
    @Override
    public void inform(final User user) {
        System.out.println("Cos zwraca Mail Service");
    }
}
