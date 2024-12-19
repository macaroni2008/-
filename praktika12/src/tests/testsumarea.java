package tests;

public class testsumarea {
    public static void main(String[] args) {

        geometricobject[] objects = {
                new circle(3.0),
                new circle(5.0),
                new rectangle(1.5, 5.0),
                new rectangle(2.0, 8.0)
        };

        double totalArea = sumArea(objects);

        System.out.println("Общая площадь всех объектов: " + totalArea);
    }

    public static double sumArea(geometricobject[] a) {
        double totalArea = 0;
        for (geometricobject obj : a) {
            totalArea += obj.getArea();
        }
        return totalArea;
    }
}