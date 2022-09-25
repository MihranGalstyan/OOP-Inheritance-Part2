package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Rect extends Figure {
    public Rect(final double a, final double b) {
        super(a, b);
    }

    public Rect(final double a) {
        super(a, a);
    }

    @Override
    public double area() {
        return getA() * getB();
    }
}
