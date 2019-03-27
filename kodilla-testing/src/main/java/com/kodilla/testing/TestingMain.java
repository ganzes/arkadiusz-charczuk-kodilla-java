package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator testCalculator = new Calculator();//utworzenie obiektu testCalculator, ktory posiada cechy/metody klasy Calculator

        int add = testCalculator.addition(6,4);//dodawanie, wywolanie metody dodawania obiektu tC klasy C
        int sub = testCalculator.subtract(10,6);//odejmowanie, wywolanie metody odejmowania obiektu tC klasy C

        if (testCalculator.addition(6,4) == 10){
            System.out.println("Test na dodawanie ok");
        } else {
            System.out.println("Test na dodawanie nie ok");
        }

        if (testCalculator.subtract(10,6) == 4){
            System.out.println("Test na odejmowanie ok");
        } else {
            System.out.println("Test na odejmowanie nie ok");
        }

        System.out.println("Wynik sprawdzający dodawanie: " + add);
        System.out.println("Wynik sprawdzajacy odejmowanie: " + sub);
    }
}