/**
 * Title: Week 4 Project - Exception Handling
 * Name: Corey Potts
 * Date: 7/15/2025
 */
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        // Print project header
        System.out.println("\n-------------------------------------------------");
        System.out.println("Project Week 4 - Exception Handling");
        System.out.println("Name: Corey Potts");
        System.out.println("-------------------------------------------------\n");

        // Welcome and instructions
        System.out.println("Welcome to the Division Calculator");
        System.out.println("You can use this application to divide any two non-zero numbers");
        System.out.println("Type 'q' at any time to quit.\n");

        // Main loop function: continues until user types 'q' to quit
        while (keepRunning) {
            try {
                // Prompt user for first number
                System.out.print("Enter the first number (or 'q' to quit): ");
                String input1 = scanner.nextLine();
                if (input1.equalsIgnoreCase("q")) break;

                double num1 = Double.parseDouble(input1);

                // Prompt user for second number
                double num2;
                while (true) {
                    System.out.print("Enter the second number (or 'q' to quit): ");
                    String input2 = scanner.nextLine();
                    if (input2.equalsIgnoreCase("q")) {
                        keepRunning = false;
                        break;
                    }

                    // Check for division by zero
                    try {
                        num2 = Double.parseDouble(input2);
                        if (num2 == 0) {
                            System.out.println("Division by zero is not allowed. Please enter a non-zero number.");
                        } else {
                            // Calculate and display result
                            double result = num1 / num2;
                            System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                            break;
                        }
                    } catch (NumberFormatException e) {
                        // Exception for when user enters invalid value for first number
                        System.out.println("Invalid input. Please enter a valid number.\n");
                    }
                }

            } catch (NumberFormatException e) {
                // Exception for when user enters invalid value for second number
                System.out.println("Invalid input. Please enter a valid number.\n");
            }
        }

        // Closing message
        System.out.println("Thank you for using the Division Calculator. Goodbye.");
        scanner.close();
    }
}
