package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class ColorRect extends Rect{
    private String color;

    public ColorRect(final double a, final double b, final String color) {
        super(a, b);
        this.color = color;
    }

    public ColorRect(final double a, final String color) {
        super(a);
        this.color = color;
    }
}
