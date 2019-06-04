package com.kodilla.good.patterns.challenges.AlleGit;

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


}
