public class WordCounter 
{
    public static void countWordsIterative(String[] words) 
    {
        boolean[] counted = new boolean[words.length]; // Array to track counted words
        
        for (int i = 0; i < words.length; i++) 
        {
            if (counted[i]) continue; // Skip already counted words
            
            String word = words[i].toLowerCase(); // Convert word to lowercase for case insensitivity
            int count = 1; // Initialize count for the current word
            
            // Compare the current word with the remaining words in the array
            for (int j = i + 1; j < words.length; j++) 
            {
                if (word.equals(words[j].toLowerCase())) 
                {
                    count++; // Increment count if a match is found
                    counted[j] = true; // Mark duplicate as counted
                }
            }
            
            // Print the final count of the word
            System.out.println("Final count for '" + word + "': " + count);
        }
    }
    public static void main(String[] args) 
    {
        String paragraph = "the cat and the hat"; 
        String[] words = paragraph.split("\\s+"); // Split the paragraph into words based on spaces
        countWordsIterative(words); // Call the function to count words
    }
}