// Java program to compute the prefix sum of sales data
import java.util.Arrays;
class PrefixSumSales {
    public static void main(String[] args) {
        // Input array representing sales at each hour of the day
        int Sales[] = {10, 20, 15, 30, 25};  
        int size = Sales.length; // Get the size of the sales array

        // Output array to store the prefix sum
        int PrefixSum[] = new int[size];  

        int sum = 0; // Variable to keep track of cumulative sales

        // Compute the prefix sum
        for (int index = 0; index < size; index++) {
            sum += Sales[index]; // Add current hour's sales to total sum
            PrefixSum[index] = sum; // Store cumulative sum in PrefixSum array
        }

        // Print the original sales array
        System.out.print("Sales[]: ");
        System.out.println(Arrays.toString(Sales));

        // Print the computed prefix sum array
        System.out.print("PrefixSum[]: ");
        System.out.println(Arrays.toString(PrefixSum));
    }
}
