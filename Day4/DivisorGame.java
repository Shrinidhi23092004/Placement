class DivisorGame 
{
    // This method determines if the player can win the Divisor Game
    // based on the given integer n.
    public static boolean divisorgame(int n) 
    {
        // The player wins if n is even, as they can always make a move
        // that leaves an odd number for the opponent.
        return n % 2 == 0; // Returns true if n is even, false if odd.
    }

    public static void main(String[] args)
    {
        // Initialize n with a value of 2 for testing the divisorgame method.
        int n = 2;

        // Print the result of the divisorgame method for the given n.
        // This will output 'true' since 2 is even.
        System.out.println(divisorgame(n));
    }
}