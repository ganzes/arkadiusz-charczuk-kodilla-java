package com.kodilla.patterns.prototype.library;

public class Prototype<X> implements Cloneable {
    @Override
    public X clone() throws CloneNotSupportedException {
        return (X) super.clone();
    }
}
