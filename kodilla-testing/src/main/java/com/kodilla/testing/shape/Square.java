package com.kodilla.testing.shape;

public class Square implements Shape {

    double side;

    String shapeName = "square";
    double field = side*side;

    public Square(double side) {
        this.side = side;
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