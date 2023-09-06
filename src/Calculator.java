import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Choose an operation (1/2/3/4): ");

        int choice = 0;
        double num1 = 0;
        double num2 = 0;

        try {
            choice = input.nextInt();

            System.out.print("Enter the first number: ");
            num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            num2 = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            System.exit(1);
        }

        double result = 0;
        String operator = "";

        switch (choice) {
            case 1:
                result = addition(num1, num2);
                operator = "+";
                break;
            case 2:
                result = subtraction(num1, num2);
                operator = "-";
                break;
            case 3:
                result = multiplication(num1, num2);
                operator = "*";
                break;
            case 4:
                if (num2 != 0) {
                    result = division(num1, num2);
                    operator = "/";
                } else {
                    System.out.println("Error: Division by zero");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(1);
        }

        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }
}
