class MaximumProfit_FutureDays 
{
    // Method to calculate the maximum profit from stock prices
    public static int maxProfit(int[] prices) 
    {
        // Initialize Min to the maximum possible integer value
        int Min = Integer.MAX_VALUE;
        // Initialize Max to the minimum possible integer value
        int Max = Integer.MIN_VALUE;

        // Iterate through the array of prices
        for (int i = 0; i < prices.length; i++) 
        {
            // Update Min if the current price is lower than the current Min
            if (prices[i] < Min) 
            {
                Min = prices[i]; // Found a new minimum price
            }

            // Calculate the potential profit if sold at the current price
            int potentialProfit = prices[i] - Min;

            // Update Max if the potential profit is greater than the current Max
            if (potentialProfit > Max) 
            {
                Max = potentialProfit; // Found a new maximum profit
            }
        }

        // Return the maximum profit found
        return Max;
    }

    public static void main(String[] args) 
    {
        // Example array of stock prices
        int prices[] = {7, 1, 5, 3, 6, 4};
        // Call the maxProfit method and print the result
        System.out.println(maxProfit(prices)); // Output the maximum profit
    }
}