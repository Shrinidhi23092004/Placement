public class ReverseString 
{
    public static void main(String[] args)
    {
        String str="backward";
        int size=str.length();
        for(int index=size-1;index>=0;index--)
        {
            System.out.print(str.charAt(index));
        }
    }
}
