// Java program to compute the postfix sum (suffix sum) of fuel data
import java.util.Arrays; // Import Arrays class for printing arrays
class postfixSUM {
    public static void main(String[] args) {
        // Input array representing fuel consumption at different checkpoints
        int Fuel[] = {5, 10, 3, 7, 8};  
        int size = Fuel.length; // Get the size of the fuel array

        // Output array to store the postfix sum (cumulative sum from the end)
        int PostfixSum[] = new int[size];  

        int sum = 0; // Variable to keep track of cumulative sum from the end

        // Compute the postfix sum (suffix sum) by iterating from the last element to the first
        for (int index = size - 1; index >= 0; index--) {
            sum += Fuel[index]; // Add current value to total sum
            PostfixSum[index] = sum; // Store cumulative sum in PostfixSum array
        }

        // Print the original fuel array
        System.out.print("Fuel[]: ");
        System.out.println(Arrays.toString(Fuel));

        // Print the computed postfix sum array
        System.out.print("PostfixSum[]: ");
        System.out.println(Arrays.toString(PostfixSum));
    }
}
