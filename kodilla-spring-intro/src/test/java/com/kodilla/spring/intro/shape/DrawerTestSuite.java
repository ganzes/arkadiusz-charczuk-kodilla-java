package com.kodilla.spring.intro.shape;

import com.kodilla.spring.intro.com.kodilla.spring.intro.shape.Circle;
import com.kodilla.spring.intro.com.kodilla.spring.intro.shape.Drawer;
import com.kodilla.spring.intro.com.kodilla.spring.intro.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {

    //W kodzie testów tworzymy obiekty triangle oraz circle,
    // które następnie wstrzykujemy przez konstruktor do obiektu drawer.
    @Test
    public void testDoDrawningWithCircle(){
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawning();
        //Then
        Assert.assertEquals("This is a circle", result);
    }

    @Test
    public void testDoDrawningWithTriangle(){
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawning();
        //Then
        Assert.assertEquals("This is a triangle", result);
    }
}