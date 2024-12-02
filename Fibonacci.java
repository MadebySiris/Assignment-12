public class Fibonacci {
    // Recursive Fibonacci: Simple but slower method
    public static int fibonacciRecursive(int n) {
        // If number is 0 or 1, return the number itself
        if (n <= 1) {
            return n;
        }
        
        // Add the two previous numbers to get the current number
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci: Faster method that uses a loop
    public static int fibonacciIterative(int n) {
        // If number is 0 or 1, return the number itself
        if (n <= 1) {
            return n;
        }
        
        // Start with the first two Fibonacci numbers
        int a = 0;  // First number
        int b = 1;  // Second number
        int result = 0;
        
        // Loop to calculate Fibonacci number
        for (int i = 2; i <= n; i++) {
            result = a + b;  // New number is sum of previous two
            a = b;           // Shift numbers
            b = result;      // Update second number
        }
        
        return result;
    }

    // Main method to test and show results
    public static void main(String[] args) {
        System.out.println("Recursive Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.println("F(" + i + ") = " + fibonacciRecursive(i));
        }
        
        System.out.println("\nIterative Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.println("F(" + i + ") = " + fibonacciIterative(i));
        }
    }
}
