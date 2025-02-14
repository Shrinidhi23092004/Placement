import java.util.HashSet;

public class LongestSubstringWithoutRepeating 
{
    // Function to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) 
    {
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> seen = new HashSet<>(); // Set to store unique characters in the current window
        
        // Use the sliding window technique to find the longest unique substring
        while (right < s.length()) 
        {
            if (!seen.contains(s.charAt(right))) { // If the character is not in the set, add it
                seen.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1); // Update max length
                right++; // Expand the window to the right
            } else {
                seen.remove(s.charAt(left)); // Remove the leftmost character from the window
                left++; // Shrink the window from the left
            }
        }
        return maxLength; // Return the length of the longest unique substring
    }
    
    // Main function to test the lengthOfLongestSubstring function
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Output: 3
    }
}
