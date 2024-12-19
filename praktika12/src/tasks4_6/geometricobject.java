package tasks4_6;

public abstract class geometricobject implements comparable<geometricobject> {
    private String color = "красный";
    private boolean filled;
    private java.util.Date dateCreated;

    protected geometricobject() {
        dateCreated = new java.util.Date();
    }

    protected geometricobject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "создано " + dateCreated + "\nцвет: " + color +
                " заливка: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(geometricobject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    public static geometricobject max(geometricobject o1, geometricobject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }
}