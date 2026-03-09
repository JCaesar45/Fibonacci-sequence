public class Fibonacci {
    
    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        
        long prev = 0;
        long curr = 1;
        
        for (int i = 2; i <= n; i++) {
            long temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        
        return curr;
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacci(2));   // 1
        System.out.println(fibonacci(3));   // 2
        System.out.println(fibonacci(5));   // 5
        System.out.println(fibonacci(10));  // 55
    }
}
