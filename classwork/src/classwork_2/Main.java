package classwork_2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5);
        System.out.println("Square of triangle = " + triangle.square());

        Triangle triangle1 = new Triangle(4, 5, 6);
        System.out.println("Perimeter of triangle = " + triangle1.perimeter());

        Square square = new Square(5,5);
        System.out.println("Square of square = " + square.square());
        System.out.println("Perimeter of square = " + square.perimeter());

        Circle circle = new Circle(4);
        System.out.println("Square of circle = " + circle.square());
        System.out.println("Perimeter of circle = " + circle.perimeter());
    }
}
