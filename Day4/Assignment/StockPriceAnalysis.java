import java.util.Arrays;

public class StockPriceAnalysis 
{
    public static int findNextGreater(int[] arr, int index, int n) 
    {
        if (index == n - 1) 
        {
            return -1; // No next element exists for the last index
        }

        // Find next greater element in the remaining array
        for (int j = index + 1; j < n; j++) 
        {
            if (arr[j] > arr[index]) 
            {
                return arr[j]; // Return the first greater element found
            }
        }

        return -1; // No greater element found
    }

    public static void nextGreaterRecursive(int[] arr, int index, int[] result) 
    {
        if (index >= arr.length) 
        {
            return; // Base case: Stop when index goes beyond the array length
        }

        result[index] = findNextGreater(arr, index, arr.length);

        // Recursive call for the next index
        nextGreaterRecursive(arr, index + 1, result);
    }

    public static void main(String[] args) 
    {
        int[] arr1 = {6, 8, 0, 1, 3};
        int[] result1 = new int[arr1.length];
        nextGreaterRecursive(arr1, 0, result1);
        System.out.println(Arrays.toString(result1)); 
    }
}