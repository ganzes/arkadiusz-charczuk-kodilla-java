package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import stream.array.ArrayOperations;

public class ArrayOperationsTestSuite {
    @Test
    public void testgetAverage(){
        //Given
        int numbers [] = {12,13,14,2,3,4,5,6,7,34,12,12,13,14,15,23,14,12,13,20};//tablicę z przykładowymi
        // wartościami typu int

        //When
        double expectedAverage = 12.4;//sprawdź, czy obliczona średnia jest poprawna.

        //Then
        Assert.assertEquals(expectedAverage, ArrayOperations.getAverage(numbers), 0.1);//wywołać metodę
        // getAverage(int[] numbers) interfejsu ArrayOperations.
        //System.out.println("Średnia: " + ArrayOperations.getAverage(numbers));
    }

    @Test
    public void testgetAverage2(){
        //Given
        int numbers2 [] = {0};

        // wartościami typu int

        //When
        double expectedAverage2 = 0.0 ;//sprawdź, czy obliczona średnia jest poprawna.
        //Then
        Assert.assertEquals(expectedAverage2, ArrayOperations.getAverage2(numbers2), 0.1);//wywołać metodę
        // getAverage(int[] numbers) interfejsu ArrayOperations.
    }
}
