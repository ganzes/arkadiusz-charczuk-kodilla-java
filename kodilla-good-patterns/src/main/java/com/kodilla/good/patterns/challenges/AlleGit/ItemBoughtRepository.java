package com.kodilla.good.patterns.challenges.AlleGit;

import java.time.LocalDateTime;

public class ItemBoughtRepository implements BoughtRepository {
    @Override
    public boolean createBought(User user, LocalDateTime boughtTime) {
        return false;
    }
}
