package com.kodilla.good.patterns.challenges.AlleGit;


import java.time.LocalDateTime;

public class BoughtRequest {
    private User user;
    LocalDateTime boughtTime;



    public BoughtRequest(User user, LocalDateTime boughtTime) {
        this.user = user;
        this.boughtTime = boughtTime;

    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getBoughtTime() {
        return boughtTime;
    }

}
