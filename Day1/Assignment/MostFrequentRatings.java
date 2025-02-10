public class MostFrequentRatings {
    public static void main(String[] args) 
    {
        // Array of product ratings
        int[] ratings = {5, 4, 3, 5, 2, 5, 4, 3, 3, 3};
        
        // Variables to store the most frequent rating and its count
        int maxCount = 0;
        int mostFrequent = ratings[0];
        int size = ratings.length;

        // Iterate through each rating in the array
        for (int i = 0; i < size; i++) 
        {
            int count = 0;
            
            // Count occurrences of the current rating
            for (int j = 0; j < size; j++) {
                if (ratings[i] == ratings[j]) {
                    count++;
                }
            }
            
            // Update most frequent rating if a higher count is found
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ratings[i];
            }
        }
        
        // Print the most frequent rating
        System.out.println("The Most frequent rating is: " + mostFrequent);
    }
}
