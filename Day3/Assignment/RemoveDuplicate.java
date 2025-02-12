class RemoveDuplicate {
    public static String removeDuplicateCharacters(String str) 
    {
        String result = ""; // String to store unique characters
        boolean[] seen = new boolean[256]; // ASCII character tracking array

        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);
            if (!seen[c]) // If the character is not seen before
            { 
                result += c; // Append it to the result
                seen[c] = true; // Mark as seen
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        String str = "banana";
        String output = removeDuplicateCharacters(str);
        System.out.println(output); 
    }
}

