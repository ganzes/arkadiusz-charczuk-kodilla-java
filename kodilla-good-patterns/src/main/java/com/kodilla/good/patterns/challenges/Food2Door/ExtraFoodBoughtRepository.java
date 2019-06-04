package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class ExtraFoodBoughtRepository implements BoughtRepository {

    @Override
    public boolean createBought(User user, LocalDateTime boughtTime) {
        return false;
    }
}
