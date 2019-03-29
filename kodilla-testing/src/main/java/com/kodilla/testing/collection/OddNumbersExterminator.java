package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    //zwraca
    //1 typ to kwantyfikator dostepu | zwracany typ od void poprzez kazdy inny | nazwa | parametry w nawiasie |
    public ArrayList <Integer> exterminate (ArrayList <Integer> numbers) {//przyjmuje to, co w nawiasie
        ArrayList <Integer> zwrotWezPomNiepa = new ArrayList<Integer>();

        for (int index = 0; index <numbers.size(); index++) {

            if (numbers.get(index) % 2 == 0) {
                zwrotWezPomNiepa.add(numbers.get(index));
            }
        }
        return zwrotWezPomNiepa;
    }
}
