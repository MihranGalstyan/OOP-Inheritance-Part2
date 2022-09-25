import models.Rect;
import models.Triangle;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        Rect rect = new Rect(2, 3);
        Triangle triangle = new Triangle(7, 4, 8);

        System.out.println(rect.area());
        System.out.println(triangle.area());
    }
}
