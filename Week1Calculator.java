/*
 * Title: Week 1 Project - Java Calculator
 * Name: Corey Potts
 * Date: 6/19/2025
 */
import java.util.Scanner;

public class Week1Calculator {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print project header
        System.out.println("-------------------------------------------------");
        System.out.println("Java Calculator");
        System.out.println("Name: Corey Potts");
        System.out.println("-------------------------------------------------\n");

        // Welcome and instructions
        System.out.println("Welcome to Java Calculator");
        System.out.println("You will be asked to enter two integers and two floating-point numbers.");
        System.out.println("The program will perform addition and subtraction respectively.");
        System.out.println("Type 'e' at any time to exit the program.\n");

        // Integer input and addition
        int int1 = getIntInput(scanner, "Enter the first integer: ");
        int int2 = getIntInput(scanner, "Enter the second integer: ");
        int intSum = int1 + int2;
        System.out.printf("Result: %d + %d = %d%n%n", int1, int2, intSum);

        // Floating-point input and subtraction
        double float1 = getDoubleInput(scanner, "Enter the first floating-point number: ");
        double float2 = getDoubleInput(scanner, "Enter the second floating-point number: ");
        double floatResult = float2 - float1;
        System.out.printf("Result: %.2f - %.2f = %.2f%n%n", float2, float1, floatResult);

        // Closing message
        System.out.println("Thank you for using Java Calculator. Goodbye");

        scanner.close();
    }

    // Method to get a valid integer input or exit
    private static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next();
            if (input.equalsIgnoreCase("e")) {
                System.out.println("Thank you for using Java Calculator. Goodbye");
                System.exit(0);
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer");
            }
        }
    }

    // Method to get a valid floating-point number input or exit
    private static double getDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next();
            if (input.equalsIgnoreCase("e")) {
                System.out.println("Thank you for using Java Calculator. Goodbye");
                System.exit(0);
            }
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a floating-point number");
            }
        }
    }
}
