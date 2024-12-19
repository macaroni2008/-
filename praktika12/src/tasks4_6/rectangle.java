package tasks4_6;

public class rectangle extends geometricobject {
    private double width;
    private double height;

    public rectangle() {
    }

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "прямоугольник со сторонами  " + width + " и " + height + ", площадью " + getArea() + " и периметром " + getPerimeter();
    }
}