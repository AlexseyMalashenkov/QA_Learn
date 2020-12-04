package classwork_2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5);
        System.out.println(triangle.square());

        Square square = new Square(5,5);
        System.out.println(square.square());

        Circle circle = new Circle(4);
        System.out.println(circle.square());
    }
}
