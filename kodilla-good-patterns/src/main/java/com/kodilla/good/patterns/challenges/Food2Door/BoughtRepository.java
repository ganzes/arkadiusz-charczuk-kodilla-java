package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public interface BoughtRepository {

   boolean createBought (final User user, final LocalDateTime boughtTime);

}
