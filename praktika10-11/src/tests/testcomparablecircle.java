package tests;

import tasks1_3.comparablecircle;
import tasks1_3.geometricobject;
import tasks1_3.rectangle;

public class testcomparablecircle {
    public static void main(String[] args) {

        comparablecircle comparableCircle1 = new comparablecircle(3.0);
        comparablecircle comparableCircle2 = new comparablecircle(4.2);

        geometricobject largestComparableCircle = geometricobject.max(comparableCircle1, comparableCircle2);
        System.out.println("Наибольший из двух кругов tasks1_3.comparablecircle: " + largestComparableCircle);

        comparablecircle circle = new comparablecircle(8.0);
        rectangle rectangle = new rectangle(5.0, 7.0);

        geometricobject largestShape = geometricobject.max(circle, rectangle);
        System.out.println("Наибольший объект между кругом и прямоугольником: " + largestShape);
    }
}