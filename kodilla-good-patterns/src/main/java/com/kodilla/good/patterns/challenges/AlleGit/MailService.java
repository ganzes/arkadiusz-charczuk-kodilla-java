package com.kodilla.good.patterns.challenges.AlleGit;

public class MailService implements InformationService {

    @Override
    public void inform(User user, Item item) {
        System.out.println("Hello " + user.getUserName() + " | You've just bought an: " + item.getItemName()
                + " | " + item.getItemCategory() + " for (all prices are in PLN): " + item.getItemPrice());
    }
}
