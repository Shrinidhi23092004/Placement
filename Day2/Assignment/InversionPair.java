// Java program to count the number of inversion pairs in an array
class InversionPair {
    public static void main(String[] args) {
        int Count = 0; // Variable to store the count of inversion pairs

        // Input array representing order processing times
        int P[] = {30, 45, 25, 60, 20};  
        int size = P.length; // Get the size of the array

        // Outer loop: Select each element one by one
        for (int i = 0; i < size - 1; i++) { 
            // Inner loop: Compare the selected element with all later elements
            for (int j = i + 1; j < size; j++) {   
                // Check if an inversion pair exists (P[i] > P[j] and i < j)
                if (P[i] > P[j]) {  
                    // Print the inversion pair
                    System.out.println("Inversion Pair: (" + P[i] + ", " + P[j] + ")");
                    Count++; // Increment the inversion count
                }
            }
        }

        // Print the total number of inversion pairs found
        System.out.println("The inversion count is " + Count); 
    }
}
