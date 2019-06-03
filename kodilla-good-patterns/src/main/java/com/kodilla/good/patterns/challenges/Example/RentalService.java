package com.kodilla.good.patterns.challenges.Example;

import java.time.LocalDateTime;

public interface RentalService {

    boolean rent (User user, LocalDateTime from, LocalDateTime to);

}
