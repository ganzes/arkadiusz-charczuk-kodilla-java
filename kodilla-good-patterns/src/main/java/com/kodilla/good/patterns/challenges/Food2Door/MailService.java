package com.kodilla.good.patterns.challenges.Food2Door;

public class MailService implements InformationService {
    @Override
    public void inform(User user, Order order) {
        System.out.println("Hello " + user.getUserName() + " | You've just ordered: " + order.getMenuPosition()
                + " | for (all prices are in PLN): " + order.getPrice() + " | in quantity: " + order.getQuantity()) ;
    }
}
