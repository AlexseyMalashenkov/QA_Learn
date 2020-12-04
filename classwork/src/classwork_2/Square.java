package classwork_2;

public class Square extends Figure implements Areas {
    public Square(double height, double weight) {
        super(height, weight);
    }

    @Override
    public double square() {
        return super.a * super.b;
    }
}
