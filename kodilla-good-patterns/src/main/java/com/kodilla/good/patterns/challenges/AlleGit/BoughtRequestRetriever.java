package com.kodilla.good.patterns.challenges.AlleGit;

import java.time.LocalDateTime;

public class BoughtRequestRetriever {
    public BoughtRequest retrieve() {
        User user = new User("AllBundy", "Al", "Bundy");
        LocalDateTime boughtTime = LocalDateTime.of(2019,3,7,23,55);

        return new BoughtRequest(user, boughtTime);
    }
}
