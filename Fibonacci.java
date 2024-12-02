public class Fibonacci {
    
    public static int fibonacciRecursive(int n) {
       
        if (n <= 1) {
            return n;
        }
        
      
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    
    public static int fibonacciIterative(int n) {
        
        if (n <= 1) {
            return n;
        }
        
        
        int a = 0;  
        int b = 1;  
        int result = 0;
        
        
        for (int i = 2; i <= n; i++) {
            result = a + b; 
            a = b;           
            b = result;      
        }
        
        return result;
    }

   
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
