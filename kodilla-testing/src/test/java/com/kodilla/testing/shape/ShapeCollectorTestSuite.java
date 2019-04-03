package com.kodilla.testing.shape;

import org.junit.*;

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

        System.out.println("Przygotowanie do rozpoczecia testu #" + testCounter);
    }

    @Test
    public void testaddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("kolko","kwadrat","trojkat");
        //When
        shapeCollector.addFigure(new Circle(54));

        //Then
        Assert.assertEquals(1, shapeCollector.showFigures());
    }

    @Test
    public void testremoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("circle", "sqare", "traingle");

        shapeCollector.removeFigure(new Circle(54));

        //When
        boolean result = shapeCollector.removeFigure(new Circle(54));

        //Then
        Assert.assertEquals(0, shapeCollector.showFigures());
    }

    @Test
    public void testgetFigure() {
        //Given
        ShapeCollector dodacElement = new ShapeCollector("kolko","kwadrat","trojkat");
        Circle aTerazGoPobrac = new Circle(4);
        Circle aTerazGoPobrac2 = new Circle(5);
        Circle aTerazGoPobrac3 = new Circle(6);

        dodacElement.addFigure(aTerazGoPobrac);
        dodacElement.addFigure(aTerazGoPobrac2);
        dodacElement.addFigure(aTerazGoPobrac3);

        //When
        Shape zostaniePobranyElement;
        zostaniePobranyElement = dodacElement.getFigure(0);

        //Then
        Assert.assertEquals(aTerazGoPobrac, zostaniePobranyElement);
    }

    @Test
    public void testshowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("circle", "sqare", "traingle");
        //When
        shapeCollector.addFigure(new Circle(54));
        //Then
        Assert.assertEquals(1, shapeCollector.showFigures());
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