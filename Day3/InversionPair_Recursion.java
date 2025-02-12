public class InversionPair_Recursion 
{
    public static int Inversion(int arr[],int index1,int index2)
    {
        if(index1>=arr.length-1)
        {
            return 0;
        }
        if(index2>=arr.length)
        {
            return Inversion(arr,index1+1,index1+2);
        }
        int count=0;
        if(index2<arr.length && arr[index1]>arr[index2])
        {
            count++;
        }
        count += Inversion(arr,index1, index2 + 1);
        
       return count;
    }
    public static void main(String[] args)
    {
        int arr[]={30,45,60,20,25};
        int result=Inversion(arr,0,1);
        System.out.println("Inversion Pair count: "+result);

    }
}

