package com.kodilla.good.patterns.challenges.Example2;

import com.kodilla.good.patterns.challenges.Example.InformationService;
import com.kodilla.good.patterns.challenges.Example.User;

public class Main {
    public static void main(String[] args) {
        InformationService service = new MessewngerSending();
        service.inform(new User("jio", "Kiks"));



    }
}
