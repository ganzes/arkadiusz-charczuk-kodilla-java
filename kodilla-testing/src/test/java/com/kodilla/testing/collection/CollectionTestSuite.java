package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import org.junit.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test start.");
    }

    @After
    public void after(){
        System.out.println("Test koniec.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){//metoda nie widzi to, co w innej metodzie
        ArrayList <Integer> jaha = new ArrayList<>(); //tutaj bedzie ArrayLista

        OddNumbersExterminator x = new OddNumbersExterminator();

        System.out.println(x.exterminate(jaha));
    }

    @Test
    public void testOddNumbersExterminatorNormalList  () {
        ArrayList <Integer> jaha = new ArrayList<>(); //tutaj bedzie ArrayLista
        jaha.add(13);
        jaha.add(25);
        jaha.add(44);
        jaha.add(20);
        jaha.add(19);

        OddNumbersExterminator x = new OddNumbersExterminator();

        System.out.println(x.exterminate(jaha));

    }
}
