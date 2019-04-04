package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {//Utwórz klasę ShapeCollector z metodami:
    // addFigure(Shape shape), removeFigure(Shape shape), getFigure(int n)
    // oraz showFigures().

    private ArrayList<Shape> kolekcjaFigur = new ArrayList<>();//Klasa ta przechowuje figury geometryczne w kolekcji ArrayList.

    public ArrayList<Shape> getFiguresCollection() {
        return kolekcjaFigur;
    }

    public void addFigure(Shape shape){
        kolekcjaFigur.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return kolekcjaFigur.remove(shape);
    }

    public Shape getFigure(int n){
        if(n<kolekcjaFigur.size() && n>=0){
            return kolekcjaFigur.get(n);
        } else {
            return null;
        }
    }

    public void showFigures(){
        System.out.println(kolekcjaFigur.toString());
    }
}



/*
    private ArrayList <Shape> figury = new ArrayList<>();

    public ShapeCollector(){
    }

    public void addFigure(Shape figury){//dodaj figure | metody nei wiedza co jest w srodku w obrebie danej klasy i tyczy sie kazdej metody w klasie
        //(Shape shape) < Shape moze byc obojetnie co, obojetnie jaka nazwa
        Shape circle11 = new Circle(54);
        figury.add(circle11);


    }

    public boolean removeFigure(Shape figury){//usun figure
        boolean result = false;
        if (figury.contains(circle11)){
            figury.remove(circle11);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){//wez figure
        Shape theShape = null;
        if (n >= 0 && n < figury.size()) {
            theShape = figury.get(n);
        }
        return theShape;
    }

    public int showFigures(){
        return figury.size();
    }


}

*/

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