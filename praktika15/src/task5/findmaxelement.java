package task5;

public class findmaxelement {
    public static <E extends Comparable<E>> E findMax(E[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        E max = array[0];
        for (E element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        circle[] circles = {
                new circle(1.5),
                new circle(2.3),
                new circle(0.9),
                new circle(3.7)
        };

        circle maxCircle = findMax(circles);
        System.out.println("Circle with the largest radius: " + maxCircle);
    }
}