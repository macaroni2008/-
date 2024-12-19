package tasks1_3;

public class circle extends geometricobject {
    private double radius;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом " + radius + ", площадью " + getArea() + " и периметром " + getPerimeter();
    }
}