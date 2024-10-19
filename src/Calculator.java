import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення першого числа
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Введення другого числа
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Вибір операції
        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Виконання обраної операції
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Mistake: you can't divide on 0");
                }
                break;
            default:
                System.out.println("Unknown option");
                break;
        }

        scanner.close();
    }
}