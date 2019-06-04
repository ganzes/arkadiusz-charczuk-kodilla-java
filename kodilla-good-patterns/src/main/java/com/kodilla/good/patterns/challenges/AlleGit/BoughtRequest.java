package com.kodilla.good.patterns.challenges.AlleGit;


import java.time.LocalDateTime;

public class BoughtRequest {
    private User user;
    private LocalDateTime boughtTime;
    private Item item;

    public Item getItem() {
        return item;
    }

    public BoughtRequest(User user, LocalDateTime boughtTime, Item item) {
        this.user = user;
        this.boughtTime = boughtTime;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getBoughtTime() {
        return boughtTime;
    }

}
