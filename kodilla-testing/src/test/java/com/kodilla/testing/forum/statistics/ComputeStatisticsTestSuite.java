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
    public void beforeTest(){
        statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();

        for (int i=0; i<10; i++){
            listMock.add("Users");
        }
        when(statisticsMock.usersNames().thenReturn(listMock));
        when(statisticsMock.postsCount().thenReturn(50));
        when(statisticsMock.commentsCount().thenReturn(100));
        computeStatistics = new ComputeStatistics();

    }
    @Test
    public void testZeroPosts(){//gdy liczba postow 0
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, computeStatistics.getPostsQuantity());
        assertEquals(0, computeStatistics.getPostsQuantity());
        assertEquals(0, computeStatistics.getCommentsQuantity());
    }

    @Test
    public void testThousandPosts(){//gdy liczba postow 1000
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, computeStatistics.getPostsQuantity());
        assertEquals(100, computeStatistics.getAveragePostsUsers());
        assertEquals(0.08, computeStatistics.getAverageCommentsPosts());
    }

    @Test
    public void testZeroComments(){//gdy 0 komentarzy
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, computeStatistics.getCommentsQuantity());
        assertEquals(0, computeStatistics.getAverageCommentsUsers());
        assertEquals(0, computeStatistics.getAverageCommentsPosts());
    }

    @Test
    public void testCommentsLessThanPosts(){//gdy komentarzy mniej niz postow
        //Given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(2);
        //When
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2, computeStatistics.getPostsQuantity());
        assertEquals(10, computeStatistics.getCommentsQuantity());
        assertEquals(0, computeStatistics.getAveragePostsUsers());
        assertEquals(0, computeStatistics.getAverageCommentsUsers());
        assertEquals(0, computeStatistics.getAverageCommentsPosts());
    }

    @Test
    public void testCommentsMoreThanPosts(){//gdy komentrzy wiecej niz postow
        //Given

        //When
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, computeStatistics.getPostsQuantity());
        assertEquals(0, computeStatistics.getCommentsQuantity());
        assertEquals(0, computeStatistics.getAveragePostsUsers());
        assertEquals(0, computeStatistics.getAverageCommentsUsers());
        assertEquals(0, computeStatistics.getAverageCommentsPosts());
    }

    @Test
    public void testZeroUsers(){//gdy zero uzytkownikow
        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, computeStatistics.getUsersQuantity());
        assertEquals(0, computeStatistics.getAveragePostsUsers());
        assertEquals(0, computeStatistics.getAverageCommentsUsers());

    }

    @Test
    public void testOnehundredUsers(){//gdy 100 uzytkownikow
        //Given
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("Users");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        computeStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, computeStatistics.getUsersQuantity());
        assertEquals(0, computeStatistics.getAveragePostsUsers());
        assertEquals(0, computeStatistics.getAverageCommentsUsers());
    }
}