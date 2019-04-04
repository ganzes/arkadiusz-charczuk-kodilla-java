package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    private ShapeCollector x; //zdefiniowal ShapeCollector
    // | w tej klasie mam ShapeCollector i nazywam go x | mam pole ShapeCollector o nazwie x
    //odnosi sie do ShapeCollector > ArrayList <Shape> x = new ArrayList<Shape>();

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Poczatek testow masla maslanego");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("Koniec testow masla maslanego");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;

        System.out.println("Przygotowanie do rozpoczecia testu maselka maslanego #" + testCounter);
    }

    @Test
    public void testaddFigure() {
        //Given
        ShapeCollector masloMaslane = new ShapeCollector();//masloMaslane posiada wlasciwosci ShapeCollector
        //When
        masloMaslane.addFigure(new Circle(54));//wiec dodaje obiekty - tutaj, dodaje kolko

        //Then
        Assert.assertEquals(1, masloMaslane.getFiguresCollection().size());//wiec biore rozmiar listy i porownuje
    }

    @Test
    public void testremoveFigure() {
        //Given
        ShapeCollector masloMaslane = new ShapeCollector();

        masloMaslane.addFigure(new Circle(54));//dodaje, bo musze cos usunac

        //When
        boolean result = masloMaslane.removeFigure(new Circle(54));//usowam dodany obiekt

        //Then
        Assert.assertEquals(0, masloMaslane.getFiguresCollection().size());//porownuje z rozmiarem maslaMaslanego
    }

    @Test
    public void testgetFigure() {
        //Given
        ShapeCollector masloMaslane = new ShapeCollector();
        Shape circle = new Circle(54);//
        masloMaslane.addFigure(circle);//do maselka dodaje obierkt circle

        //When
        Shape circles1 = masloMaslane.getFigure(0);//wiec skoro dodalem obiekt circle, to
        //Then
        Assert.assertEquals(circle,circles1);
    }

    @Test
    public void testshowFigures() {
        //Given
        ShapeCollector masloMaslane = new ShapeCollector();
        Shape shape = new Circle(54);
        masloMaslane.addFigure(shape);

        ArrayList<Shape> newList = new ArrayList<>();
        newList.add(shape);

        //When
        List<Shape> shapesList = masloMaslane.getFiguresCollection();
        //Then
        Assert.assertEquals(newList.toString(), shapesList.toString());
    }


}

/*
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    private ShapeCollector x; //zdefiniowal ShapeCollector
    // | w tej klasie mam ShapeCollector i nazywam go x | mam pole ShapeCollector o nazwie x
    //odnosi sie do ShapeCollector > ArrayList <Shape> x = new ArrayList<Shape>();

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Poczatek testu");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("Koniec testow.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;

        x = new ShapeCollector();

        x.addFigure(new Circle(2));
        x.addFigure(new Square(4));
        x.addFigure(new Triangle(1, 5));

        System.out.println("Przygotowanie do rozpoczecia testu #" + testCounter);
    }

    @Test
    public void testaddFigure() {
        //Given
        ArrayList <Shape> start = x.showFigures();
        start.add(new Circle(54));
        //When
        x.addFigure(new Circle(54));
        //double result = (double) x.showFigures();
        //Then
        Assert.assertArrayEquals(start.toArray(), x.showFigures().toArray());//deprecated = przestarzala metoda
        //metoda przyjmmuje tablice, a nie liste, wiec trzeba przekonwertowac > cast | Array to jest tablica
    }

    @Test
    public void testremoveFigure() {
        //Given
        ArrayList <Shape> start = x.showFigures();
        start.remove(new Square(4));
        //When
        x.removeFigure(new Square(4));
        //double result = (double) x.showFigures();
        //Then
        Assert.assertArrayEquals(start.toArray(), x.showFigures().toArray());//deprecated = przestarzala metoda
        //metoda przyjmmuje tablice, a nie liste, wiec trzeba przekonwertowac > cast
    }

    @Test
    public void testgetFigure() {
        //Given
        ArrayList <Shape> start = x.showFigures();
        Shape tJakTatedusz = start.get(2);
        //When
        Shape z = x.getFigure(2);
        //Then
        Assert.assertEquals(tJakTatedusz, z);//tu tylko sprawdzam obiekty, a nie tablice, wiec nie trzeba bylo
        //przekonwertowac
    }

    @Test
    public void testshowFigures() {
        //Given
        ArrayList <Shape> start = x.showFigures();
        //When

        //Then
        Assert.assertArrayEquals(start.toArray(), x.showFigures().toArray());
    }
}
 */