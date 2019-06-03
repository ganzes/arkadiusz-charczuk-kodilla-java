package com.kodilla.good.patterns.challenges.AlleGit;

import java.time.LocalDateTime;

public class ItemBoughtService implements BoughtService{
    @Override
    public boolean bought(User user, LocalDateTime boughtTime) {

        System.out.println("Iten bought for: " + user.getNickName() + " | "
                + user.getUserName()+ " | "
                + user.getUserLastName()+ " | "  +
                "at date: " + boughtTime.toString());

        return true;
    }
}
