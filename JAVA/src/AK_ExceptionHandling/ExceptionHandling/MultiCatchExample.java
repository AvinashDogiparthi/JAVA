package AK_ExceptionHandling.ExceptionHandling;

import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter denominator: ");
            int denominator = Integer.parseInt(scanner.nextLine());

            int result = numerator / denominator; // Might throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("This block always executes (e.g., cleanup tasks).");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}


