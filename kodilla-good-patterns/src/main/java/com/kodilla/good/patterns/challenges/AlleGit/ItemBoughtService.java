package com.kodilla.good.patterns.challenges.AlleGit;

import java.time.LocalDateTime;

public class ItemBoughtService implements BoughtService{
    @Override
    public boolean bought(User user, LocalDateTime boughtTime, Item item) {

        System.out.println("Item: " + item.getItemName() + " | Category: "
                + item.getItemCategory()
                + " | Price in PLN:  "+ item.getItemPrice()
                + " | was bought by: "
                + user.getNickName() + " | "
                + user.getUserName()+ " | "
                + user.getUserLastName()+ " | "  +
                "at date: " + boughtTime.toString());

        return true;
    }
}
