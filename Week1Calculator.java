/*
 * Title: Week 1 Project - Java Calculator
 * Name: Corey Potts
 * Date: 6/17/2025
 */

import java.util.Scanner;

public class Week1Calculator {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        // Print project header
        System.err.println("-------------------------------------------------");
        System.out.println("Java Calculator");
        System.out.println("Name: Corey Potts");
        System.out.println("-------------------------------------------------");
        System.out.println();

        // Welcome and instructions
        System.out.println("Welcome to Java Calculator");
        System.out.println("You will be asked to enter two integers and two floating-point numbers.");
        System.out.println("The program will perform addition and subtraction respectively.");
        System.out.println();

        // Scan user input
        Scanner scanner = new Scanner(System.in);
        
        // Integer operation
        System.out.print("Enter the first integer: ");
        int int1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int int2 = scanner.nextInt();
        
        int intSum = int1 + int2;
        System.out.printf("Result: %d + %d = %d%n", int1, int2, intSum);
        System.out.println();
        
        // Floating-point operation
        System.out.print("Enter the first floating-point number: ");
        double float1 = scanner.nextDouble();
        
        System.out.print("Enter the second floating-point number: ");
        double float2 = scanner.nextDouble();
        
        double floatResult = float2 - float1;
        System.out.printf("Result: %.2f - %.2f = %.2f%n", float2, float1, floatResult);
        System.out.println();
        
        // Closing message
        System.out.println("Thank you for using Java Calculator. Goodbye");
        
        // Close scanner
        scanner.close();
    }
}