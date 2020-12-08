package classwork_2;

public class Square extends Figure implements Areas {
    private double height;
    private double width;

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
