package task5;

public class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        circle[] circles = {
                new circle(1.0),
                new circle(2.0),
                new circle(3.0),
                new circle(4.0),
                new circle(5.0)
        };

        int largestCircleIndex = 0;

        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getArea() > circles[largestCircleIndex].getArea()) {
                largestCircleIndex = i;
            }
        }

        System.out.println("Круг с самой большой площадью: " + (largestCircleIndex + 1));
    }
}