package com.kodilla.good.patterns.challenges.Food2Door;

public class MailService implements InformationService {
    @Override
    public void inform(User user, Order order) {
        if (order.getQuantity() != 0){
            System.out.println("Hello " + user.getUserName()
                    + " | You've just ordered: "
                    + order.getMenuPosition()
                    + " | for (all prices are in PLN): " + order.getPrice()
                    + " | in quantity: " + order.getQuantity()) ;
        }
            else {
                System.out.println("Hi "+ user.getUserNick() + " | Your order was not successful, " +
                        "you need to order at least 1 of our products!");
        }
    }
}
