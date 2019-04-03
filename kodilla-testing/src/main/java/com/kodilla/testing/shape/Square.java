package com.kodilla.testing.shape;

public class Triangle implements Shape{

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.base, base) != 0) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        if (Double.compare(triangle.getField(), getField()) != 0) return false;
        return getShapeName().equals(triangle.getShapeName());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(base);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getShapeName().hashCode();
        temp = Double.doubleToLongBits(getField());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
