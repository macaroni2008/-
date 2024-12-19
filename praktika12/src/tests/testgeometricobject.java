package tests;

public class testgeometricobject {
    public static void main(String[] args) {

        geometricobject geoObject1 = new circle(5);
        geometricobject geoObject2 = new rectangle(10, 3);

        System.out.println("Одинаковая ли площадь у двух фигур? " +
                equalArea(geoObject1, geoObject2));

        displayGeometricObject(geoObject1);

        displayGeometricObject(geoObject2);
    }

    public static boolean equalArea(geometricobject object1,
                                    geometricobject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(geometricobject object) {
        System.out.println();
        System.out.println("Площадь равна " + object.getArea());
        System.out.println("Периметр равен " + object.getPerimeter());
    }

}