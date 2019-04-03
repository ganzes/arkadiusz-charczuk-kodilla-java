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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (Double.compare(square.side, side) != 0) return false;
        if (Double.compare(square.getField(), getField()) != 0) return false;
        return getShapeName().equals(square.getShapeName());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(side);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getShapeName().hashCode();
        temp = Double.doubleToLongBits(getField());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}