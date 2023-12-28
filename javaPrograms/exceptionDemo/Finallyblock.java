package exceptionDemo;

public class Finallyblock {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch and handle the exception
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Code in the finally block will always be executed
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int numerator, int denominator) {
        // Code that may throw an ArithmeticException
        return numerator / denominator;
    }
}