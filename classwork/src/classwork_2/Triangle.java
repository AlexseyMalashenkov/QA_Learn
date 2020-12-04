package classwork_2;

public class Triangle extends Figure implements Areas {

    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double square() {
        return (super.a * super.b * 0.5);
    }
}
