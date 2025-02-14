public class WeatherMonitoringSystem 
{
    
    public static void main(String[] args) 
    {
        int[] readings = {72, 75, 68, 80, 74};// Example sensor readings
        int target = 73;// Target temperature to find the closest readings to
        int k = 2;// The position of the closest reading to return (1-based index)
        
        // Find the k-th closest reading to the target
        int result = findKthClosest(readings, target, k);
        // Print the result
        System.out.println(k + "th closest is: " + result); // Expected Output: 74
    }

    // Method to find the k-th closest reading to the target temperature
    public static int findKthClosest(int[] readings, int target, int k) 
    {
        // Get the number of readings
        int n = readings.length;
        // Create a 2D array to store distances and original readings
        int[][] distances = new int[n][2];

        // Calculate the distance of each reading from the target
        for (int i = 0; i < n; i++) 
        {
            distances[i][0] = Math.abs(readings[i] - target); // Store the distance
            distances[i][1] = readings[i]; // Store the original reading
        }

        // Use Quickselect to find the K-th closest reading
        return quickSelect(distances, 0, n - 1, k - 1)[1]; // Return the reading part of the result
    }

    // Quickselect algorithm to find the k-th smallest element
    private static int[] quickSelect(int[][] distances, int left, int right, int k) 
    {
        // Base case: if the left and right pointers converge
        if (left == right) 
        {
            return distances[left]; // Return the only element left
        }

        // Partition the array and get the pivot index
        int pivotIndex = partition(distances, left, right);
        
        // Check if the pivot index is the k-th index we are looking for
        if (k == pivotIndex) 
        {
            return distances[k]; // Return the k-th closest reading
        } 
        else if (k < pivotIndex) 
        {
            // Recur on the left side of the pivot
            return quickSelect(distances, left, pivotIndex - 1, k);
        } 
        else 
        {
            // Recur on the right side of the pivot
            return quickSelect(distances, pivotIndex + 1, right, k);
        }
    }

    // Partition method for Quickselect
    private static int partition(int[][] distances, int left, int right) 
    {
        // Choose the rightmost element as the pivot
        int pivotDistance = distances[right][0];
        int pivotValue = distances[right][1];
        int i = left; // Pointer for the smaller element

        // Rearrange the array based on the pivot
        for (int j = left; j < right; j++) 
        {
            // If the current distance is less than the pivot distance
            // or if they are equal and the reading is less than the pivot value
            if (distances[j][0] < pivotDistance || (distances[j][0] == pivotDistance && distances[j][1] < pivotValue)) 
            {
                swap(distances, i, j); // Swap elements
                i++; // Move the pointer for the smaller element
            }
        }
        // Place the pivot in its correct position
        swap(distances, i, right);
        return i; // Return the index of the pivot
    }

    // Method to swap two elements in the distances array
    private static void swap(int[][] distances, int i, int j) 
    {
        int[] temp = distances[i]; // Temporary variable to hold one of the elements
        distances[i] = distances[j]; // Swap the elements
        distances[j] = temp; // Complete the swap
    }
}