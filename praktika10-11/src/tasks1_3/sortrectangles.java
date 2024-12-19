package tasks1_3;

public class sortrectangles {
    public static void main(String[] args) {
        comparablerectangle[] rectangles = {
                new comparablerectangle(5.0, 5.0),
                new comparablerectangle(15.0, 55.0),
                new comparablerectangle(10.0, 35.0),
                new comparablerectangle(1.5, 30.0)};
        java.util.Arrays.sort(rectangles);
        for (rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}