package com.kodilla.good.patterns.challenges.AlleGit;

public class User {
    String nickName;
    String userName;
    String userLastName;

    public User(String nickName, String userName, String userLastName) {
        this.nickName = nickName;
        this.userName = userName;
        this.userLastName = userLastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }
}
