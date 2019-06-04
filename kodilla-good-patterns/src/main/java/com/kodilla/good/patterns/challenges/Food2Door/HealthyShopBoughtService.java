package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class HealthyShopBoughtService implements BoughtService {
    @Override
    public boolean bought(User user, LocalDateTime boughtTime, Order order) {
        System.out.println("Order: " + order.getMenuPosition()
                + " | Price (in PLN): " + order.getPrice()
                + " | Quantity: " + order.getQuantity()
                + " | Client : nickname: " + user.getUserNick()
                + "| name: " + user. getUserName()
                + "| last name: " + user.getUserLastName()
                + "| Order time: " + boughtTime.toString()
        );

        return true;

    }
}
