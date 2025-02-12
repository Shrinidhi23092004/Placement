public class CountingNumbers 
{
    public static void main(String[] args)
    {
        int arr[]={2,1,4,3,1,2,5};
        int size=arr.length;
        boolean[] counted = new boolean[size];

        for(int i=0;i<size;i++)
        {   
            if(counted[i])
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    counted[j]=true;
                }
            }
            System.out.println(arr[i]+" : "+count);
        }
    }
}
