package com.kodilla.good.patterns.challenges.Example;

public class RentalDto {
    private User user;
    private boolean isRented;

    public RentalDto(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }
}
