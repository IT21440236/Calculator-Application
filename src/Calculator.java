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

        int choice = input.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double result = 0;
        String operator = "";

        switch (choice) {
            case 1:
                result = num1 + num2;
                operator = "+";
                break;
            case 2:
                result = num1 - num2;
                operator = "-";
                break;
            case 3:
                result = num1 * num2;
                operator = "*";
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
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
}
