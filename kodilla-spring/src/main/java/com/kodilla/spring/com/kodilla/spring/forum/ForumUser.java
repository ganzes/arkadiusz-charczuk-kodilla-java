package com.kodilla.spring.com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;
//inicjowane w konstruktorze wartością
// "John Smith" (nie przekazuj tego jako parametr - wpisz to w konstruktorze "na sztywno").
    public ForumUser() {
        username = "John Smith";
    }

    public String getUsername() {
        return username;
    }

}
