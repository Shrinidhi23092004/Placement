import java.util.*;
public class GroupingAnagrams 
{
    public static List<List<String>> groupAnagrams(String[] strs) 
    {
        // HashMap to store sorted string as key and list of anagrams as value
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        // Iterate through each word in the input array
        for (String str : strs) 
        {
            // Convert string to character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // If sorted string is not present in map, add a new list
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            
            // Add the original string to the corresponding anagram group
            anagramMap.get(sortedStr).add(str);
            
        }
        
        // Return the list of grouped anagrams
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        // Input array of strings
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        // Call the method to group anagrams
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        
        // Print the grouped anagrams
        System.out.println(groupedAnagrams);
    }
}