package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public final class Triangle extends Figure {
    private double c;

    public Triangle(final double a, final double b, final double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(final double a) {
        super(a, a);
        this.c = a;
    }

    @Override
    public double area() {
        double p = (getA() + getB() + c) / 2;
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - c));
    }
}
