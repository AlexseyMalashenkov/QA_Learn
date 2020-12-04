package classwork_2;

public class Circle extends Figure implements Areas {
    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(super.a, 2);
    }
}
