package classwork_2_3;

public class Circle extends Figure implements Areas {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
