import java.util.*;

public class MinCoinDivision 
{
    // Method to find the minimum number of coins needed to make the given amount
    public static int findmin(int[] coins, int amount) 
    {
        // Create a dp array to store the minimum coins needed for each amount
        int[] dp = new int[amount + 1];
        
        // Initialize the dp array with a value greater than the maximum possible coins needed
        Arrays.fill(dp, amount + 1);
        
        // Base case: 0 coins are needed to make the amount 0
        dp[0] = 0;

        // Iterate through each coin
        for (int coin : coins) 
        {
            // Update the dp array for all amounts that can be reached with the current coin
            for (int i = coin; i < dp.length; i++) 
            {
                // Update the dp[i] to the minimum of its current value or the value of dp[i - coin] + 1
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        // If dp[amount] is still greater than amount, it means it's not possible to form that amount
        if (dp[amount] > amount) 
        {
            return -1; // Return -1 if the amount cannot be formed
        } 
        else 
        {
            return dp[amount]; // Return the minimum number of coins needed
        }
    }

    public static void main(String[] args) {
        // Example coin denominations
        int arr[] = {1, 2, 5};
        // Amount to be formed
        int amount = 11;
        
        // Print the result of the minimum coins required to form the requested sum
        System.out.println("Minimum Coin required to get requested sum is: " + findmin(arr, amount));
    }
}