class ClimbStairs_DP 
{
    public static int climbstairs(int n) 
    {
        // If n is 0, there is 1 way to stay at the ground level
        if (n == 0) 
        {
            return 1;
        }

        // Create an array to store the number of ways to reach each step
        int steps[] = new int[n + 1];
        steps[0] = 1; // 1 way to stay on the ground (0 steps)
        steps[1] = 1; // 1 way to climb 1 step

        // Calculate the number of ways to reach each step from 2 to n
        for (int i = 2; i <= n; i++) 
        {
            steps[i] = steps[i - 1] + steps[i - 2]; // The number of ways to reach step i
        }
        return steps[n];
    }

    public static void main(String[] args) 
    {
        int n = 5; // You can change this value to test with different numbers of stairs
        int result = climbstairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}