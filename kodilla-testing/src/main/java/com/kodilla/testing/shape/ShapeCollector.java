package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private String circleName;
    private String squareName;
    private String triangleName;
    private ArrayList <Shape> circles = new ArrayList<Shape>();
    private ArrayList <Shape> squares = new ArrayList<Shape>();
    private ArrayList <Shape> triangles = new ArrayList<Shape>();

    public ShapeCollector(String circleName, String squareName, String triangleName){
        //nazwa figury 1
        this.circleName = circleName;
        //nazwa figury 2
        this.squareName = squareName;
        //nazwa figury 3
        this.triangleName = triangleName;
    }

    public void addFigure(Shape circle){//dodaj figure | metody nei wiedza co jest w srodku w obrebie danej klasy i tyczy sie kazdej metody w klasie
        //(Shape shape) < Shape moze byc obojetnie co, obojetnie jaka nazwa
        Shape circle11 = new Circle(54);
        circles.add(circle11);
    }

    public boolean removeFigure(Shape circle11){//usun figure
        boolean result = false;
        if (circles.contains(circle11)){
            circles.remove(circle11);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){//wez figure
        Shape theShape = null;
        if (n >= 0 && n < circles.size()) {
            theShape = circles.get(n);
        }
        return theShape;
    }

    public int showFigures(){
        return circles.size();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShapeCollector)) return false;

        ShapeCollector that = (ShapeCollector) o;

        if (!circleName.equals(that.circleName)) return false;
        if (!squareName.equals(that.squareName)) return false;
        if (!triangleName.equals(that.triangleName)) return false;
        if (!circles.equals(that.circles)) return false;
        if (!squares.equals(that.squares)) return false;
        return triangles.equals(that.triangles);

    }

    @Override
    public int hashCode() {
        int result = circleName.hashCode();
        result = 31 * result + squareName.hashCode();
        result = 31 * result + triangleName.hashCode();
        result = 31 * result + circles.hashCode();
        result = 31 * result + squares.hashCode();
        result = 31 * result + triangles.hashCode();
        return result;
    }
}



//Klasa ta przechowuje figury geometryczne w kolekcji ArrayList.
// Figury są następujące: kwadrat, koło, trójkąt (oczywiście użyj angielskich nazw klas).
//Tworzenie obiektów, figur, z przypisanymi wartościami:
    /*Circle circle1 = new Circle(10);
    Square square1 = new Square(4);
    Triangle triangle1 = new Triangle(2, 10);

    Circle circle2 = new Circle(10);
    Square square2 = new Square(4);
    Triangle triangle2 = new Triangle(2, 10);

    Circle circle3 = new Circle(10);

    //Utworzenie kolekcji zawierającej powyższe figury:

    public void something () {
    ArrayList <Shape> x = new ArrayList<Shape>();
    x.add((Shape) circle1);
    x.add((Shape) square1);
    x.add((Shape) triangle1);
    x.add((Shape) circle2);
    x.add((Shape) square2);
    x.add((Shape) triangle2);
    }
    tak sie nie robi, bo gdybym uzyl tej klasy gdziekolwiek indziej, to zawsze mialbym te obiekty, wiec to bez sensu
*/