package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public interface BoughtService {

    boolean bought (User user, LocalDateTime boughtTime, Order order);

}
