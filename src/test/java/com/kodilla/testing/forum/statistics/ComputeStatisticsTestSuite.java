package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ComputeStatisticsTestSuite {
    private Statistics statisticsMock;
    private ComputeStatistics computeStatistics;

    @Before
    public void beforeTest() {
        statisticsMock = mock(Statistics.class);//w tej linii tworzony jest mock interfejsu statistics, gdzie
        //tym zmiennerj | nazwa zmiennej | = wywołanie metody mock klasy Mockito | (interfejs lub klasa. | wywolanie deskryptora klasy lub interfejsu
        List<String> listMock = new ArrayList<>();//lista uzytkownikow w postaci listyMock

        for (int i = 0; i < 10; i++) {//ustawiam sobie tutaj liczbe uzytkownikow
            listMock.add("Users");
        }

        when(statisticsMock.usersNames()).thenReturn(listMock);//zwraca mi liste uzytkownikow na podstawie size obiektow listy listMock
        when(statisticsMock.postsCount()).thenReturn(0);//zwraca mi liczbe postow
        when(statisticsMock.commentsCount()).thenReturn(0);//zwraca mi liczbe komentarzy
        computeStatistics = new ComputeStatistics();
    }

    //Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:
    @Test
    public void testZeroPosts() {//gdy liczba postow 0
        //Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listMock.add("Users");
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);//dla 10 uzytkownikow
        when(statisticsMock.postsCount()).thenReturn(0);// dla 0 postow
        when(statisticsMock.commentsCount()).thenReturn(10);//dla 10 komentarzy
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, computeStatistics.getAverageCommentsPosts(), 0.01);//srednia komentarzy z postami
        assertEquals(1.0, computeStatistics.getAverageCommentsUsers(), 0.01);//srednia komentarzy z userami
        assertEquals(0, computeStatistics.getAveragePostsUsers(), 0.01);//srednia postow z userami
    }

    @Test
    public void testThousandPosts() {//gdy liczba postow 1000
        //Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listMock.add("Users");
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);//dla 10 uzytkownikow
        when(statisticsMock.postsCount()).thenReturn(1000);// dla 1000 postow
        when(statisticsMock.commentsCount()).thenReturn(10);//dla 10 komentarzy
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, computeStatistics.getAverageCommentsPosts(), 0.01);//srednia komentarzy z postami
        assertEquals(1.0, computeStatistics.getAverageCommentsUsers(), 0.01);//srednia komentarzy z userami
        assertEquals(100.0, computeStatistics.getAveragePostsUsers(), 0.01);//srednia postow z userami
    }

    @Test
    public void testZeroComments() {//gdy 0 komentarzy
        //Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listMock.add("Users");
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);//dla 10 uzytkownikow
        when(statisticsMock.postsCount()).thenReturn(0);// dla 0 postow
        when(statisticsMock.commentsCount()).thenReturn(0);//dla 0 komentarzy
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, computeStatistics.getAverageCommentsPosts(), 0.01);//srednia komentarzy z postami
        assertEquals(0, computeStatistics.getAverageCommentsUsers(), 0.01);//srednia komentarzy z userami
        assertEquals(0, computeStatistics.getAveragePostsUsers(), 0.01);//srednia postow z userami
    }

    @Test
    public void testCommentsLessThanPosts() {//gdy komentarzy mniej niz postow
        //Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listMock.add("Users");
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);//dla 10 uzytkownikow
        when(statisticsMock.postsCount()).thenReturn(8);// dla 8 postow
        when(statisticsMock.commentsCount()).thenReturn(4);//dla 4 komentarzy
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0.5, computeStatistics.getAverageCommentsPosts(), 0.01);//srednia komentarzy z postami
        assertEquals(0.4, computeStatistics.getAverageCommentsUsers(), 0.01);//srednia komentarzy z userami
        assertEquals(0.8, computeStatistics.getAveragePostsUsers(), 0.01);//srednia postow z userami
    }

    @Test
    public void testCommentsMoreThanPosts() {//gdy komentrzy wiecej niz postow
        //Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listMock.add("Users");
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);//dla 10 uzytkownikow
        when(statisticsMock.postsCount()).thenReturn(8);// dla 8 postow
        when(statisticsMock.commentsCount()).thenReturn(12);//dla 12 komentarzy
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1.5, computeStatistics.getAverageCommentsPosts(), 0.01);//srednia komentarzy z postami
        assertEquals(1.2, computeStatistics.getAverageCommentsUsers(), 0.01);//srednia komentarzy z userami
        assertEquals(0.8, computeStatistics.getAveragePostsUsers(), 0.01);//srednia postow z userami
    }

    @Test
    public void testZeroUsers() {//gdy zero uzytkownikow
        //Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i <= 0; i++) {
            listMock.add("Users");
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);//dla 0 uzytkownikow
        when(statisticsMock.postsCount()).thenReturn(8);// dla 8 postow
        when(statisticsMock.commentsCount()).thenReturn(12);//dla 12 komentarzy
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1.5, computeStatistics.getAverageCommentsPosts(), 0.01);//srednia komentarzy z postami
        assertEquals(12, computeStatistics.getAverageCommentsUsers(), 0.01);//srednia komentarzy z userami
        assertEquals(8.0, computeStatistics.getAveragePostsUsers(), 0.01);//srednia postow z userami
    }

    @Test
    public void testOnehundredUsers() {//gdy 100 uzytkownikow
        //Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listMock.add("Users");
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);//dla 0 uzytkownikow
        when(statisticsMock.postsCount()).thenReturn(8);// dla 8 postow
        when(statisticsMock.commentsCount()).thenReturn(12);//dla 12 komentarzy
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1.5, computeStatistics.getAverageCommentsPosts(), 0.01);//srednia komentarzy z postami
        assertEquals(0.12, computeStatistics.getAverageCommentsUsers(), 0.01);//srednia komentarzy z userami
        assertEquals(0.08, computeStatistics.getAveragePostsUsers(), 0.01);//srednia postow z userami
    }
}