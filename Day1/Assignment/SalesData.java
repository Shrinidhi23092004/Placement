class SalesData
{
    public static void main(String[] args)
    {
        // Initialize an array with sales data for each day of the week
        int sales[]={3000,4000,1000,5000,500,10000,2500};
         // Store the size of the sales array
        int size=sales.length;
        // Variable to track the index of the highest sales day
        int i=0;
        // Initialize Max with the smallest possible integer value
        int Max=Integer.MIN_VALUE;
        // Iterate through the sales array to find the highest sales day
        for(int index=0;index < size;index++)
        {
            if(sales[index]>Max)// Check if the current day's sales are higher than Max
            {
                Max=sales[index]; // Update Max with the new highest sales value
                i=index; // Store the index of the highest sales day
            }
        }
        // Print the day with the highest sales (adding 1 since array index starts from 0)
        System.out.println("The day with Highest sales is :Day "+(i+1));
    }
}