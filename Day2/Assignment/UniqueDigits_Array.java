// Java program to find unique digits from an array of numbers
class UniqueDigits_Array {
    public static void main(String[] args) {
        // Input array containing numbers
        int N[] = {1111, 222, 333, 4444, 666}; 

        // Array to track the presence of digits (0-9)
        // If a digit appears, its corresponding index is set to 1
        int uniqueDigits[] = new int[10]; 

        // Extract digits from each number in the array
        for (int i = 0; i < N.length; i++) {
            int num = N[i]; // Get the current number
            while (num > 0) { 
                int digit = num % 10; // Extract the last digit
                uniqueDigits[digit] = 1; // Mark the digit as present
                num /= 10; // Remove the last digit from the number
            }
        }

        // Print the unique digits in sorted order
        System.out.print("Unique Digits: [");

        boolean first = true; // To format output correctly with commas
        for (int i = 0; i < 10; i++) { // Iterate over possible digits (0-9)
            if (uniqueDigits[i] == 1) { // If digit was found in the input numbers
                if (!first) { 
                    System.out.print(", "); // Print comma for separation
                }
                System.out.print(i); // Print the digit
                first = false; // Mark that the first digit has been printed
            }
        }
        System.out.println("]"); 
    }
}
