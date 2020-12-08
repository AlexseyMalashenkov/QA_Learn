package classwork_2;

public class Triangle extends Figure implements Areas {
    private double base;
    private double height;
    private double weight;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double first, double second, double third) {
        this.base = first;
        this.height = second;
        this.weight = third;
    }

    @Override
    double perimeter() {
        return base + height + weight;
    }

    @Override
    public double square() {
        return (this.base * this.height * 0.5);
    }
}
