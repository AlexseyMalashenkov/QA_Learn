package homework_1;

public class Logic {

    public enum Operations {
        PLUS,
        MINUS,
        MULTIPLY,
        DIVISION
    }

    double x;
    double y;

    public Logic(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double countOperation(Operations operations) {
        switch (operations) {
            case PLUS:
                return this.x + this.y;
            case MINUS:
                return this.x - this.y;
            case MULTIPLY:
                return this.x * this.y;
            case DIVISION:
                return this.x / this.y;
            default:
                return 0;
        }
    }
}
