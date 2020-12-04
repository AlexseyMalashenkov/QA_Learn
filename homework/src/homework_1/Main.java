package homework_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Logic.Operations operations;

        System.out.println("Введите оператор. Список операторов:\n+ - * /");

        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                System.out.println("Вы выбрали плюс");
                operations = Logic.Operations.PLUS;
                break;
            case "-":
                System.out.println("Вы выбрали минус");
                operations = Logic.Operations.MINUS;
                break;
            case "*":
                System.out.println("Вы выбрали умножить");
                operations = Logic.Operations.MULTIPLY;
                break;
            case "/":
                System.out.println("Вы выбрали разделить");
                operations = Logic.Operations.DIVISION;
                break;
            default:
                System.err.println("Вы выбрали не правильный оператор. Попробуйте ещё раз.");
                return;
        }

        System.out.println("Введите два числа");

        try {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            Logic logic = new Logic(x, y);

            System.out.println(logic.countOperation(operations));
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}
