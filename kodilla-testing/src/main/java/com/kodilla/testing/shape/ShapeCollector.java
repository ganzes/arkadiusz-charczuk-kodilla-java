package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


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


    ArrayList <Shape> x = new ArrayList<Shape>();

    public void addFigure(Shape shape){//dodaj figure | metody nei wiedza co jest w srodku w obrebie danej klasy i tyczy sie kazdej metody w klasie
        x.add(shape);//(Shape shape) < Shape moze byc obojetnie co, obojetnie jaka nazwa

    }

    public void removeFigure(Shape shape){//usun figure
        x.remove(shape);
    }

    public Shape getFigure(int n){//wez figure
        return x.get(n);//musi byc n, bo z metody przekazuje do metody w tej liscie | definiuje indeks n i pozniej z listy chce obiekt o danym indeksie
    }

    public ArrayList <Shape> showFigures(){
        return x;
    }


}
