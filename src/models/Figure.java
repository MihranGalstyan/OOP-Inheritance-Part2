package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public abstract class Figure {
    private double a;
    private double b;

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }

    public Figure(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double area();
}
