package com.kodilla.good.patterns.challenges.Food2Door;

public class User {
    private String userNick;
    private String userName;
    private String userLastName;

    public User(String userNick, String userName, String userLastName) {
        this.userNick = userNick;
        this.userName = userName;
        this.userLastName = userLastName;
    }

    public String getUserNick() {
        return userNick;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }
}
