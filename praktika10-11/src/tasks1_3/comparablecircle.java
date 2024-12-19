package tasks1_3;

public class comparablecircle extends circle {

    public comparablecircle(double radius) {
        super(radius);
    }

    public boolean equals(Object obj) {
        return obj instanceof comparablecircle && getArea() == ((comparablecircle)obj).getArea();
    }
}