class Fibonacci_DP 
{
    // Method to calculate the n-th Fibonacci number using dynamic programming
    public static int fib(int n) 
    {
        // Base case: if n is 0 or 1, return n (Fibonacci(0) = 0, Fibonacci(1) = 1)
        if (n <= 1) 
        {
            return n;
        }

        // Create an array to store Fibonacci numbers from 0 to n
        int fib[] = new int[n + 1];
        fib[0] = 0; // Fibonacci(0) is 0
        fib[1] = 1; // Fibonacci(1) is 1

        // Fill the array with Fibonacci numbers from 2 to n
        for (int i = 2; i <= n; i++) 
        {
            // Each Fibonacci number is the sum of the two preceding ones
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Return the n-th Fibonacci number
        return fib[n];
    }

    public static void main(String[] args) 
    {
        int n = 3; // Example input for which we want to calculate the Fibonacci number
        // Call the fib method and print the result
        System.out.println(fib(n)); // Output: 2 (Fibonacci(3) = 2)
    }
} 