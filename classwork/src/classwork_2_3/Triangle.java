package classwork_2_3;

public class Triangle extends Figure implements Areas {
    private double base1;
    private double height;
    private double base3;

    public Triangle(double base, double height) {
        this.base1 = base;
        this.height = height;
    }

    public Triangle(double first, double second, double third) {
        this.base1 = first;
        this.height = second;
        this.base3 = third;
    }

    @Override
    double perimeter() {
        return base1 + height + base3;
    }

    @Override
    public double square() {
        return (this.base1 * this.height * 0.5);
    }
}
