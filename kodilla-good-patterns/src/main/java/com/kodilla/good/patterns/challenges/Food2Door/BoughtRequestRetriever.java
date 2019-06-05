package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class BoughtRequestRetriever {
    public BoughtRequest retrieveExtraFood() {
        System.out.println("ExtraFoodShop");

        User user = new User("AllBundy", "Al", "Bundy");
        LocalDateTime boughtTime = LocalDateTime.now();

        Order order = new Order("Steak",69, 1);

        return new BoughtRequest(user, boughtTime, order);
    }

    public BoughtRequest retrieveHealthyShop() {
        System.out.println("HealthyShop");

        User user = new User("PeggyBundy", "Peggy", "Bundy");
        LocalDateTime boughtTime = LocalDateTime.now();

        Order order = new Order("Salad",10, 1);

        return new BoughtRequest(user, boughtTime, order);
    }

    public BoughtRequest retrieveGlutenFreeShop() {
        System.out.println("GlutenFreeShop");

        User user = new User("Master B", "Bud", "Bundy");
        LocalDateTime boughtTime = LocalDateTime.now();

        Order order = new Order("Water",1, 0);

        return new BoughtRequest(user, boughtTime, order);

    }
}
