package com.kodilla.testing.shape;

public class Triangle implements Shape{//Utwórz klasy reprezentujące poszczególne figury —
    // posiadające już właściwe implementacje metod interfejsu.

    double base;
    double height;

    String shapeName = "triangle";
    double field = (base*height)/2;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
    return shapeName;
    }

    @Override
    public double getField() {
    return field;
    }
}
