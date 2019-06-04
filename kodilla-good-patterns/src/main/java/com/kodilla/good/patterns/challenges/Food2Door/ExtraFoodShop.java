package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class ExtraFoodShop {
    private String menuPosition;
    private int price;
    private LocalDateTime boughtTime;

    public ExtraFoodShop(String menuPosition, int price, LocalDateTime boughtTime) {
        this.menuPosition = menuPosition;
        this.price = price;
        this.boughtTime = boughtTime;
    }

    public String getMenuPosition() {
        return menuPosition;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getBoughtTime() {
        return boughtTime;
    }

}
