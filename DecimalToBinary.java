public class DecimalToBinary {
    
    public static String decimalToBinaryRecursive(int n) {
       
        if (n <= 1) {
            return String.valueOf(n);
        }
        
       
        return decimalToBinaryRecursive(n / 2) + (n % 2);
    }

   
    public static String decimalToBinaryIterative(int n) {
       
        if (n == 0) {
            return "0";
        }
        
       
        StringBuilder binary = new StringBuilder();
        
    
        while (n > 0) {
            
            binary.insert(0, n % 2);
            
            n = n / 2;
        }
        
        return binary.toString();
    }

    
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
