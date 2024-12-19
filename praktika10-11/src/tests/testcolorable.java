package tests;

import tasks1_3.*;

public class testcolorable {
    public static void main(String[] args) {
        geometricobject[] objects = {
                new circle(6.0),
                new rectangle(5.0, 8.0),
                new square(3.5),
                new comparablerectangle(6.0, 7.0),
                new square(8.0)
        };

        for (geometricobject obj : objects) {
            System.out.println(obj);
            System.out.println("Площадь: " + obj.getArea());

            if (obj instanceof colorable) {
                ((colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}