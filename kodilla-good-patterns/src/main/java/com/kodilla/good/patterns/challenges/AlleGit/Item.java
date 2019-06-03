package com.kodilla.good.patterns.challenges.AlleGit;

public class Item {
    String itemName;
    String itemCategory;
    int itemPrice;

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public Item(String itemName, String itemCategory, int itemPrice) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
    }
}
