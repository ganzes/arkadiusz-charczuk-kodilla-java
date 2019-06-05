package com.kodilla.good.patterns.challenges.Food2Door;

public class BoughtDto {
    public User user;
    private boolean isBought;


    public BoughtDto(User user, boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
