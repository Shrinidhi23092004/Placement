import java.util.Arrays;
class MissingNumber 
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,5};
        Arrays.sort(arr);
        int index;
        for(index=0;index<arr.length;index++)
        {
            if(arr[index] != index+1) {
                break;
            }
        }
        System.out.println("First Missing Number:"+(index+1));
    }
}