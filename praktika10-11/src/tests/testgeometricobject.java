package tests;

import tasks1_3.circle;
import tasks1_3.geometricobject;
import tasks1_3.rectangle;

public class testgeometricobject {
    public static void main(String[] args) {

        circle circle1 = new circle(5.0);
        circle circle2 = new circle(10.0);

        geometricobject largestCircle = geometricobject.max(circle1, circle2);
        System.out.println("Наибольший круг: " + largestCircle);

        rectangle rectangle1 = new rectangle(8.0, 3.5);
        rectangle rectangle2 = new rectangle(7.0, 5.0);

        geometricobject largestRectangle = geometricobject.max(rectangle1, rectangle2);
        System.out.println("Наибольший прямоугольник: " + largestRectangle);
    }
}