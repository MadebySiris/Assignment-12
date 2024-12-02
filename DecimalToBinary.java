public class DecimalToBinary {
    // Recursive method to convert decimal to binary
    public static String decimalToBinaryRecursive(int n) {
        // Base case: if number is 0 or 1, return as string
        if (n <= 1) {
            return String.valueOf(n);
        }
        
        // Recursive case: divide by 2 and add remainder
        return decimalToBinaryRecursive(n / 2) + (n % 2);
    }

    // Iterative method to convert decimal to binary
    public static String decimalToBinaryIterative(int n) {
        // Special case for 0
        if (n == 0) {
            return "0";
        }
        
        // Use StringBuilder to build binary number
        StringBuilder binary = new StringBuilder();
        
        // Continue until number becomes 0
        while (n > 0) {
            // Add remainder (0 or 1) to the front of the string
            binary.insert(0, n % 2);
            // Divide number by 2
            n = n / 2;
        }
        
        return binary.toString();
    }

    // Main method to test and show results
    public static void main(String[] args) {
        int[] testNumbers = {0, 5, 10, 15, 42, 100};
        
        System.out.println("Recursive Decimal to Binary:");
        for (int num : testNumbers) {
            System.out.println(num + " = " + decimalToBinaryRecursive(num));
        }
        
        System.out.println("\nIterative Decimal to Binary:");
        for (int num : testNumbers) {
            System.out.println(num + " = " + decimalToBinaryIterative(num));
        }
    }
}
