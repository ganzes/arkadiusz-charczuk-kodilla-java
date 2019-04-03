package com.kodilla.testing.shape;

public class Circle implements Shape {

    double radius;

    String shapeName = "circle";
    double field = (radius * radius) * Math.PI;

    public Circle(double radius) {
        this.radius = radius;
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