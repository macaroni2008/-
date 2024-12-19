package tasks1_3;

public class comparablerectangle extends rectangle {

    public comparablerectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof comparablerectangle && getArea() == ((comparablerectangle)obj).getArea();
    }
}