package com.kodilla.good.patterns.challenges.AlleGit;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("You just bought an item!");
    }
}
