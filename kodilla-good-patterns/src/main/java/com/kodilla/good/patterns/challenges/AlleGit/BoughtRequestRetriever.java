package com.kodilla.good.patterns.challenges.AlleGit;

import java.time.LocalDateTime;

public class BoughtRequestRetriever {

    public BoughtRequest retrieve() {
        User user = new User("AllBundy", "Al", "Bundy");
        LocalDateTime boughtTime = LocalDateTime.now();

        Item item = new Item("Iron Thorns","Fantasy Books", 69);

        return new BoughtRequest(user, boughtTime, item);
    }
}
