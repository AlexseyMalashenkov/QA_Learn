package classwork_2_3;

public class Square extends Figure implements Areas {
    private final double height;
    private final double width;

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double perimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public double square() {
        return this.height * this.width;
    }
}
