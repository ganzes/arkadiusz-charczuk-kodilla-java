package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianTest(){
        //Given
        Set<Book> testSetBooks = new HashSet<>();
        testSetBooks.add(new Book("TestAuthor01", "TestTitle01", 1999, "TA01"));
        testSetBooks.add(new Book("TestAuthor02", "TestTitle02", 2010, "TA02"));
        testSetBooks.add(new Book("TestAuthor03", "TestTitle03", 1960, "TA03"));
        testSetBooks.add(new Book("TestAuthor04", "TestTitle04", 2019, "TA04"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int medianSB = medianAdapter.publicationYearMedian(testSetBooks);
        //Then
        assertEquals(2010, medianSB);
    }

    @Test
    public void testAveragePublicationYear(){
        //Given
        Set<Book> testSetBooks = new HashSet<>();
        testSetBooks.add(new Book("TestAuthor01", "TestTitle01", 1999, "TA01"));
        testSetBooks.add(new Book("TestAuthor02", "TestTitle02", 2010, "TA02"));
        testSetBooks.add(new Book("TestAuthor03", "TestTitle03", 1960, "TA03"));
        testSetBooks.add(new Book("TestAuthor04", "TestTitle04", 2019, "TA04"));
        //When
        MedianAdapter averagePublicationYear = new MedianAdapter();
        int averagePYResult = averagePublicationYear.averagePublicationYearClassifier(testSetBooks);
        //Then
        assertEquals(1997, averagePYResult);
    }
}
